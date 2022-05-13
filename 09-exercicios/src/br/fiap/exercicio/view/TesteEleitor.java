package br.fiap.exercicio.view;

import javax.swing.JOptionPane;

public class TesteEleitor {

	public static void main(String[] args) {
		
		//Ler a idade da pessoa
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade "));
		
		//Determinar a classe eleitoral
		if (idade < 16) {
			JOptionPane.showConfirmDialog(null, "Não eleitor");
		} else if (idade >= 18 && idade < 65) {
			JOptionPane.showConfirmDialog(null, "Eleitor obrigatorio");
		}

		else {
			JOptionPane.showConfirmDialog(null, "Eleitor Facultativo");
		}
		
		//Exibir a quantidade de eleitores obrigatorios
		

	}

}
