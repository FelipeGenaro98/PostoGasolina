package postogasolina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoPosto {
	public static Connection connection;

	public boolean getConnection() {
		String server = "localhost";
		String banco = "PostoGasolina";
		String usuario = "sa";
		String senha = "sa";
		
		String conexao = "jdbc:sqlserver://"+server+";databaseName="+banco+";user="+usuario+";password="+senha+";";
		try {
			connection = DriverManager.getConnection(conexao);
			return true;
		}
		catch (SQLException erro) {
			System.out.println("Falha ao conectar: " + erro.getMessage());
			return false;
		}
	}
}
