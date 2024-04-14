package TrabajarConDirectorios;
import java.io.FileReader;

public class Ejercicio2 {

	public static void main(String[] args) {
		String nombre = "C:\\Users\\matia\\eclipse-workspace\\Dia17\\src\\Data.txt";
		try {
			FileReader fr = new FileReader(nombre);
			int data = fr.read();
			String lectura = "";
			while(data != -1) {
				lectura +=(char)data;
				data = fr.read(); // leemos el siguiente caracter
			}
			System.out.println(lectura);
			fr.close();
		}
		catch (Exception e) {
			System.out.println("Excepcion leyendo fichero"+nombre+" : "+e);
		}
	}

}
