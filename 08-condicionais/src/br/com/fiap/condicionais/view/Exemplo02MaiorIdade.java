package br.com.fiap.condicionais.view;

import javax.swing.JOptionPane;

public class Exemplo02MaiorIdade {

	public static void main(String[] args) {

		// Ler a idade
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade "));

		if (idade >= 16 && idade < 18 || idade >= 65) {
			JOptionPane.showConfirmDialog(null, "Você é maior de idade e pode votar SE QUISER");
		} else if (idade >= 18) {
			JOptionPane.showConfirmDialog(null, "Você é obrigado a votar");
		}

		else {
			JOptionPane.showConfirmDialog(null, "Você não pode votar ainda");
		}

	}

}
