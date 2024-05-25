package cl.desafiolatam.business;

import java.util.ArrayList;
import java.util.List;

import cl.desafiolatam.model.Habitacion;

public class HabitacionBusiness {
	// Método setea y obtiene las habitaciones existentes en una lista de objetos de
	// tipo habitacion
	public List<Habitacion> getHabitacion() {

		// Inicializacion de lista de habitaciones
		ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

		// Info habitacion 1
		Habitacion habitacion1 = new Habitacion();
		habitacion1.setId(1);
		habitacion1.setNombre("Habitacion 1, Simple");
		habitacion1.setDescripcion("Habitación Clásica con cama extragrande, vistas al océano y balcón");
		habitacion1.setImagen("https://www.sofitelbarucalablanca.com/wp-content/uploads/sites/19/2023/04/DUF_8644-v-ok-1170x780.jpg");
		habitacion1.setPrecio(10000);
		habitacion1.setHabitaciones(1);
		habitacion1.setMetraje(40);

		
		// Info habitacion 2
		Habitacion habitacion2 = new Habitacion();
		habitacion2.setId(2);
		habitacion2.setNombre("Habitacion 2, Doble-Simple");
		habitacion2.setDescripcion("Habitación Clásica con 2 camas grandes o dobles, vistas al océano y balcón");
		habitacion2.setImagen("https://cf.bstatic.com/xdata/images/hotel/max1024x768/210132920.jpg?k=0add156eb3f9b48f694fe04ec5e07ab4ab1a00f826fb0b8f45cf6d6597347f6f&o=&hp=1");
		habitacion2.setPrecio(20000);
		habitacion2.setHabitaciones(2);
		habitacion2.setMetraje(80);

		// Info habitacion 3
		Habitacion habitacion3 = new Habitacion();
		habitacion3.setId(3);
		habitacion3.setNombre("Habitacion 3, Doble-Normal");
		habitacion3.setDescripcion("Habitación Superior en planta alta con vistas al océano y 2 camas dobles");
		habitacion3.setImagen("https://www.ahstatic.com/photos/b463_ho_00_p_1024x768.jpg");
		habitacion3.setPrecio(30000);
		habitacion3.setHabitaciones(3);
		habitacion3.setMetraje(100);

		// Info habitacion 4
		Habitacion habitacion4 = new Habitacion();
		habitacion4.setId(4);
		habitacion4.setNombre("Habitacion 4, Doble-King");
		habitacion4.setDescripcion("Suite Executive en planta superiro con cama extragrande y vistas al océano");
		habitacion4.setImagen("https://cf.bstatic.com/xdata/images/hotel/max1024x768/470194367.jpg?k=f524894e1948bf192a336f69385fa12709252c616c671af5a8bf576bca7943eb&o=&hp=1");
		habitacion4.setPrecio(40000);
		habitacion4.setHabitaciones(4);
		habitacion4.setMetraje(90);

		// Info habitacion 5
		Habitacion habitacion5 = new Habitacion();
		habitacion5.setId(5);
		habitacion5.setNombre("Habitacion 5, Doble-King");
		habitacion5.setDescripcion("Suite Executive en planta superior con cama extragrande y vistas al océano");
		habitacion5.setImagen("https://cf.bstatic.com/xdata/images/hotel/max1024x768/470194367.jpg?k=f524894e1948bf192a336f69385fa12709252c616c671af5a8bf576bca7943eb&o=&hp=1");
		habitacion5.setPrecio(50000);
		habitacion5.setHabitaciones(5);
		habitacion5.setMetraje(90);

		// Info habitacion 6
		Habitacion habitacion6 = new Habitacion();
		habitacion6.setId(6);
		habitacion6.setNombre("Habitacion 6, Doble-King");
		habitacion6.setDescripcion("Suite Executive en planta superior con cama extragrande y vistas al océano");
		habitacion6.setImagen("https://www.ahstatic.com/photos/b463_ho_00_p_1024x768.jpg");
		habitacion6.setPrecio(60000);
		habitacion6.setHabitaciones(6);
		habitacion6.setMetraje(90);

		// Info habitacion 7
		Habitacion habitacion7 = new Habitacion();
		habitacion7.setId(7);
		habitacion7.setNombre("Habitacion 7, Doble-King");
		habitacion7.setDescripcion("Suite Executive en planta superior con cama extragrande y vistas al océano");
		habitacion7.setImagen("https://www.sofitelbarucalablanca.com/wp-content/uploads/sites/19/2023/04/DUF_8644-v-ok-1170x780.jpg");
		habitacion7.setPrecio(70000);
		habitacion7.setHabitaciones(7);
		habitacion7.setMetraje(90);

		// Info habitacion 8
		Habitacion habitacion8 = new Habitacion();
		habitacion8.setId(8);
		habitacion8.setNombre("Habitacion 8, Doble-King");
		habitacion8.setDescripcion("Suite Executive en planta superior con cama extragrande y vistas al océano");
		habitacion8.setImagen("https://cf.bstatic.com/xdata/images/hotel/max1024x768/210132920.jpg?k=0add156eb3f9b48f694fe04ec5e07ab4ab1a00f826fb0b8f45cf6d6597347f6f&o=&hp=1");
		habitacion8.setPrecio(80000);
		habitacion8.setHabitaciones(8);
		habitacion8.setMetraje(90);
		
		// Agrega habitaciones a lista
		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);
		habitaciones.add(habitacion3);
		habitaciones.add(habitacion4);
		habitaciones.add(habitacion5);
		habitaciones.add(habitacion6);
		habitaciones.add(habitacion7);
		habitaciones.add(habitacion8);

		// Retorno de lista de eventos
		return habitaciones;
	}
	// Método que entrega el objeto habitacion segun el id de busqueda

	public Habitacion getHabitacionbyID(Habitacion habitacion) {

		List<Habitacion> listaHabitacion = getHabitacion();

		for (int x = 0; x < listaHabitacion.size(); x++) {

			if (listaHabitacion.get(x).getId() == habitacion.getId()) {
				habitacion = listaHabitacion.get(x);
			}
		}

		// Retorno de Evento
		return habitacion;
	}

	// Método retorna el valor a pagar de una habitacion segun el valor y cantidad
	// de tickets seleccionados
	public int calculaValorCompra(int valorHabitacion, int cantidadTickets) {
		int valor = valorHabitacion * cantidadTickets;
		return valor;
	}

}
