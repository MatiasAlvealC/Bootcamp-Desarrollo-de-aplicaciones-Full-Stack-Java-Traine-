package dia16;
import java.util.*;
import java.util.stream.Collectors;
public class Ejercicio1 {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,4,8,5,5,10,2);
		// para ver los elementos conn stream
		numeros.stream().forEach(System.out::println);
		System.out.println(numeros);
		// map nos permite convertir un tipo de objeto en otro
		
		numeros.stream().map(n -> n*3).forEach(System.out::println);
		
		// map no los guarda, para guardar hay que crear una nueva lista
		
		List<Integer> numerosAumentados = new ArrayList<Integer>();
		numeros.stream().map(n -> n*3).forEach(numerosAumentados::add);
		System.out.println(numeros);
		System.out.println(numerosAumentados);
		
		// usando collector se puede convertir las aslidad y guardarlos
		
		List<Integer> numerosAumentados2 = numeros.stream().map(n->n*n).collect(Collectors.toList());
		System.out.println(numerosAumentados2);
		
		// predicado o filtros
		
		List<Integer> numerosAUno = numeros.stream().map(n -> 1).collect(Collectors.toList());
		System.out.println(numerosAUno);
		
		// creando un filtro
		List<Integer> numFiltrados = numeros.stream()
				.filter(x -> x>=4)
				.collect(Collectors.toList());
		System.out.println(numFiltrados);
		
		// si queremos el cuadrado de cada uno de ellos
		List<Integer> numFiltrados2= numeros.stream()
				.filter(n -> n>=4)
				.map(n -> n*n)
				.collect(Collectors.toList());
		System.out.println(numFiltrados2);
		
		// otros filtros
		// elimina los repetidos
		
		List<Integer> numerosDistintos = numeros.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(numerosDistintos);
		
		// limita los x primeros 
		List<Integer> numerosLimit = numeros.stream()
				.limit(4)
				.collect(Collectors.toList());
		System.out.println(numerosLimit);
		
		// se salta x primeros 
		List<Integer> numerosSkip = numeros.stream()
				.skip(2)
				.collect(Collectors.toList());
		System.out.println(numerosSkip);
		
		
		// 
		// 
		// Si queremos reducir los datos
		// se define el valor inicial y la operaion a realizar
		// suma
		int suma = numeros.stream().reduce(0, (a,b) ->a+b);
		System.out.println(suma);
		
		// multiplicacion
		int multiplicacion = numeros.stream().reduce(1, (a,b) ->a*b);
		System.out.println(multiplicacion);
		
		// para reducir a el numero minimo y maximo
		int max = numeros.stream().reduce(1, Integer::max);
		int min = numeros.stream().reduce(1000,Integer::min);
		System.out.println("min: " + min + "\nmax: "+ max); //10
		
		int suma2 = numeros.stream().mapToInt(Integer::intValue).sum();
		System.out.println(suma2);
	}

}
