package br.com.fiap.checkpoint.view;

import java.util.Scanner;

import br.com.fiap.checkpoint.model.Cargo;
import br.com.fiap.checkpoint.model.Proposta;

public class AnuncioDaVaga {

	public static void main(String[] args) {
		
		//Instanciando um leitor
		Scanner sc = new Scanner(System.in);
		
		//Instanciando cargo e inserindo os requisitos da vaga
		Cargo vaga = new Cargo("Estagio em Desenvolvimento de software",
				"Apoiar no desenvolvimento de novas funcionalidades back-end e front-end",
				"Java e React","Persistencia, Comunicação, Vontade de aprender");
		
		//Instanciando a proposta da empresa
		Proposta proposta = new Proposta(1500,"Amil","CLT",2," Vale Alimentação, Vale Refeição, "
				+ "Day-off no dia do aniversario, Convenio com plataformas de estudo. ");
		
		System.out.println("\t\t\t\t\t\tEmpresa Knowlegde Software");
		System.out.println();
		System.out.println("Esses são os requisitos para a vaga de estagiario: ");
		System.out.println();
		
		//Exibindo vaga de estagio
		System.out.println("Nome da vaga: " + vaga.getNome());
		System.out.println("Responsabilidades: " + vaga.getFuncao());
		System.out.println("Requisitos tecnicos: " + vaga.getRequisitos());
		System.out.println("Soft skills necessarias: " + vaga.getSoftSkills());
		System.out.println();
		System.out.println("O que a empresa Knowlegde Software oferece: ");
		System.out.println();
		System.out.println("Salario: "+ proposta.getSalario());
		System.out.println("Convenio: "+ proposta.getConvenio());
		System.out.println("Tempo de contratação: "+ proposta.getTempo() + " anos");
		System.out.println("Tipo de contratação: "+ proposta.getContratacao());
		System.out.println("Beneficios que a empresa oferece: "+ proposta.getBeneficios());
		
		sc.close();

	}

}
