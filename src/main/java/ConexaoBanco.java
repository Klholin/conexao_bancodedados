import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBanco {
	private String nomeBanco;
	private String senha;
	private String nomeUsuario;
	private Connection conexao;
	
	public ConexaoBanco(String nomeBanco, String senha, String nomeUsuario) {
		this.nomeBanco = nomeBanco;
		this.senha = senha;
		this.nomeUsuario = nomeUsuario;
	}
	
	public ConexaoBanco() {
		
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public void conectar () {
		this.conexao = null;
		try {
			Class.forName("org.postgresql.Driver");
			conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+this.nomeBanco,this.nomeUsuario,this.senha);
		} catch (ClassNotFoundException ex) {
			System.out.println("Driver do banco de dados não localizado.");
		} catch (SQLException e) {
			System.out.println("Erro ao tentar acessar o banco de dados: " + e.getMessage());
		}
	}
	
	public void desconectar () {
		if(this.conexao != null) {
		try {
			this.conexao.close();
		} catch (SQLException e) {System.out.println("Erro ao tentar fechar o banco de dados: " + e.getMessage());}
		this.conexao = null;
		}else{System.out.println("Não há conexão para ser encerrada");}
	}
	
	public int consultar(int codigo) {
		int retorno ;
		try {
			ResultSet rsProduto = conexao.createStatement().executeQuery ("select * from tab_dados_produtos");
			while (rsProduto.next()) {
				retorno = Integer.parseInt(rsProduto.getString("codigo"));
				if(retorno == codigo) return 1;}
		}catch(SQLException e){
			System.out.println("Erro ao tentar acessar o banco de dados: " + e.getMessage());}
		return 0;
		}

}
