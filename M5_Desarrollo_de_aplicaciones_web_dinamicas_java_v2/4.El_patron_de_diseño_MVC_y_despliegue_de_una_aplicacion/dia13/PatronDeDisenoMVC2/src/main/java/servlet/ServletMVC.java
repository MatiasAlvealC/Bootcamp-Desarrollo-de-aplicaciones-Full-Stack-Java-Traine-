package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.ModeloMVC;

/**
 * Servlet implementation class ServletMVC
 */
@WebServlet("/servletMVC")
public class ServletMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletMVC() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//capturamos los parametros
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		ModeloMVC modelo_mvc = new ModeloMVC();
		modelo_mvc.setEmail(email);
		modelo_mvc.setPassword(password);
		request.setAttribute("modelo", modelo_mvc);
		RequestDispatcher rd = request.getRequestDispatcher("respuestaMVC.jsp");
		rd.forward(request, response);
	}
}
