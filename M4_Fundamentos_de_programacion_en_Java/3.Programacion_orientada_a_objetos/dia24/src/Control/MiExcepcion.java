package Control;

public class MiExcepcion extends Exception{
	public MiExcepcion(String arg) {
		super(arg);
	}
	public String validaNulo(String arg) {
		String mensaje ="";
		if(arg == null) {
			mensaje = "campo nulo";
		}
		return mensaje;
	}
}
