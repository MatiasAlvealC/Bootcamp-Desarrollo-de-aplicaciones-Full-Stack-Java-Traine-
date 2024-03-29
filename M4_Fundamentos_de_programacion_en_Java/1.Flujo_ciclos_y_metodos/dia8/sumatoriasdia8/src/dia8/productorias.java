package dia8;

public class productorias {

	public static void main(String[] args) {
		int producto = 1;
		// es importante no inicializar el producto en 0
		int i ;
		for (i = 1; i<=10; i++) {
			producto *=i;
		}
		System.out.print(producto);
	}

}
