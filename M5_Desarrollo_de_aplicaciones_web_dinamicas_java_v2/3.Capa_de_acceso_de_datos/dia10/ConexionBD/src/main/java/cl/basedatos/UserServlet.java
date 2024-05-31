package cl.basedatos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users")

public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/comidas_tipicas", "postgres", "contrasena");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM personas");
            
            while (rs.next()) {
                out.println("Rut: " + rs.getInt("rutpersona") + ", Nombre: " + rs.getString("nombre")+ ", Apellidos: " + rs.getString("apellidoPaterno")+
                		rs.getString("apellidoMaterno")+ ", Edad: " + rs.getString("edad")+"<br>");
            }
        } catch (Exception e) {
            e.printStackTrace(out);
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {};
            try { if (stmt != null) stmt.close(); } catch (Exception e) {};
            try { if (conn != null) conn.close(); } catch (Exception e) {};
        }
        out.println("</body></html>");
    }

}
