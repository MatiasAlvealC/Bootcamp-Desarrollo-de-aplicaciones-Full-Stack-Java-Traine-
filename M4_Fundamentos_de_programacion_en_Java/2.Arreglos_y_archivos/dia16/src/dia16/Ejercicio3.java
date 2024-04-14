package dia16;
import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio3 {

	public static void main(String[] args) {
		List<String> nombres =
				Arrays.asList("Anastasia","Beatriz","Clara","Carla","Marianela","Paula","Pia");
		
		// Obtener todos los elementos que excedan los 5 caracteres
		List<String> nombres5 = nombres.stream()
				.filter(x -> x.length()>5)
				.collect(Collectors.toList());
		System.out.println(nombres5);
		
		// Utilizar map para transformar todos los nombres a minúscula
		List<String> nombresMinuscula = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
		System.out.println(nombresMinuscula);
		
		// Crear un arreglo con todos los nombres que comiencen con P
		List<String> nombresP = nombres.stream()
				.filter(x -> x.startsWith("P"))
				.collect(Collectors.toList());
		System.out.println(nombresP);
		
		// Utilizando .count, contar los elementos que empiecen con 'A', 'B' o 'C'.
		long nombresEmpiecen = nombres.stream()
				.filter(x -> x.startsWith("A") || x.startsWith("B") || x.startsWith("C"))
				.count();
		System.out.println(nombresEmpiecen);		
		// Utilizando .map, crear un arreglo con la cantidad de letras que tiene cada nombre.
		List <Integer> nombresCantidad = nombres.stream()
				.map(x -> x.length())
				.collect(Collectors.toList());
		System.out.println(nombresCantidad);
	}

}
