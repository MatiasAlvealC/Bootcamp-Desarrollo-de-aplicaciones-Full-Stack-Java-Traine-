package dia8;
import java.util.Scanner;
public class ListaHTML {

	public static void main(String[] args) {
		
		String html ="<ul>\n";
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese una cantidad de items: ");
		int items = sc.nextInt();
		
		int i = 0;
		
		while (i<items) {
			i += 1;
			html += "\t<li> item "+i+"</ln>\n";
		}
		html += "</ul>\n";
		System.out.printf(html);
	}

}
