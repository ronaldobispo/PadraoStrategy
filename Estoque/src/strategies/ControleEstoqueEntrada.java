package strategies;

import javax.swing.JOptionPane;

public class ControleEstoqueEntrada implements ControleEstoque {
	@Override
	public void movimentarEstoque(double quantidade) {
		JOptionPane.showMessageDialog(null, "Adicionou " + String.valueOf(quantidade) + " ao estoque.");
	}
}
