package cl.dao;
import cl.model.Proveedor;

import java.util.List;

public interface ProveedorDAO {
	void insertProveedor(Proveedor proveedor);
	List<Proveedor> selectAllProveedores();
}
