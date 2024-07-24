package cl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.models.Curso;
import cl.models.Estudiante;
import cl.services.CursoService;
import cl.services.EstudianteService;



@Controller
@RequestMapping("/estudiante")
public class EstudianteController {
	@Autowired
	private EstudianteService estudianteService;
	
	 @Autowired
	 private CursoService cursoService;

	@GetMapping
	public String listarEstudiantes(Model model) {
		List<Estudiante> estudiantes = estudianteService.obtenerTodosLosEstudiantes();
		model.addAttribute("estudiantes", estudiantes);
		return "lista-estudiantes";
	}

	@GetMapping("/new")
	public String mostrarFormularioDeNuevoEstudiante(Model model) {
		model.addAttribute("estudiante", new Estudiante());
		return "formulario-estudiante";
	}

	@PostMapping
	public String guardarEstudiante(@RequestParam String nombre, @RequestParam String nombreCurso) {
		Curso curso = cursoService.obtenerOCrearCursoPorNombre(nombreCurso); // Busca o crea el curso

		Estudiante nuevoEstudiante = new Estudiante();
		nuevoEstudiante.setNombre(nombre);
		nuevoEstudiante.setCurso(curso);

		estudianteService.guardarEstudiante(nuevoEstudiante);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String mostrarFormularioDeEdicion(@PathVariable("id") Long id, Model model) {
		Estudiante estudiante = estudianteService.obtenerEstudiantePorId(id);
		model.addAttribute("estudiante", estudiante);
		return "edicion-estudiante";
	}

	@PostMapping("/update/{id}")
	public String actualizarEstudiante(@PathVariable("id") Long id, @RequestParam String nombre, @RequestParam String nombreCurso) {
	    // Buscar el estudiante por ID
	    Estudiante estudiante = estudianteService.obtenerEstudiantePorId(id);
	    // Actualizar el nombre del estudiante
	    estudiante.setNombre(nombre);

	    // Buscar o crear el curso basado en el nombre proporcionado
	    Curso curso = cursoService.obtenerOCrearCursoPorNombre(nombreCurso);
	    estudiante.setCurso(curso); // Asignar el curso al estudiante

	    // Guardar el estudiante (actualiza si ya existe)
	    estudianteService.guardarEstudiante(estudiante);
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String eliminarEstudiante(@PathVariable("id") Long id) {
		estudianteService.eliminarEstudiante(id);
		return "redirect:/";
	}
}
