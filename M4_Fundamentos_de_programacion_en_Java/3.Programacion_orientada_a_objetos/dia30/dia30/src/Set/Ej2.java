package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ej2 {

	public static void main(String[] args) {
		// LinkedHashSet
		// ordena sus elementos según el orden en que se
		// insertaron en el conjunto (orden de inserción).
		Set<String> programmers = new LinkedHashSet<>();
		programmers.add("James Gosling");
		programmers.add("Martin Odersky");
		programmers.add("Rich Hickey");
		programmers.add("Larry Wall");
		programmers.add("Graydon Hoare");
		System.out.println(programmers);
	}

}
