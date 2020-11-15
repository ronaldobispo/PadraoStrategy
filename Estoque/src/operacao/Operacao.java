package operacao;

import strategies.ControleEstoque;
import strategies.ControleEstoqueEntrada;
import strategies.ControleEstoqueSaida;

public class Operacao {
	public enum TOperacao {toEntrada, toSaida};
	
	private TOperacao tipo;
	private ControleEstoque strategyControleEstoque;
	
	public Operacao (TOperacao pTipo) {
		this.tipo = pTipo;
	}
	
	public void MovimentarEstoque(double quantidade) {
		if (this.tipo == TOperacao.toEntrada)
			strategyControleEstoque = new ControleEstoqueEntrada();
		else
			strategyControleEstoque = new ControleEstoqueSaida();
		
		strategyControleEstoque.movimentarEstoque(quantidade);
	}
}
