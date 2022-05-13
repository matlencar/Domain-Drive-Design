package br.fiap.exercicio.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.fiap.exercicio.model.Pessoa;

public class TesteTamanho {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		// Ler os dados da pessoa
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso "));
		float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));

		// Ler os dados da pessoa 2
		nome = JOptionPane.showInputDialog("Digite o nome da segunda pessoa: ");
		peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da segunda pessoa: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura da segunda pessoa: "));

		// Instanciar a classe pessoa
		Pessoa pessoa1 = new Pessoa(nome, peso, altura);

		// Instanciar a classe pessoa
		Pessoa pessoa2 = new Pessoa(nome, peso, altura);

		// Comparar a altura das duas pessoas
		if (pessoa1.getAltura() > pessoa2.getAltura()) {
			System.out.println(pessoa1.getNome() + " é a pessoa mais alta.");
		} else if (pessoa1.getAltura() < pessoa2.getAltura()) {
			System.out.println(pessoa2.getNome() + " é a pessoa mais alta.");
		} else {
			System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " possuem a mesma altura ");
		}

		// Comparar o peso das duas pessoas
		if (pessoa1.getPeso() > pessoa2.getPeso()) {
			System.out.println(pessoa1.getNome() + " é a pessoa mais pesada.");
		} else if (pessoa1.getPeso() < pessoa2.getPeso()) {
			System.out.println(pessoa2.getNome() + " é a pessoa mais pesada.");
		} else {
			System.out.println(pessoa1.getNome() + " e " + pessoa2.getNome() + " possuem o mesmo peso ");
		}

	}

}
