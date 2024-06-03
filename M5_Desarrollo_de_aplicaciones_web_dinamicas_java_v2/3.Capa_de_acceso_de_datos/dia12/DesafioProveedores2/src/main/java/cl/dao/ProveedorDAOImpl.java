package cl.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cl.dao.ProveedorDAO;
import cl.model.Proveedor;

public class ProveedorDAOImpl implements ProveedorDAO {
	
    private String jdbcURL = "jdbc:postgresql://localhost:5432/Desafios";
    private String jdbcUsername = "postgres";
    private String jdbcPassword = "nueva_contrasena";

    private static final String INSERT_PROVEEDORES_SQL = "INSERT INTO proveedores (nombre,rut,direccion,correo,telefono,contacto,telefono_contacto) VALUES (?, ?, ?,?,?,?,?);";
    private static final String SELECT_PROVEEDORES_BY_ID = "SELECT * FROM proveedores WHERE id = ?";
    private static final String SELECT_ALL_PROVEEDORES = "SELECT * FROM proveedores ORDER BY nombre ASC";
    private static final String DELETE_PROVEEDORES_SQL = "DELETE FROM proveedores WHERE id = ?;";
    private static final String UPDATE_PROVEEDORES_SQL = "UPDATE proveedores SET nombre = ?, rut= ?, direccion = ?, correo= ?, telefono= ?, contacto= ?, telefono_contacto= ? WHERE id = ?;";


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
    public void insertProveedor(Proveedor proveedor) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PROVEEDORES_SQL)) {
            preparedStatement.setString(1, proveedor.getNombre());
            preparedStatement.setString(2, proveedor.getRut());
            preparedStatement.setString(3, proveedor.getDireccion());
            preparedStatement.setString(4, proveedor.getCorreo());
            preparedStatement.setString(5, proveedor.getTelefono());
            preparedStatement.setString(6, proveedor.getContacto());
            preparedStatement.setString(7, proveedor.getTelefono_contacto());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    @Override
    public Proveedor selectProveedor(int id) {
        Proveedor proveedor = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PROVEEDORES_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
            	String nombre = rs.getString("nombre");
                String rut = rs.getString("rut");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String contacto = rs.getString("contacto");
                String telefono_contacto = rs.getString("telefono_contacto");
                proveedor = new Proveedor();
                proveedor.setId(id);
                proveedor.setNombre(nombre);
                proveedor.setRut(rut);
                proveedor.setDireccion(direccion);
                proveedor.setCorreo(correo);
                proveedor.setTelefono(telefono);
                proveedor.setContacto(contacto);
                proveedor.setTelefono_contacto(telefono_contacto);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return proveedor;
    }
 
    @Override
    public List<Proveedor> selectAllProveedores() {
        List<Proveedor> proveedores = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PROVEEDORES)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
            	String nombre = rs.getString("nombre");
                String rut = rs.getString("rut");
                String direccion = rs.getString("direccion");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String contacto = rs.getString("contacto");
                String telefono_contacto = rs.getString("telefono_contacto");
                Proveedor proveedor = new Proveedor();
                proveedor.setId(id);
                proveedor.setNombre(nombre);
                proveedor.setRut(rut);
                proveedor.setDireccion(direccion);
                proveedor.setCorreo(correo);
                proveedor.setTelefono(telefono);
                proveedor.setContacto(contacto);
                proveedor.setTelefono_contacto(telefono_contacto);
                proveedores.add(proveedor);

            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return proveedores;
    }
    @Override
    public boolean deleteProveedor(int id) {
        boolean rowDeleted = false;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_PROVEEDORES_SQL)) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            printSQLException(e);
        }
        return rowDeleted;
    }

    @Override
    public boolean updateProveedor(Proveedor proveedor) {
        boolean rowUpdated = false;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_PROVEEDORES_SQL)) {
            statement.setString(1, proveedor.getNombre());
            statement.setString(2, proveedor.getRut());
            statement.setString(3, proveedor.getDireccion());
            statement.setString(4, proveedor.getCorreo());
            statement.setString(5, proveedor.getTelefono());
            statement.setString(6, proveedor.getContacto());
            statement.setString(7, proveedor.getTelefono_contacto());
            statement.setInt(8, proveedor.getId());
            rowUpdated = statement.executeUpdate() > 0;
        } catch (SQLException e) {
            printSQLException(e);
        }
        return rowUpdated;
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
