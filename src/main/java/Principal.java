
public class Principal {

	public static void main(String[] args) {
		ConexaoBanco conexao = new ConexaoBanco("AED","123456","postgres");
		conexao.conectar();
		int resultado = conexao.consultar(1);
		if(resultado != 0) {
			System.out.println("Existe");
		}else {
			System.out.println("Não xiste");
		}
		conexao.desconectar();
		
	}

}
