package cl.desafiolatam.proyecto.servicios;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.desafiolatam.proyecto.model.Usuario;

@Service
public class UsuarioServices {

	public List<Usuario> buscarUsuarios(){
		Usuario user1 = new Usuario("Pedro","p@gmail.com",30);
		Usuario user2 = new Usuario("Juan","j@hotmail.com",25);
		
		List<Usuario> lista = Arrays.asList(user1,user2);
		return lista;
	}
}
