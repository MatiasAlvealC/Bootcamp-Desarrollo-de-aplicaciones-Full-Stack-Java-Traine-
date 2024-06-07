package cl.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.dao.UsuarioDAO;
import cl.dao.UsuarioDAOImpl;
import cl.model.Direccion;
import cl.model.Usuario;


/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UsuarioDAO usuarioDAO;

	public void init() {
		usuarioDAO = new UsuarioDAOImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();

		try {
			switch (action) {
            case "/register":
                showNewUsuario(request, response);
                break;
            case "/login":
                showLoginForm(request, response);
                break;
            case "/registrarNewUsuario":
            	agregarUsuario(request,response);
            	break;
            case "/loginUsuario":
            	iniciarSesion(request,response);
            	break;
            case "/delete":
                deleteUsuario(request, response);
                break;
            case "/edit":
                showEditForm(request, response);
                break;
            case "/update":
                updateUsuario(request, response);
                break;
            case "/usuarios-list":
                listUsuario(request, response);
            	break;
            default:
				inicio(request, response);
				break;
			
        }
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	private void listUsuario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException  {
		HttpSession session = request.getSession(false);
	    if (session == null || session.getAttribute("usuario") == null) {
	        response.sendRedirect("login.jsp");
	        return;
	    }
		try {
		    List<Usuario> listUsuario = usuarioDAO.selectAllUsuario();
		    System.out.print(listUsuario);
		    if (listUsuario != null && !listUsuario.isEmpty()) {
		        request.setAttribute("listUsuario", listUsuario);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		        dispatcher.forward(request, response);
		    } 
		} catch (Exception e) {
		    e.printStackTrace();
		    // Redireccionar a la página de error
		    RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
	        dispatcher.forward(request, response);		}

	}
	
	private void inicio(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	
	
	
	private void showNewUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("registros.jsp");
		dispatcher.forward(request, response);
	}
	
	

	private void showLoginForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);
	}
	
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String correo = request.getParameter("correo");
		Usuario existingUsuario = usuarioDAO.selectUsuario(correo);
		Direccion existingDireccion = usuarioDAO.selectDireccion(existingUsuario.getId());
		RequestDispatcher dispatcher = request.getRequestDispatcher("edicion.jsp");
		request.setAttribute("usuario", existingUsuario);
		request.setAttribute("direccion",existingDireccion);

		dispatcher.forward(request, response);
	}
	
	
	
	private void agregarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String correo = request.getParameter("correo");
		String nick = request.getParameter("nick");
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");
		String pesoStr = request.getParameter("peso");
		String nombre_calle = request.getParameter("nombre_calle");
		String numeracionStr = request.getParameter("numeracion");
		int peso=0;
		int numeracion=0;
		boolean esValid = true;
		String mensaje = "Error:";
		if (correo == null || correo.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Correo no puede estar vacío.";
		}
		if (nick == null || nick.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Nick no puede estar vacío.";
		}
		if (nombre == null || nombre.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Nombre no puede estar vacío.";
		}
		
		if (password == null || password.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Password no puede estar vacía.";
		}
	
		if (pesoStr == null || pesoStr.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Peso no puede estar vacío.";
		} else {
			peso = Integer.parseInt(pesoStr);
		}
		if (nombre_calle == null || nombre_calle.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Calle no puede estar vacío.";
		}
		if (numeracionStr  == null || numeracionStr.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Numeración no puede estar vacío.";
		}else {
			numeracion = Integer.parseInt(numeracionStr);
		}
		
		Usuario newUsuario = new Usuario();
		Direccion newDireccion =  new Direccion();
		newUsuario.setCorreo(correo);
		newUsuario.setNick(nick);
		newUsuario.setNombre(nombre);
		newUsuario.setPassword(password);
		newUsuario.setPeso(peso);
		newDireccion.setNombre(nombre_calle);
		newDireccion.setNumeracion(numeracion);
		
		if (!esValid) {
			request.setAttribute("mensaje", mensaje);
			request.setAttribute("usuario",newUsuario);
			request.setAttribute("direccion",newDireccion);
			// Reenviar la solicitud a la misma página JSP
			RequestDispatcher dispatcher = request.getRequestDispatcher("registros.jsp");
			dispatcher.forward(request, response);
		} else {
			// validar que no exista el correo la bd
			Usuario usuarioRecibido = new Usuario();
			usuarioRecibido= usuarioDAO.selectUsuario(correo);
			if (usuarioRecibido != null) {
				// Usuario no válido, mostrar mensaje de error
	            mensaje = "Ya existe una cuenta vinculado con dicho correo";
	            request.setAttribute("mensaje", mensaje);
				request.setAttribute("usuario",newUsuario);
				request.setAttribute("direccion",newDireccion);
	            RequestDispatcher dispatcher = request.getRequestDispatcher("registros.jsp");
	            dispatcher.forward(request, response);
				} else {
					usuarioDAO.insertUsuario(newUsuario,newDireccion);
					response.sendRedirect("index.jsp?mensaje=Usuario creado exitosamente");
	        }
			
			}
	}
	
	
	private void iniciarSesion(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String correo = request.getParameter("correo");
		String password = request.getParameter("password");

		boolean esValid = true;
		String mensaje = "Error:";
		if (correo == null || correo.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Correo no puede estar vacío.";
		}
		
		if (password == null || password.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Password no puede estar vacía.";
		}
		
		Usuario usuario = new Usuario();
		
		usuario.setCorreo(correo);
		usuario.setPassword(password);
		
		
		if (!esValid) {
			request.setAttribute("mensaje", mensaje);
			request.setAttribute("usuario",usuario);
			// Reenviar la solicitud a la misma página JSP
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		} else {
			Usuario usuarioRecibido = new Usuario();
			usuarioRecibido= usuarioDAO.selectUsuario(correo);
			if (usuarioRecibido != null && usuarioRecibido.getPassword().equals(password)) {
				
				// guarda el usuario
				HttpSession session = request.getSession();
	            session.setAttribute("usuario", usuarioRecibido);

	            // Redirigir a home.jsp
	            response.sendRedirect("usuarios-list");
				//request.setAttribute("usuario", usuarioRecibido);
				//RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				
				// LISTAR LOS USUARIOS ACTUALES
				//listUsuario(request, response);
				//rd.forward(request, response);
				} else {
	            // Usuario no válido, mostrar mensaje de error en login.jsp
	            mensaje = "Correo o contraseña incorrectos.";
	            request.setAttribute("mensaje", mensaje);
	            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	            dispatcher.forward(request, response);
	        }		}

	}
	

	 private void updateUsuario(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		    String correo = request.getParameter("correo");
			String nick = request.getParameter("nick");
			String nombre = request.getParameter("nombre");
			String password = request.getParameter("password");
			String pesoStr = request.getParameter("peso");
			String nombre_calle = request.getParameter("nombre_calle");
			String numeracionStr = request.getParameter("numeracion");
			int peso=0;
			int numeracion=0;

			boolean esValid = true;
			String mensaje = "Error:";
			if (correo == null || correo.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Correo no puede estar vacío.";
			}
			if (nick == null || nick.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Nick no puede estar vacío.";
			}
			if (nombre == null || nombre.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Nombre no puede estar vacío.";
			}
			
			if (password == null || password.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Password no puede estar vacía.";
			}
		
			if (pesoStr == null || pesoStr.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Peso no puede estar vacío.";
			} else {
				peso = Integer.parseInt(pesoStr);
			}
			if (nombre_calle == null || nombre_calle.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Calle no puede estar vacío.";
			}
			if (numeracionStr == null || numeracionStr.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Numeración no puede estar vacío.";
			} else {
				numeracion = Integer.parseInt(numeracionStr);
			}
			
			Usuario newUsuario = new Usuario();
			Direccion newDireccion =  new Direccion();
			
			newUsuario.setCorreo(correo);
			newUsuario.setNick(nick);
			newUsuario.setNombre(nombre);
			newUsuario.setPassword(password);
			newUsuario.setPeso(peso);
			newDireccion.setNombre(nombre_calle);
			newDireccion.setNumeracion(numeracion);
			
			if (!esValid) {
				request.setAttribute("mensaje", mensaje);
				request.setAttribute("usuario",newUsuario);
				request.setAttribute("direccion",newDireccion);
				// Reenviar la solicitud a la misma página JSP
				RequestDispatcher dispatcher = request.getRequestDispatcher("edicion.jsp");
				dispatcher.forward(request, response);
			} else {
				usuarioDAO.updateUsuario(newUsuario,newDireccion);
		        response.sendRedirect("usuarios-list");
			}
			

	    }
	 

	    private void deleteUsuario(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        usuarioDAO.deleteUsuario(id);
	        response.sendRedirect("usuarios-list");

			}

}
