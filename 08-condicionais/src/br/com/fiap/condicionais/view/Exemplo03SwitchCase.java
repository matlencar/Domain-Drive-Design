package br.com.fiap.condicionais.view;

import javax.swing.JOptionPane;

public class Exemplo03SwitchCase {

	// Calculadora
	public static void main(String[] args) {

		// Ler dois numeros
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um segundo numero: "));

		// a operação para o usuario (+, , *, /)
		String operador = JOptionPane.showInputDialog("Digite a operação");

		// Realizar a operação e exibir a resposta

		switch (operador) {

		case "+":
			JOptionPane.showMessageDialog(null, "A soma é " + (num1 + num2));
			break;

		case "*":
			JOptionPane.showMessageDialog(null, "A multiplicação é " + (num1 * num2));
			break;

		case "/":
			JOptionPane.showMessageDialog(null, "A divisão é " + (num1 / num2));
			break;

		case "-":
			JOptionPane.showMessageDialog(null, "A subtração é " + (num1 - num2));
			break;

		default:
			JOptionPane.showMessageDialog(null, "Operação invalida");
		}

	}

}
