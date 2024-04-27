package EjercicioExtra;

public class Main {

	public static void main(String[] args) {
		Carrera Geof = new Carrera("Geofisica",5,"Ciencia exacta");
		Carrera Antropo = new Carrera("Antropologia",5,"Ciencia social");
		
		Estudiante E1 = new Estudiante("Matias",22,Geof,20224545,4.4,false);
		Estudiante E2 = new Estudiante("Constanza",23,Antropo,20224444,6.5,true);
		System.out.println(E1.toString());
		System.out.println(E2.toString());
	}

}
