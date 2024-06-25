package cl.desafiolatam.proyecto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ProyectoGestorBibliotecaApplication implements CommandLineRunner {
	private final static Logger LOG = LoggerFactory.getLogger(ProyectoGestorBibliotecaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoGestorBibliotecaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		LOG.info("Software iniciado correctamente");
	}
}
