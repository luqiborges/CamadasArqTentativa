package persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import business.ObjetoValor;

public class LeituraDataBase {
	
	public static ArrayList<ObjetoValor> leituraDataBase(){
		
		ArrayList<ObjetoValor> cadastrados = new ArrayList<ObjetoValor>();
		
		// Ler o arquivo CSV
		try {
			FileReader arq = new FileReader("database.csv");
			BufferedReader lerArq = new BufferedReader(arq);
			
			System.out.println("oi");
			
			String linha = lerArq.readLine();
			while (linha != null) {
				ObjetoValor novo = new ObjetoValor();
				novo.nome = linha.split(",")[0];
				novo.email = linha.split(",")[1];
				novo.idade = Integer.parseInt(linha.split(",")[2]);
				novo.cidade = linha.split(",")[3];
				novo.gymPlan = linha.split(",")[4];
				
				System.out.println(linha);
				
				cadastrados.add(novo);
				
				linha = lerArq.readLine();
			}
			arq.close();
			
		} catch (IOException e) {
			System.err.println("Erro na abertura do arquivo: " + e.getMessage());
		}
		
		return cadastrados;
		
	}
	
    
}
