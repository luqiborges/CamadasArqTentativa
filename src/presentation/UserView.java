package presentation;

import java.io.IOException;

import javax.swing.JOptionPane;

import business.ObjetoValor;
import business.GerenciarEntidade;

public class UserView {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjetoValor novaEntidade = new ObjetoValor();
		
		String[] gymPlans = {"3x na semana", "5x na semana"};

		novaEntidade.nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		novaEntidade.email = JOptionPane.showInputDialog("Qual é o seu email?");
		String idade = JOptionPane.showInputDialog("Qual é a sua idade?");
		if(!idade.equals("")) {
			novaEntidade.idade = Integer.parseInt(idade);
		}
		novaEntidade.cidade =JOptionPane.showInputDialog("Qual a cidade em que habita?");
		Object plano = JOptionPane.showInputDialog(null, "Qual o plano desejado?", "gymPlan", JOptionPane.QUESTION_MESSAGE, null, gymPlans , gymPlans[0]);
		novaEntidade.gymPlan = (String) plano;
		
		GerenciarEntidade.cadastrar(novaEntidade, "cliente");
		
	}

}
