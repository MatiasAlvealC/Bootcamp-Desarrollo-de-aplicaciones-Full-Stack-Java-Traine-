package cl.desafio.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	private final static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String index() {
		logger.info("Acceso inicial a la aplicación");
		return "home";
	}
}
