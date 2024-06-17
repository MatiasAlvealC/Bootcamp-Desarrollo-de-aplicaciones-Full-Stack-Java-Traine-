package cl.desafiolatam.ProyectoLogs;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoLogsSpringBootApplication implements CommandLineRunner{
	
	private final static Logger LOG = LoggerFactory.getLogger(ProyectoLogsSpringBootApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoLogsSpringBootApplication.class, args);
		LOG.info("Primer Hola Mundo");
		LOG.error("Mensaje de Error");
		LOG.warn("Mensaje de advertencia");
	}
	
	@Override
	public void run(String... args) throws Exception {
		LOG.info("Se inicio el software");
	}
}
