package cl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;


import cl.model.Direccion;
import cl.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {
	
    private String jdbcURL = "jdbc:postgresql://localhost:5432/Desafios";
    private String jdbcUsername = "postgres";
    private String jdbcPassword = "nueva_contrasena";

    private static final String INSERT_USUARIOS_SQL = "INSERT INTO usuarios (correo,created_at,nick,nombre,password,peso) VALUES (?, ?, ?,?,?,?);";
    private static final String INSERT_DIRECCIONES_SQL = "INSERT INTO direcciones (nombre,numeracion,usuario_id) VALUES (?, ?,?);";
    private static final String INSERT_ROLES_USUARIOS_SQL = "INSERT INTO roles_usuarios (usuario_id) VALUES (?);";
    private static final String SELECT_USUARIOS_ID_BY_CORREO = "SELECT id FROM usuarios WHERE correo = ?";
    private static final String SELECT_USUARIOS_BY_CORREO = "SELECT * FROM usuarios WHERE correo = ?";
   

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insertUsuario(Usuario usuario,Direccion direccion) {
    	// se insert los datos del usuario
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USUARIOS_SQL);) {
            preparedStatement.setString(1, usuario.getCorreo());
            preparedStatement.setTimestamp(2, Timestamp.from(Instant.now()));
            preparedStatement.setString(3, usuario.getNick());
            preparedStatement.setString(4, usuario.getNombre());
            preparedStatement.setString(5, usuario.getPassword());
            preparedStatement.setInt(6, usuario.getPeso());
      

            preparedStatement.executeUpdate();
            
            // se insertan los datos de direcciones y roles_usuarios
            try (Connection connection2 = getConnection();
                   	PreparedStatement preparedStatement2 = connection2.prepareStatement(INSERT_DIRECCIONES_SQL);
                    PreparedStatement preparedStatement3 = connection2.prepareStatement(INSERT_ROLES_USUARIOS_SQL);
                	PreparedStatement preparedStatement4 = connection2.prepareStatement(SELECT_USUARIOS_ID_BY_CORREO)) {
            		// mediante el correo se buscar el usuario 
                		preparedStatement4.setString(1, usuario.getCorreo());
                		 int usuario_id = 0;
        	            try (ResultSet rs = preparedStatement4.executeQuery()) {
        	                // devuelve el id del usuario
        	            	if (rs.next()) {
        	                    usuario_id = rs.getInt("id");
        	                } else {
        	                    throw new SQLException("No se pudo obtener el ID del usuario.");
        	                }
        	            }
        	            
        	            // teniendo el id del usuario se agrega como clave foranea a direcciones y roles_usuarios
                       preparedStatement2.setString(1,direccion.getNombre());
                       preparedStatement2.setString(2,direccion.getNumeracion());
                       preparedStatement2.setInt(3,usuario_id);
                       
                       preparedStatement3.setInt(1,usuario_id);


                       preparedStatement2.executeUpdate();
                       preparedStatement3.executeUpdate();
                   } catch (SQLException e) {
                       printSQLException(e);
                   }
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public Usuario selectUsuario(String correo) {
        Usuario usuario = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USUARIOS_BY_CORREO)) {
            preparedStatement.setString(1, correo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String correoRecibido = rs.getString("correo");
                String created_atRecibido =rs.getString("created_at");
                String nickRecibido = rs.getString("nick");
                String nombreRecibido =rs.getString("nombre");
                String passwordRecibido = rs.getString("password");
                int pesoRecibido = rs.getInt("peso");
                //String updated_atRecibido = rs.getString("updated_at");
                
                usuario = new Usuario();           
                usuario.setCorreo(correoRecibido);
                usuario.setCreated_at(created_atRecibido);
                usuario.setNick(nickRecibido);
                usuario.setNombre(nombreRecibido);
                usuario.setPassword(passwordRecibido);
                usuario.setPeso(pesoRecibido);
                //usuario.setUpdated_at(updated_atRecibido);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return usuario;
    }
 

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}
