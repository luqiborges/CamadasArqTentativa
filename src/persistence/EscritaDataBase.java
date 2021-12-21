package persistence;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import business.ObjetoValor;

public class EscritaDataBase {

	public static void cadastrarNovoCliente(ObjetoValor novoCliente) throws IOException {
		
		FileWriter arquivo = new FileWriter("database.csv");
        PrintWriter gravarArq = new PrintWriter(arquivo);
        
        ArrayList<ObjetoValor> entidadesCadastradas = LeituraDataBase.leituraDataBase();
        entidadesCadastradas.add(novoCliente);
        		
        for (int i=0; i< entidadesCadastradas.size(); i++) {
            gravarArq.printf(entidadesCadastradas.get(i).nome + "," + entidadesCadastradas.get(i).email + "," + entidadesCadastradas.get(i).idade + "," + entidadesCadastradas.get(i).cidade + "," + entidadesCadastradas.get(i).gymPlan + "\n");
        }
        
        arquivo.close();
		
	}
	
}
