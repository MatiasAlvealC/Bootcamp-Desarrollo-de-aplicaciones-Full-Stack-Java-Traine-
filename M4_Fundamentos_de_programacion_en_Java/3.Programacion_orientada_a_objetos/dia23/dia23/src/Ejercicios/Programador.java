package Ejercicios;

public class Programador extends Persona {
	private String lenguaje;
	
	//constructor
	public Programador(String nombre,String rut, double altura,Lapiz lapiz,String lenguaje) {
		// se usa super() como metodo de herencia llamando al constructor padre
		super(nombre,rut,altura,lapiz);
		this.lenguaje = lenguaje;
	}

	@Override
	public String toString() {
		return "Programador [lenguaje=" + lenguaje + "]";
	}
}
