package dia8;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EjercicioPropuesto2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Este es un Temporizador");
		System.out.println("Ingrese El inicio del  Temporizador: ");
		int inicio = sc.nextInt();
		System.out.println("Empezamos");
		while (inicio>0) {
			inicio--;
			System.out.println(inicio);
			try {
				TimeUnit.SECONDS.sleep(1);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Terminado!!!!!");

	}

}
