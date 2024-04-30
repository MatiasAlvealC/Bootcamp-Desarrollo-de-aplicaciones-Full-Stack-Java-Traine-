package Interfaces;
import Interfaces.Personaje;
import Interfaces.Jugador;

public class Protagonista implements Personaje,Jugador{
	private int xActual;
	private int yActual = 1;
	@Override
	public void mover(int x) {
		xActual = xActual + x;
	}
	
	@Override
	public void ejecutarAccion(String accion) {
		if (accion.equals("saltar") && yActual ==1) {
			saltar();
		} else if(accion.equals("avanzar")) {
			mover(1);
		}
	}

	@Override
	public void saltar() {
		// Aumentamos hasta 5
		while (yActual <5) {
			yActual++;
		}
		// cuando sea 5, dimuimos a 1 nuevamente
		while (yActual >1) {
			yActual--;
		}
	}

}
