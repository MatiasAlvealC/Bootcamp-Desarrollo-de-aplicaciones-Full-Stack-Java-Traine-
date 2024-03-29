package dia7;
import java.util.concurrent.TimeUnit;

public class Ejercicio1 {

	public static void main(String[] args) {
		int i = 5;
		while (i>0) { // cuando llegue a 0 termina
			System.out.printf("%d\n",i);
			i--; // en cada iteracion se resta 1
			try {
				TimeUnit.SECONDS.sleep(1);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}

}
