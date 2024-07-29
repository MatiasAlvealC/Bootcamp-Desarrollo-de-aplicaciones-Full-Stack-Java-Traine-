package cl.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import cl.models.Ciudad;
import cl.service.CiudadService;

@RestController
@RequestMapping("/api/ciudad")
public class CiudadRestController {
	@Autowired
	CiudadService ciudadService;

	@RequestMapping("")
	public List<Ciudad> index() {
		return ciudadService.getCiudades();
	}

	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public void crearCiudad(@RequestBody Ciudad ciudad) {
		ciudadService.saveCiudad(ciudad);
	}

}