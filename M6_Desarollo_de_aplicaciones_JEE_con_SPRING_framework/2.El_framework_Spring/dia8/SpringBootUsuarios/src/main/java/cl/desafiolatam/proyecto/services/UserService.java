package cl.desafiolatam.proyecto.services;

import cl.desafiolatam.proyecto.models.Useres;
import cl.desafiolatam.proyecto.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

	  @Autowired
	    private UserRepository userRepository;

	    public List<Useres> obtenerTodosLosUsuarios() {
	        return userRepository.findAll();
	    }

	    public Useres obtenerUsuarioPorId(Long id) {
	        return userRepository.findById(id).orElse(null);
	    }

	    public Useres guardarUsuario(Useres useres) {
	        return userRepository.save(useres);
	    }

	    public void eliminarUsuario(Long id) {
	        userRepository.deleteById(id);
	    }
	    
	    public Useres buscarUsuarioPorNombre(String nombre) {
	        return userRepository.findByName(nombre);
	    }
	}