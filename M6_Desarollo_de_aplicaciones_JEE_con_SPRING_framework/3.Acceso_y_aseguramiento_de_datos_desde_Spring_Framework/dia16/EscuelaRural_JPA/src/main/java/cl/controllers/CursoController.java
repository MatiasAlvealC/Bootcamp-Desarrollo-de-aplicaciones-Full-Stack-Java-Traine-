package cl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.models.Curso;
import cl.services.CursoService;


@Controller
@RequestMapping("/curso")
public class CursoController {
	@Autowired
	private CursoService cursoService;

	@GetMapping
	public String listarCursos(Model model) {
		List<Curso> cursos = cursoService.obtenerTodosLosCursos();
		model.addAttribute("cursos", cursos);
		return "lista-cursos";
	}

	@GetMapping("/new")
	public String mostrarFormularioDeNuevoCurso(Model model) {
		model.addAttribute("curso", new Curso());
		return "formulario-curso";
	}

	@PostMapping
	public String guardarCurso(@RequestParam String nombre, @RequestParam String descripcion) {
		Curso nuevoCurso = new Curso();
		nuevoCurso.setNombre(nombre);
		nuevoCurso.setDescripcion(descripcion);

		cursoService.guardarCurso(nuevoCurso);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String mostrarFormularioDeEdicion(@PathVariable("id") Long id, Model model) {
		Curso curso = cursoService.obtenerCursoPorId(id);
		model.addAttribute("curso", curso);
		return "edicion-curso";
	}

	@PostMapping("/update/{id}")
	public String actualizarCurso(@PathVariable("id") Long id, @ModelAttribute("curso") Curso curso) {
		curso.setId(id);
		cursoService.guardarCurso(curso);
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String eliminarCurso(@PathVariable("id") Long id) {
		cursoService.eliminarCurso(id);
		return "redirect:/";
	}
}