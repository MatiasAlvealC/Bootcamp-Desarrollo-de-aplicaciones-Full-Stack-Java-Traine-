package Interfaces;
import Interfaces.Personaje;

public class Enemigo implements Personaje {
	private int xActual;
	@Override
	public void mover(int x) {
		while (xActual < x) {
			xActual ++;
		}
	}
	
}
