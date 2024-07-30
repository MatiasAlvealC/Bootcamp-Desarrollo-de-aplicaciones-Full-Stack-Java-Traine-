package cl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.model.Reporte;
import cl.service.ReporteService;


@RestController
@RequestMapping("/api/reportes")
public class ReporteController {
	
	@Autowired
	private ReporteService reporteService;
	


	@GetMapping
	public List<Reporte> listarReportes() {
		List<Reporte> reportes = reporteService.obtenerTodosLosReportes();
		return reportes;
	}
	@PostMapping
    public ResponseEntity<String> guardarReporte(@RequestBody Reporte reporte) {
        reporteService.guardarReporte(reporte);
        return ResponseEntity.ok("Reporte guardado con éxito");
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<String> actualizarReporte(@PathVariable("id") Long id, @RequestBody Reporte reporte) {
        Reporte reporteExistente = reporteService.obtenerReportePorId(id);
        reporteExistente.setDescripcion(reporte.getDescripcion());
        reporteService.guardarReporte(reporteExistente);
        return ResponseEntity.ok("Reporte actualizado con éxito");
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> eliminarReporte(@PathVariable("id") Long id) {
        reporteService.eliminarReporte(id);
        return ResponseEntity.ok("Reporte eliminado con éxito");
    }
}
