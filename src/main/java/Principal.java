
public class Principal {

	public static void main(String[] args) {
		ConexaoBanco conexao = new ConexaoBanco("AED","123456","postgres");
		conexao.conectar();
		int resultado;
		resultado = conexao.update(1,"nova descrição", 3.3);
		System.out.println(resultado);
		conexao.consultar(1);
		conexao.desconectar();
		
	}

}
	