package Control;

public class Ejem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void validaEdad(String arg) {
		String mensaje = "prueba";
		try {
			if ((Integer.parseInt(arg)) >= 18) {
				System.out.println("Edad es mayor a 18 y un número"+mensaje);
			}
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage() + mensaje);
		}
	}
	public void validaaEdad(String arg) {
		try {
			if((Integer.parseInt(arg)) >=18){
				System.out.println("Edad es mayor a 18");
			}
		}catch (NumberFormatException e) {
			throw new NumberFormatException(e.getMessage());
			}
	}

}
