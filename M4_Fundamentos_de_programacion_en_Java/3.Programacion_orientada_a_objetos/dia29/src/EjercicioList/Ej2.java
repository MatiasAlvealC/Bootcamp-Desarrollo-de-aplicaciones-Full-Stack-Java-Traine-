package EjercicioList;

import java.util.ArrayList;

public class Ej2 {

	public static void main(String[] args) {
		ArrayList<String> ciudades = new ArrayList<>();
		ciudades.add("Santiago");
		ciudades.add("Iquique");
		ciudades.add("Arica");
		ciudades.add("Concepción");
		ciudades.add("La Serena");
		ciudades.add("Puerto Montt");
		System.out.println(ciudades);
		//Incorporación de más ciudades desde una colección distinta llamada otrasCiudades
		// se usa addAll
		ArrayList<String> otrasCiudades = new ArrayList();
		otrasCiudades.add("Rancagua");
		otrasCiudades.add("Punta Arenas");
		ciudades.addAll(otrasCiudades);
		System.out.println(ciudades);
		
		System.out.println(ciudades.get(0));
		System.out.println(ciudades.get(4));
		
		//Para eliminar a Puerto Montt por ejemplo, se puede remover usando su posición 
		// que la número 4 al interior de la lista
		ciudades.remove(4);
		System.out.println(ciudades);
		//Para comprobar si se elimina el elemento, podemos usar el mismo método usando su nombre y este
		// nos arrojará false si no lo encontró o true si lo elimino
		ciudades.remove("Puerto Montt");
		
		// Para modificar un elemento al interior de la lista en base a su índice
		// correspondiente, podemos usar el método set().
		
		ciudades.set(2, "Talca");
		System.out.println(ciudades);
		
		// Para encontrar la cantidad exacta de elementos que contiene la lista, podemos
		// utilizar el método size().
	
		System.out.println(ciudades.size());
		
		// Para buscar en base al contenido de un elemento, podemos
		// usar el método indexOf().
		// en el caso qeu de -1 es porque no lo encontro en la lista
		System.out.println(ciudades.indexOf("Puerto Montt"));
		System.out.println(ciudades.indexOf("Santiago"));
		
		//Para buscar en base al último contenido que tuvo un elemento, 
		// podemos usar el método lastIndexOf().
		
		System.out.println(ciudades.lastIndexOf("Puerto Montt"));
		System.out.println(ciudades.lastIndexOf("Santiago"));
		
		// iterar
		
		for (String ciudad: ciudades) {
			System.out.println(ciudad);
			}
	}

}
