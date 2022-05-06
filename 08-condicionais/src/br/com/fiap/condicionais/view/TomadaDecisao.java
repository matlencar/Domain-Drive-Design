package br.com.fiap.condicionais.view;

import javax.swing.JOptionPane;

public class TomadaDecisao {

	public static void main(String[] args) {

		String nome1 = JOptionPane.showInputDialog("Digite o seu nome");
		String nome2 = JOptionPane.showInputDialog("Digite o seu nome");

		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura "));

		if (peso > 60.00) {
			JOptionPane.showConfirmDialog(null, " A " + nome1 + " é tem mais peso que a(o)" + nome2);
		}

		else if (altura > 1.60) {
			JOptionPane.showConfirmDialog(null, " A " + nome1 + " é mais alto que a(o)" + nome2);
		}

		else if (peso > 60.00) {
			JOptionPane.showConfirmDialog(null, " A " + nome2 + " é tem mais peso que a(o)" + nome1);
		}

		else if (altura > 1.60) {
			JOptionPane.showConfirmDialog(null, " A " + nome2 + " é mais alto que a(o)" + nome1);
		}

	}

}
