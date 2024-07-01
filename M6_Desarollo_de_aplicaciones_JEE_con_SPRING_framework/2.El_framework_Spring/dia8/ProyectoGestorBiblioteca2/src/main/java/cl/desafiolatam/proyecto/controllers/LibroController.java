package cl.desafiolatam.proyecto.controllers;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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

import cl.desafiolatam.proyecto.models.Libro;
import cl.desafiolatam.proyecto.models.LibroPedido;
import cl.desafiolatam.proyecto.services.LibroPedidoService;
import cl.desafiolatam.proyecto.services.LibroService;

@Controller
@RequestMapping("/biblioteca")
public class LibroController {
	@Autowired
	private LibroService libroService;	
	
	@Autowired
	private LibroPedidoService libroPedidoService;


	@GetMapping
	public String listarLibro(Model model) {
		List<Libro> libros = libroService.obtenerTodosLosLibros();
		model.addAttribute("libros", libros);
		return "lista-libros";
	}

	@GetMapping("/new")
	public String mostrarFormularioDeNuevoLibro(Model model) {
		model.addAttribute("libro", new Libro());
		return "formulario-libro";
	}

	@PostMapping
	public String guardarLibro(@RequestParam String nombre, @RequestParam String autor, @RequestParam String editorial,
			@RequestParam String disponibilidad) {
		Libro nuevoLibro = new Libro();
		nuevoLibro.setNombre(nombre);
		nuevoLibro.setAutor(autor);
		nuevoLibro.setEditorial(editorial);
		nuevoLibro.setDisponibilidad(disponibilidad);

		libroService.guardarLibro(nuevoLibro);
		return "redirect:/biblioteca";
	}

	@GetMapping("/search")
	public String buscarLibros(@RequestParam("keyword") String keyword, Model model) {
		List<Libro> libros = libroService.buscarLibrosPorNombreOAutor(keyword);
		model.addAttribute("libros", libros);
		return "lista-libros-filtrado";
	}
	

	@GetMapping("/pedir/{id}")
    public String mostrarFormularioDeSolicitud(@PathVariable("id") Long id, Model model) {
        Libro libro = libroService.obtenerLibroPorId(id);
        if (libro.getDisponibilidad().equals("Disponible")) {
        	model.addAttribute("libro", libro);
            return "formulario-pedir";
        } else {
    		return "ya-pedido";
        }
    }
	

    @PostMapping("/solicitar/{id}")
    public String pedirLibro(@PathVariable("id") Long id, @ModelAttribute("paciente") Libro libro) {
        libro.setId(id);
        LibroPedido libroPrestado = new LibroPedido();
        libroPrestado.setNombre(libro.getNombre());
        libroPrestado.setAutor(libro.getAutor());
        libroPrestado.setEditorial(libro.getEditorial());
        libroPrestado.setDisponibilidad(libro.getDisponibilidad());
        libroPrestado.setFecha(Timestamp.valueOf(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES)));
        
        libroService.guardarLibro(libro);
		libroPedidoService.guardarLibro(libroPrestado);
        return "pedido";
    }
    
	@GetMapping("/devolver/{id}")
    public String mostrarFormularioDeDevolver(@PathVariable("id") Long id, Model model) {
        Libro libro = libroService.obtenerLibroPorId(id);
        if (libro.getDisponibilidad().equals("Prestado")) {
        	model.addAttribute("libro", libro);
            return "formulario-devolver";
        } else {
    		return "ya-devuelto";
        }
    }
	

    @PostMapping("/entregar/{id}")
    public String entregarLibro(@PathVariable("id") Long id, @ModelAttribute("paciente") Libro libro) {
        libro.setId(id);
        
        
        LibroPedido libroDevuelto = new LibroPedido();
        libroDevuelto.setNombre(libro.getNombre());
        libroDevuelto.setAutor(libro.getAutor());
        libroDevuelto.setEditorial(libro.getEditorial());
        libroDevuelto.setDisponibilidad(libro.getDisponibilidad());
        libroDevuelto.setFecha(Timestamp.valueOf(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES)));

		libroPedidoService.guardarLibro(libroDevuelto);
		libro.setDisponibilidad("Disponible");
        libroService.guardarLibro(libro);
        
        return "entregado";
    }
    
	@GetMapping("/prestamos")
	public String listarLibroPedidos(Model model) {
		List<LibroPedido> librosPedidos = libroPedidoService.obtenerTodosLosLibrosPedidos();
		model.addAttribute("librosPedidos", librosPedidos);
		return "historal-prestamos";
	}

}
