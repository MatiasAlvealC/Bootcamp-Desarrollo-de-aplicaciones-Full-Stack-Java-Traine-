package cl.desafiolatam.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.desafiolatam.proyecto.models.Libro;
import cl.desafiolatam.proyecto.repositories.LibroRepository;



@Service
public class LibroService {
	@Autowired
	private LibroRepository libroRepository;

	public List<Libro> obtenerTodosLosLibros() {
		return libroRepository.findAll();
	}

	public Libro obtenerLibroPorId(Long id) {
		return libroRepository.findById(id).orElse(null);
	}

	public Libro guardarLibro(Libro libro) {
		return libroRepository.save(libro);
	}
	
	public void eliminarLibro(Long id) {
		libroRepository.deleteById(id);
	}
	public List<Libro> buscarLibrosPorNombreOAutor(String keyword) {
        return libroRepository.findByNombreOrAutor(keyword, keyword);
    }
}
