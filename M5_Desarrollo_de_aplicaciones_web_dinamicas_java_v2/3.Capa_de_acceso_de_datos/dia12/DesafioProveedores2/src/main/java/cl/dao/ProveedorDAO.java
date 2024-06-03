package cl.dao;

import cl.model.Proveedor;

import java.util.List;

public interface ProveedorDAO {
	void insertProveedor(Proveedor proveedor);
	Proveedor selectProveedor(int id);
	List<Proveedor> selectAllProveedores();
    boolean deleteProveedor(int id);
    boolean updateProveedor(Proveedor proveedor);
    
}
