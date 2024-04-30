package abstracciones;

import java.util.List;

public abstract class Carnivoro extends Animal{
	List<String> carnesFavoritas;

	public List<String> getCarnesFavoritas() {
		return carnesFavoritas;
	}

	public void setCarnesFavoritas(List<String> carnesFavoritas) {
		this.carnesFavoritas = carnesFavoritas;
	}
	
}
