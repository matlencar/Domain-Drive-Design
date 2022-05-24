package br.fiap.exercicio.view;

import javax.swing.JOptionPane;

public class Vogal {

	public static void main(String[] args) {
		//Ler uma palavra
		String palavra = JOptionPane.showInputDialog("Digite uma palavra");

		String vogais = "aeiou";
		//Percorrer cada caractere da variável vogais (Laço com a qtd de caracteres)
		for (int i = 0; i < vogais.length(); i++) {
			//Trocar a vogal por "*"
			palavra = palavra.replace(vogais.charAt(i), '*');
		}
		
//		String churros = "";
//		char genero = 'o';
		
		//Exibir a palavra
		JOptionPane.showMessageDialog(null, palavra);
	}
}
