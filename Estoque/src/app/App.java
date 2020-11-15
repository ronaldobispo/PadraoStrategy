package app;

import javax.swing.JOptionPane;

import operacao.Operacao;
import operacao.Operacao.TOperacao;

public class App {	
	public static void main(String[] args) {
		Object[] options = {"Venda", "Compra", "Sair"};
		int opcao = JOptionPane.showOptionDialog(
				null,
			    "Qual tipo de Operação", 
			    "Nova Operação",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    options,
			    options[2]
		);
				
		Operacao operacao;		
		if (opcao == 0)
			operacao = new Operacao(TOperacao.toSaida);
		else if (opcao == 1)
			operacao = new Operacao(TOperacao.toEntrada);
		else
			return;
		
		String qtd = JOptionPane.showInputDialog("Quantidade:");
		double quantidade = Float.parseFloat(qtd);
		
		operacao.MovimentarEstoque(quantidade);
	}
}
