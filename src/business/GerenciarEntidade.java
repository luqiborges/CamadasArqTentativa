package business;

import java.io.IOException;

import persistence.EscritaDataBase;

public class GerenciarEntidade {

	public static void cadastrar(ObjetoValor ov, String entidade) throws IOException{
		
		if(entidade.equals("cliente")) {
			EscritaDataBase.cadastrarNovoCliente(ov);
		}
		
	}


}
