package strategies;

import javax.swing.JOptionPane;

public class ControleEstoqueSaida implements ControleEstoque {
	@Override
	public void movimentarEstoque(double quantidade) {
		JOptionPane.showMessageDialog(null, "Retirou " + String.valueOf(quantidade) + " do estoque.");
	}
}
