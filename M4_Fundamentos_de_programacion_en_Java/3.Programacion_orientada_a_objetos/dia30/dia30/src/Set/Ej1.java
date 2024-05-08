package Set;

import java.util.HashSet;
import java.util.Set;

public class Ej1 {

	public static void main(String[] args) {
		// Set del tipo String, cuyo nombre será capitales e 
		// instanciamos como una HashSet.
		// uno de los atributos de set es que no se repiten elementos
		
		Set<String> languages = new HashSet<>();
		languages.add("Java");
		languages.add("Go");
		languages.add("Erlang");
		languages.add("Java");
		languages.add("Elixir");
		languages.add("Fortran");
		System.out.println(languages);
	}

}
