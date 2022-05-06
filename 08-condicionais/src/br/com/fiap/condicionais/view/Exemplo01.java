package br.com.fiap.condicionais.view;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {

		// Ler um numero e verificar se é par

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));

		if (numero % 2 == 0) {
			JOptionPane.showConfirmDialog(null, "O numero é par");
		} else {
			JOptionPane.showConfirmDialog(null, "O numero é impar");
		}
		
	}

}
