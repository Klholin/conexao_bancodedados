import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) {
		
		Connection conexao = null;
		try {
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TrabalhoFinalDePesquisaSQL","postgres","123456");
			conexao.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver do banco de dados não localizado.");
		} catch (SQLException e) {
			System.out.println("Erro ao tentar acessar o banco de dados: " + e.getMessage());
		} 
		}

	}
