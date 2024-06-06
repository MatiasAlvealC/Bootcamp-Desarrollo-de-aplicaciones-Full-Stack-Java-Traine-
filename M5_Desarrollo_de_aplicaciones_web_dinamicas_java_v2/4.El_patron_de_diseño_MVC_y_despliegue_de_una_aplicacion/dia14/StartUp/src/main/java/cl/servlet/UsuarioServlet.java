package cl.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		String action = request.getParameter("action");

		try {
			switch (action) {
            case "register":
                showNewUsuario(request, response);
                break;
            case "login":
                showLoginForm(request, response);
                break;
            case "registrarNewUsuario":
            	agregarUsuario(request,response);
            	break;
            case "loginUsuario":
            	iniciarSesion(request,response);
            	break;
            default:
                inicio(request, response);
                break;
        }
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
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
	
	
	
	private void agregarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String correo = request.getParameter("correo");
		String nick = request.getParameter("nick");
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("password");
		String pesoStr = request.getParameter("peso");
		String nombre_calle = request.getParameter("nombre_calle");
		String numeracion = request.getParameter("numeracion");
		int peso=0;

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
		if (numeracion == null || numeracion.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Numeración no puede estar vacío.";
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
				
				request.setAttribute("usuario", usuarioRecibido);
				RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
				rd.forward(request, response);
				} else {
	            // Usuario no válido, mostrar mensaje de error en login.jsp
	            mensaje = "Correo o contraseña incorrectos.";
	            request.setAttribute("mensaje", mensaje);
	            RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
	            dispatcher.forward(request, response);
	        }		}

	}

}
