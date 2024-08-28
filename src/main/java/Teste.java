import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {
		ConexaoBanco minhaConexao = new ConexaoBanco();
		Connection conexao = null;
		try {
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AED","postgres","123456");
			ResultSet rsProduto = conexao.createStatement().executeQuery ("select * from tab_dados_produtos");
			while (rsProduto.next()) {
				System.out.println("Codigo:" + rsProduto.getString("codigo"));
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver do banco de dados não localizado.");
		} catch (SQLException e) {
			System.out.println("Erro ao tentar acessar o banco de dados: " + e.getMessage());
		} finally {
			conexao.close();
		}
		}

	}
