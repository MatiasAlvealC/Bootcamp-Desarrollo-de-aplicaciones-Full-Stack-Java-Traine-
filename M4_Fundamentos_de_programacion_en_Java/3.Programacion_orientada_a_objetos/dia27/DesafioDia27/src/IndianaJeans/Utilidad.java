package IndianaJeans;

public class Utilidad {
	public static void limpiarPantalla() {
	    // Imprime 50 líneas en blanco para "limpiar" la consola
	    for (int i = 0; i < 50; i++) {
	        System.out.println();
	    }
	}

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
