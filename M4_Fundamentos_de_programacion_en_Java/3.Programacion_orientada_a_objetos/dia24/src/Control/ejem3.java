package Control;

import java.sql.Connection;

public class ejem3 {

	public static void main(String[] args) {
		Connection cn = null;
		try {
			cn = fuenteDeDatos.getConnection();
		}catch(Exception e) {
			System.err.out("Ha ocurrido un error");
		}finally {
			cn.close();
		}

	}

}
