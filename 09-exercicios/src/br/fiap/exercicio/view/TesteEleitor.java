package br.fiap.exercicio.view;

import javax.swing.JOptionPane;

public class TesteEleitor {

	public static void main(String[] args) {
		
		//Armazenar a quantidade de aleitores obrigatorios
		int totalObrigatorio =0;

		// La?o de repeti??o
		for (int i = 0; i < 3; i++) {

			// Ler a idade da pessoa
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade "));

			// Determinar a classe eleitoral
			if (idade < 16) {
				JOptionPane.showConfirmDialog(null, "N?o eleitor");
			} else if (idade >= 18 && idade < 65) {
				JOptionPane.showConfirmDialog(null, "Eleitor obrigatorio");
				totalObrigatorio++;
			}

			else {
				JOptionPane.showConfirmDialog(null, "Eleitor Facultativo");
			}
		}

		// Exibir a quantidade de eleitores obrigatorios
		JOptionPane.showMessageDialog(null, "Total obrigatorio: " + totalObrigatorio);

	}

}
