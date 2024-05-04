package Ejercicio;

public class InstitutoEducativo {
	private static InstitutoEducativo instance;
	
	// privatizamos el contructor
	private InstitutoEducativo() {}
	
	// para utilizar la unica instancia de la clase se debe usar
	// el metodo getInstance().
	// crea la condicion if que solo será true la primera vez
	public static InstitutoEducativo getInstance() {
		if (instance == null) {
			instance = new InstitutoEducativo();
		}
		return instance;
	}
}
