package Map;

import java.util.Map;
import java.util.TreeMap;

public class Ej1 {

	public static void main(String[] args) {
		// Map
		Map<String,Integer> planetas = new TreeMap<>();
		// para incorporar elementos a este TreeMap,
		// podemos utilizar el método put()
		
		planetas.put("Mercurio", 10);
		planetas.put("Venus", 20);
		planetas.put("Marte", 15);
		planetas.put("Jupiter", 50);
		System.out.println(planetas);
		
		// Para eliminar un objeto, en este caso un planeta, 
		//podemos usar el método remove()
		
		planetas.remove("Venus");
		System.out.println(planetas);
		
		// Para obtener un elemento desde Map, podemos utilizar 
		// el método get()
		
		System.out.println(planetas.get("Jupiter"));
		
		// Para ver si una clave determinada aún está presente
		//en la colección, podemos usar el método containsKey()
		// true = esta en la colleccion, false = no esta
		System.out.println(planetas.containsKey("Tierra"));
		System.out.println(planetas.containsKey("Jupiter"));
		
		// Para retornar una o más claves del Map, podemos usar 
		// el método keySet()
		
		planetas.keySet().forEach(System.out::println);
		
		// Para obtener aquellos valores de planetas que tengan
		// una distancia menor a 16 años luz, podemos usar el método 
		// entrySet()
		
		for (Map.Entry<String, Integer> entry : planetas.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key);
			System.out.println(value);
		}
	}

}
