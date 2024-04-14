package TrabajarConDirectorios;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(Arrays.asList("Equipo 1","Equipo 2","Equipo 3","Equipo 4","Equipo 5"));
		ArrayList<String> t = new ArrayList<String>();
		for(String tempA : a){
			for(String tempB : a){
				if(tempA != tempB){
					t.add(tempA + " v.s " + tempB);
					}
			}
		}
		System.out.println(String.join("\n",t));
	}

}
