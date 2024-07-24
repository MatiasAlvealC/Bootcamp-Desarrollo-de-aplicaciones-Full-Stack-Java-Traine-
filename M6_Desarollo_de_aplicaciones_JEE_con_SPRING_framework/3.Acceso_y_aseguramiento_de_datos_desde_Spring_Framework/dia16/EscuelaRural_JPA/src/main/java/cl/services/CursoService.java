package cl.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.models.Curso;
import cl.repositories.CursoRepository;
import jakarta.transaction.Transactional;

@Service
public class CursoService {
	@Autowired
	private CursoRepository cursoRepository;

	public List<Curso> obtenerTodosLosCursos() {
		return cursoRepository.findAll();
	}

	public Curso obtenerCursoPorId(Long id) {
		return cursoRepository.findById(id).orElse(null);
	}

	public Curso guardarCurso(Curso curso) {
		return cursoRepository.save(curso);
	}
	
	public void eliminarCurso(Long id) {
		cursoRepository.deleteById(id);
	}
	
	@Transactional
    public Curso obtenerOCrearCursoPorNombre(String nombre) {
        Curso curso = cursoRepository.findByNombre(nombre);
        if (curso == null) {
            curso = new Curso();
            curso.setNombre(nombre);
            // Puedes establecer otras propiedades del curso si es necesario
            curso = cursoRepository.save(curso);
        }
        return curso;
    }
}
