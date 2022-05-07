package br.com.fiap.checkpoint.view;

import java.util.Scanner;
import br.com.fiap.checkpoint.model.Cargo;

public class AnuncioDaVaga {

	public static void main(String[] args) {
		
		//Instanciando um leitor
		Scanner sc = new Scanner(System.in);
		
		//Instanciando cargo e inserindo os requisitos da vaga
		Cargo vaga = new Cargo("Estagio em Desenvolvimento de software",
				"Apoiar no desenvolvimento de novas funcionalidades back-end e front-end",
				"Java e React","Persistencia, Comunicação, Vontade de aprender");
		
		System.out.println("Empresa Knowlegde Software");
		System.out.println();
		System.out.println("Esses são os requisitos para a vaga de estagiario: ");
		System.out.println();
		
		//Exibindo vaga de estagio
		System.out.println("Nome da vaga: " + vaga.getNome());
		System.out.println("Responsabilidades: " + vaga.getFuncao());
		System.out.println("Requisitos tecnicos: " + vaga.getRequisitos());
		System.out.println("Soft skills necessarias: " + vaga.getSoftSkills());
		
		sc.close();

	}

}
