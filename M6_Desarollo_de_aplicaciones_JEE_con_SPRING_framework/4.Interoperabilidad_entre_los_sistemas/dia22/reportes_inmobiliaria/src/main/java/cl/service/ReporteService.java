package cl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.model.Reporte;
import cl.repositories.ReporteRepository;


@Service
public class ReporteService {
	@Autowired
	private ReporteRepository reporteRepository;

	public List<Reporte> obtenerTodosLosReportes() {
		return reporteRepository.findAll();
	}

	public Reporte obtenerReportePorId(Long id) {
		return reporteRepository.findById(id).orElse(null);
	}

	public Reporte guardarReporte(Reporte reporte) {
		return reporteRepository.save(reporte);
	}
	
	public void eliminarReporte(Long id) {
		reporteRepository.deleteById(id);
	}
}
