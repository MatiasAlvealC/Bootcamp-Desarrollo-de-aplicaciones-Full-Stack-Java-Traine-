package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Operaciones;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Leer los datos ingresados del formulario HTML
		String strNum1 = request.getParameter("num1");
		String strNum2 = request.getParameter("num2");

		// Verificar si los parámetros son enteros
		try {
			// Intenta convertir las cadenas a enteros
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			String operacion = request.getParameter("operacion");
			
			// Crear un objeto de la clase Operaciones
            Operaciones op = new Operaciones();
			int resultado = 0;
			String mensaje = "";

			switch (operacion) {
			case "suma":
				resultado = op.getSuma(num1, num2);
				mensaje = "La suma es " + resultado;
				break;
			case "resta":
				resultado = op.getResta(num1, num2);
				mensaje = "La resta es " + resultado;
				break;
			case "mult":
				resultado = op.getMultiplicacion(num1, num2);
				mensaje = "La multiplicación es " + resultado;
				break;
			case "divi":
				if (num2 != 0) {
					double resultado2 = op.getDivision(num1, num2);
					mensaje = "La división es " + resultado2;
				} else {
					mensaje = "No se puede dividir por cero.";
				}
				break;
			case "ordenar":
				int[] ordenados = op.getOrdenar(num1, num2);
				mensaje = "Los números ordenados son: " + ordenados[0] + " - " + ordenados[1];
				break;
			case "parImpar":
				mensaje = "Número 1 (" + num1 + ") es " + op.getParImpar(num1) + " y Número 2 (" + num2 + ") es "
						+ op.getParImpar(num2);
				break;
			default:
				mensaje = "Operación no válida.";
			}
			// Para fijar la variable
            request.setAttribute("mensaje", mensaje);

            // Reenviar la solicitud a la misma página JSP
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
		} catch (NumberFormatException e) {
			// Redireccionar a la pagina de error
			response.sendRedirect("error.html");
		}
	}
}
