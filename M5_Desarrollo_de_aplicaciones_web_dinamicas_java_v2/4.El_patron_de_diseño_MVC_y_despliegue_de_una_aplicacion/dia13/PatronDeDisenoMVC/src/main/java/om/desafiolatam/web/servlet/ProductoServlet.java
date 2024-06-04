package om.desafiolatam.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.web.MGR.Impl.ProductoMGRImpl;

@WebServlet("/producto")
public class ProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ProductoServlet() {
		super();
	}

	protected void processRequest(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		ProductoMGRImpl productoMgrImpl = new
		ProductoMGRImpl();
		String value = request.getParameter("id");
		if (value != null) {
			int id = Integer.parseInt(value);
			request.setAttribute("producto", productoMgrImpl.getProducto(id));
		} else {
			request.setAttribute("lista_productos", productoMgrImpl.getProductos());
		}
		getServletConfig().getServletContext().getRequestDispatcher("/producto.jsp").forward(request,response);
}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}
}