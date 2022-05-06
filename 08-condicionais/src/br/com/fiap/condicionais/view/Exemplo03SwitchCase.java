package br.com.fiap.condicionais.view;

import javax.swing.JOptionPane;

public class Exemplo03SwitchCase {

	// Calculadora
	public static void main(String[] args) {

		// Ler dois numeros
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo numero: "));

		// a opera��o para o usuario (+, , *, /)
		String operador = JOptionPane.showInputDialog("Digite a opera��o");

		// Realizar a opera��o e exibir a resposta

		switch (operador) {

		case "+":
			JOptionPane.showMessageDialog(null, "A soma � " + (num1 + num2));
			break;

		case "*":
			JOptionPane.showMessageDialog(null, "A multiplica��o � " + (num1 * num2));
			break;

		case "/":
			JOptionPane.showMessageDialog(null, "A divis�o � " + (num1 / num2));
			break;

		case "-":
			JOptionPane.showMessageDialog(null, "A subtra��o � " + (num1 - num2));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opera��o invalida");
		}

	}

}
