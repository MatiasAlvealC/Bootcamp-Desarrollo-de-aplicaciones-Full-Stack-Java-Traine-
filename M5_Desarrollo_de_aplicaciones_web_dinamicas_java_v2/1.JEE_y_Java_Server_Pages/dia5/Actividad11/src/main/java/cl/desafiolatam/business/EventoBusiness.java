package cl.desafiolatam.business;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.model.*;

public class EventoBusiness {

	/**
	 * --------------------------------------------------------------------------------------------
	 * Método setea y obtiene los eventos existentes en una lista de objetos de tipo
	 * evento
	 * 
	 * @param -
	 * @return List<Evento>
	 * @author: Autor <autor@desafiolatam.com>
	 * @version: 23/08/2022
	 */
	public List<Evento> getEventos() {

		// Inicializacion de lista de eventos
		ArrayList<Evento> eventos = new ArrayList<Evento>();

		// Info Evento 1
		Evento evento1 = new Evento();
		evento1.setId(1);
		evento1.setNombre("Metallica");
		evento1.setDescripcion("Descripción Uno");
		evento1.setImagen(
				"https://media.gettyimages.com/id/531257207/es/foto/american-heavy-metal-group-metallica-uk-1985-left-to-right-lead-guitarist-kirk-hammett-singer.webp?s=1024x1024&w=gi&k=20&c=J2aR2aTRNRUedH0d0V-PU3HQVrBp7_FiRLFPObiGdP4=");
		evento1.setPrecio(10000);
		evento1.setLugar("Estadio Nacional");
		evento1.setMapa(
				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d-33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Evento 2
		Evento evento2 = new Evento();
		evento2.setId(2);
		evento2.setNombre("Fiestas Patrias");
		evento2.setDescripcion("Descripción Dos");
		evento2.setImagen("https://img.freepik.com/vector-gratis/fondo-plano-fiestas-patrias-chile_23-2149539845.jpg");
		evento2.setPrecio(20000);
		evento2.setLugar("parque O'higgins");
		evento2.setMapa(
				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d-33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Evento 3
		Evento evento3 = new Evento();
		evento3.setId(3);
		evento3.setNombre("Iron Maiden");
		evento3.setDescripcion("Descripción Tres");
		evento3.setImagen(
				"data:image/jpeg;base64,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");
		evento3.setPrecio(30000);
		evento3.setLugar("Estadio Monumental");
		evento3.setMapa(
				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d-33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Info Evento 4
		Evento evento4 = new Evento();
		evento4.setId(4);
		evento4.setNombre("Delfín Hasta el Fin!");
		evento4.setDescripcion("Descripción Cuatro");
		evento4.setImagen(
				"https://www.prensalibre.com/wp-content/uploads/2021/11/Delfin-1.jpg?quality=52&w=760&h=430&crop=1");
		evento4.setPrecio(40000);
		evento4.setLugar("Centro de Eventos Amanda");
		evento4.setMapa(
				"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3328.411793967857!2d-70.61286488437952!3d-33.46462808076988!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9662cfed639ab813%3A0xb92488060556a1df!2sEstadio%20Nacional%20Julio%20Mart%C3%ADnez%20Pr%C3%A1danos!5e0!3m2!1ses!2scl!4v1661265818941!5m2!1ses!2scl");

		// Agrega Eventos a lista
		eventos.add(evento1);
		eventos.add(evento2);
		eventos.add(evento3);
		eventos.add(evento4);

		// Retorno de lista de eventos
		return eventos;
	}

	/**
	 * --------------------------------------------------------------------------------------------
	 * Método que entrega el objeto evento segun el id de busqueda
	 * 
	 * @param Evento evento
	 * @return Evento evento
	 * @author: Autor <autor@desafiolatam.com>
	 * @version: 23/08/2022
	 */
	public Evento getEventobyID(Evento evento) {

		List<Evento> listaEventos = getEventos();

		for (int x = 0; x < listaEventos.size(); x++) {

			if (listaEventos.get(x).getId() == evento.getId()) {
				evento = listaEventos.get(x);
			}
		}

		// Retorno de Evento
		return evento;
	}

	/**
	 * --------------------------------------------------------------------------------------------
	 * Método retorna el valor a pagar de un evento segun el valor y cantidad de
	 * tickets seleccionados
	 * 
	 * @param int valorEvento, int cantidadTickets
	 * @return int valor
	 * @author: Autor <autor@desafiolatam.com>
	 * @version: 23/08/2022
	 */
	public int calculaValorCompra(int valorEvento, int cantidadTickets) {
		int valor = valorEvento * cantidadTickets;
		return valor;
	}

}
