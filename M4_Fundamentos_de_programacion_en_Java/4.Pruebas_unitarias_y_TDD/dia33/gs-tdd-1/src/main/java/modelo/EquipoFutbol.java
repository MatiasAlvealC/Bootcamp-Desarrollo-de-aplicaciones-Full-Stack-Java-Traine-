package modelo;

public class EquipoFutbol {
	private int juegosGanados;
	private int juegosEmpatados;
	private int juegosPerdidos;
	
	public EquipoFutbol(int juegosGanados,int juegosEmpatados, int juegosPerdidos) {
		this.juegosGanados = juegosGanados;
		this.juegosEmpatados = juegosEmpatados;
		this.juegosPerdidos = juegosPerdidos;
	}
	public int getJuegosGanados() {
		return juegosGanados;
	}
	
	public int getJuegosEmpatados() {
		return juegosEmpatados;
	}
	
	public int getJuegosPerdidos() {
		return juegosPerdidos;
	}
}
