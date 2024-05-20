package cl.desafiolatam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cl.desafiolatam.utiles.UtilesGeneral;
/**
 * Servlet implementation class ObtenerEfemerides
 */
@WebServlet("/ObtenerEfemerides")
public class ObtenerEfemerides extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ObtenerEfemerides() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int numMes = Integer.parseInt(request.getParameter("mes"));
		UtilesGeneral utilesgeneral = new UtilesGeneral();
		String efemedires = utilesgeneral.getEfemeridesMes(numMes);
		response.getWriter().append(efemedires);	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
