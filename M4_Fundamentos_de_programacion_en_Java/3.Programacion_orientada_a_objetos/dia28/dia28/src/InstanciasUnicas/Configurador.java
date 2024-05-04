package InstanciasUnicas;

public class Configurador {
	// variable encapsulada y estática donde se almacenará la instancia unica
	private static Configurador config;
	
	// constructor privado
	private Configurador() {
	}
	// método estático encapsulador para acceder a la instancia única
	public static Configurador getConfig() {
		synchronized(Configurador.class){
			if (config == null) {
				config =  new Configurador();
				System.out.println("Instancia creada");
			}
		}
		System.out.println("Llamada al Configurador");
		return config;
	}
}
