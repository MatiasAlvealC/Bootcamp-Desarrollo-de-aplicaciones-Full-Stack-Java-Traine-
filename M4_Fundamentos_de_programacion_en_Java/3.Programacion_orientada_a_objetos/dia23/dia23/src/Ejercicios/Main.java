package Ejercicios;

public class Main {

	public static void main(String[] args) {
		
		// creamos un objeto programador
		// pero previamente debemos crear el objetio del tipo Lapiz dado que es uno de los atributos
		
		Lapiz lapiz1 = new Lapiz("grafito");
		Programador programador1 =  new Programador("Angel","26456456-9",1.79,lapiz1,"Java");
		
		System.out.println(programador1.getNombre());
		System.out.println(programador1.getRut());
		System.out.println(programador1.getLapiz().getNombre());
	}

}
