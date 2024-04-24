package Modelo;

public class AutoMain {

	public static void main(String[] args) {
		
		Auto miPrimerObjeto = new Auto();
		miPrimerObjeto.color = "Rojo";
		miPrimerObjeto.marca = "Audi";
		System.out.println(miPrimerObjeto.color);
		
		Auto miSegundoObjeto = new Auto();
		miSegundoObjeto.color = "Gris plateado";
		miSegundoObjeto.marca = "Mazda";
		System.out.println(miSegundoObjeto.marca);
		System.out.println(miPrimerObjeto.toString());

	}

}
