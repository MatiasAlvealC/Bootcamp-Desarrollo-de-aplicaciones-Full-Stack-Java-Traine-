package cl.basedatos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/agregarPersona")
public class AgregarPersonaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String rut = request.getParameter("rutPersonas");
        String nombre = request.getParameter("nombre");
        String apellidoPaterno= request.getParameter("apellidoPaterno");
        String apellidoMaterno= request.getParameter("apellidoMaterno");
        int edad = Integer.parseInt(request.getParameter("edad"));
        // Validación de parámetros
        if (rut == null || rut.isEmpty() ) {
            out.println("<html><body>");
            out.println("El rut es requeridos.");
            out.println("</body></html>");
            return;
        }

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Obtener la conexión a la base de datos desde el singleton
            conn = DatabaseConnection.getInstance().getConnection();
            String sql = "INSERT INTO personas (rut,nombre, apellidoPaterno, apellidoMaterno,edad) VALUES (?, ?, ?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, rut);
            pstmt.setString(2, nombre);
            pstmt.setString(3, apellidoPaterno);
            pstmt.setString(4, apellidoMaterno);
            pstmt.setInt(5, edad);
            int rows = pstmt.executeUpdate();

            out.println("<html><body>");
            if (rows > 0) {
                out.println("Persona agregado exitosamente.");
            } else {
                out.println("No se pudo agregar la persona.");
            }
            out.println("</body></html>");

        } catch (SQLException e) {
            e.printStackTrace(out);
        } finally {
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {};
        }
    }
}
