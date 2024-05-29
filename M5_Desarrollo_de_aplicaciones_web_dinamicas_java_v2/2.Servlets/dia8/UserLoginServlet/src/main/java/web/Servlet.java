package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
	//Leer los datos del formulario html
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	//Validar los datos
	if(username.equals("desafio") && password.equals("latam")){
	//Crear una cookie
		Cookie cookie = new Cookie("username", username);
		//Agregar la cookie a la respuesta
		response.addCookie(cookie);
		//Redireccionar a la pagina de exito
		response.sendRedirect("exito.html");
		}else{
		//Redireccionar a la pagina de error
		response.sendRedirect("error.html");
		}
	//Enviar los datos por consola
	System.out.println("username = " + username);
	System.out.println("password = " + password);
	//Enviar respuesta al navegador
	//PrintWriter out = response.getWriter();
	//out.print("<html>");
	//out.print("<body>");
	//out.print("El username es:" + username);
	//out.print("<br/>");
	//out.print("El password es:" + password);
	//out.print("</body>");
	//out.print("</html>");
	//out.close();
	}
}
