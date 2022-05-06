package br.com.fiap.exercicio01.view;

import java.util.Scanner;

import br.com.fiap.exercicio01.model.Cor;
import br.com.fiap.exercicio01.model.Lancha;

public class Exercicio {

	public static void main(String[] args) {
		
		
		//Instanciar uma cor
		
		Cor azul = new Cor("Azul", 0, 0, 255);
		
		//Instanciar um Lancha
		Lancha barco = new Lancha();
		
		//Pedir valores da lancha da cor e da lancha
		
		//Instanciar o objeto que lê o teclado
		Scanner sc = new Scanner(System.in);
		
		//Ler o modelo
		System.out.println("Digite o modelo: "); //<----Estamos pedindo a informação
		String modelo = sc.next(); //<-- estamos inserindo a informação do objeto barco
		barco.setModelo(modelo);
		
		//Ler a quantidade de lugares
		System.out.println("Digite a quantidade de lugares: ");
		int lugares = sc.nextInt();
		barco.setQuantidadeLugares(lugares);
		
		//Ler o comprimento do barco
		System.out.println("Digite o comprimento: ");
		double comprimento = sc.nextDouble();
		barco.setComprimento(comprimento);
		
		//Ler o ano de fabricação
		System.out.println("Digite o ano de fabricação: ");
		int ano = sc.nextInt();
		barco.setAnoFabricacao(ano);
		
		//Ler a quantidade de motores
		System.out.println("Digite a quantidade de motores: ");
		int motor = sc.nextInt();
		barco.setQuantidadeMotores(motor);
		
		//Ler a cor do barco
		System.out.println("Digite a cor do barco: ");
		barco.setCor(azul);
		
		//Exibir os valores dos atributos
		System.out.println("Cor:");
		System.out.println(azul.getNome() + azul.getR() + azul.getG() + azul.getB());
		
		
		System.out.println("Estas são as caracteristicas do meu barco: ");
		System.out.println("Modelo: " + barco.getModelo());
		System.out.println("Lugares: " + barco.getQuantidadeLugares());
		System.out.println("Comprimento: " + barco.getComprimento());
		System.out.println("Ano de fabricação: " + barco.getAnoFabricacao());
		System.out.println("Motor: " + barco.getQuantidadeMotores());
		System.out.println("Cor: " + barco.getCor());
	}

}
