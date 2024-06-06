package cl.dao;

import java.util.List;

import cl.model.Direccion;
import cl.model.Usuario;

public interface UsuarioDAO {
	void insertUsuario(Usuario usuario,Direccion direccion);
	Usuario selectUsuario(String correo);
}
