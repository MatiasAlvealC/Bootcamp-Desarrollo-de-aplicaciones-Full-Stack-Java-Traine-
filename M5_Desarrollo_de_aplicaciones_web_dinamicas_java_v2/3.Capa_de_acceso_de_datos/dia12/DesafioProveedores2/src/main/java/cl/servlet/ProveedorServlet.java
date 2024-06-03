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

import cl.dao.ProveedorDAO;
import cl.dao.ProveedorDAOImpl;
import cl.model.Proveedor;

/**
 * Servlet implementation class ProveedorServlet
 */
@WebServlet("/")
public class ProveedorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ProveedorDAO proveedorDAO;

	public void init() {
		proveedorDAO = new ProveedorDAOImpl();
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
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertProveedor(request, response);
				break;
			case "/delete":
                deleteProveedor(request, response);
                break;
            case "/edit":
                showEditForm(request, response);
                break;
            case "/update":
                updateProveedor(request, response);
                break;
			default:
				listProveedor(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listProveedor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		try {
		    List<Proveedor> listProveedor = proveedorDAO.selectAllProveedores();
		    
		    if (listProveedor != null && !listProveedor.isEmpty()) {
		        request.setAttribute("listProveedor", listProveedor);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("proveedores-lista.jsp");
		        dispatcher.forward(request, response);
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		    // Redireccionar a la página de error
		    response.sendRedirect("error.html");
		}

	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Proveedor existingProveedor = proveedorDAO.selectProveedor(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("edicion.jsp");
		request.setAttribute("proveedor", existingProveedor);
		dispatcher.forward(request, response);
	}

	private void insertProveedor(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String nombre = request.getParameter("nombre");
		String rut = request.getParameter("rut");
		String direccion = request.getParameter("direccion");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String contacto = request.getParameter("contacto");
		String telefono_contacto = request.getParameter("telefono_contacto");

		boolean esValid = true;
		String mensaje = "Error:";

		if (nombre == null || nombre.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Nombre no puede estar vacío.";
		}
		if (rut == null || rut.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- RUT no puede estar vacío.";
		}
		if (direccion == null || direccion.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Dirección no puede estar vacía.";
		}
		if (correo == null || correo.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Correo no puede estar vacío.";
		}
		if (telefono == null || telefono.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Teléfono no puede estar vacío.";
		}
		if (contacto == null || contacto.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Contacto no puede estar vacío.";
		}
		if (telefono_contacto == null || telefono_contacto.trim().isEmpty()) {
			esValid = false;
			mensaje+="\n- Teléfono de contacto no puede estar vacío.";
		}
		
		Proveedor newProveedor = new Proveedor();
		newProveedor.setNombre(nombre);
		newProveedor.setRut(rut);
		newProveedor.setDireccion(direccion);
		newProveedor.setCorreo(correo);
		newProveedor.setTelefono(telefono);
		newProveedor.setContacto(contacto);
		newProveedor.setTelefono_contacto(telefono_contacto);
		
		if (!esValid) {
			request.setAttribute("mensaje", mensaje);
			request.setAttribute("proveedor",newProveedor);
			// Reenviar la solicitud a la misma página JSP
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		} else {
			proveedorDAO.insertProveedor(newProveedor);
			response.sendRedirect("proveedores-list");	
		}
	}
	
	  private void updateProveedor(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		    String idStr = request.getParameter("id");
	        String nombre = request.getParameter("nombre");
			String rut = request.getParameter("rut");
			String direccion = request.getParameter("direccion");
			String correo = request.getParameter("correo");
			String telefono = request.getParameter("telefono");
			String contacto = request.getParameter("contacto");
			String telefono_contacto = request.getParameter("telefono_contacto");
			boolean esValid = true;
			String mensaje = "Error:";

			if (nombre == null || nombre.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Nombre no puede estar vacío.";
			}
			if (rut == null || rut.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- RUT no puede estar vacío.";
			}
			if (direccion == null || direccion.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Dirección no puede estar vacía.";
			}
			if (correo == null || correo.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Correo no puede estar vacío.";
			}
			if (telefono == null || telefono.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Teléfono no puede estar vacío.";
			}
			if (contacto == null || contacto.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Contacto no puede estar vacío.";
			}
			if (telefono_contacto == null || telefono_contacto.trim().isEmpty()) {
				esValid = false;
				mensaje+="\n- Teléfono de contacto no puede estar vacío.";
			}
			
			int id=0;
			if (idStr != null && !idStr.trim().isEmpty()) {
		        try {
		            id = Integer.parseInt(idStr);
		        } catch (NumberFormatException e) {
		            esValid = false;
		            mensaje += "\n- ID no válido.";
		        }
			}
	        Proveedor proveedor = new Proveedor();
	        proveedor.setId(id);
	        proveedor.setNombre(nombre);
			proveedor.setRut(rut);
			proveedor.setDireccion(direccion);
			proveedor.setCorreo(correo);
			proveedor.setTelefono(telefono);
			proveedor.setContacto(contacto);
			proveedor.setTelefono_contacto(telefono_contacto);

			if (!esValid) {
				request.setAttribute("mensaje", mensaje);
				request.setAttribute("proveedor",proveedor);
				// Reenviar la solicitud a la misma página JSP
				RequestDispatcher dispatcher = request.getRequestDispatcher("edicion.jsp");
				dispatcher.forward(request, response);
			} else {
				proveedorDAO.updateProveedor(proveedor);
		        response.sendRedirect("proveedores-list");
			}
			

	    }

	    private void deleteProveedor(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException {
	        int id = Integer.parseInt(request.getParameter("id"));
	        proveedorDAO.deleteProveedor(id);
	        response.sendRedirect("proveedores-list");
	    }
 
}
