package dia16;
import java.util.*;
import java.util.stream.Collectors;
public class Ejercicio2 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,9,2,10,2,4,7,4,7,1,4);
		
		// Utilizando reduce, sumar todos los valores del array

		int suma = numeros.stream().reduce(0,(a,b) -> a+b);
		System.out.println(suma);
		
		// Utilizando reduce, sumar todos los valores no repetidos del array
		int sumaDistinc= numeros.stream().distinct().reduce(0, (a,b) ->a+b);
		System.out.println(sumaDistinc);
		
		// Convertir todos los datos al tipo float
		List<Float> numerosFloat = numeros.stream()
                .map(Float::valueOf)
                .collect(Collectors.toList());
		System.out.println(numerosFloat);
		// Filtrar todos los elementos menores a 5 sin repetir
		List<Integer> numerosFiltrado=numeros.stream()
				.distinct()
				.filter(x -> x<5)
				.collect(Collectors.toList());
		System.out.println(numerosFiltrado);
		
		// Utilizando mapToInt, sumar todos los valores del arreglo
		int suma2 = numeros.stream().mapToInt(Integer::intValue).sum();
		System.out.println(suma2);
		// Utilizando .count() contar todos los elementos menores que 5
		int numerosContados = (int) numeros.stream()
				.filter(x -> x<5)
				.mapToInt(Integer::intValue).count();
		System.out.println(numerosContados);
	}

}
