package br.com.fiap.checkpoint.view;

import java.util.Scanner;

import br.com.fiap.checkpoint.model.Endereco;
import br.com.fiap.checkpoint.model.Estagiario;
import br.com.fiap.checkpoint.model.Faculdade;
import br.com.fiap.checkpoint.model.PerfilComportamental;
import br.com.fiap.checkpoint.model.PerfilProfissional;
import br.com.fiap.checkpoint.model.Telefone;


public class FormularioEstagiario {

public static void main(String[] args) {
		
		//Instanciando Leitor
		Scanner leitor = new Scanner(System.in);
		
		//Instanciando Informações do estagiario
		Estagiario estagiario = new Estagiario();
		
		//Instanciando telefone
		Telefone telefone = new Telefone();
		
		//Instanciando endereço 
		Endereco endereco = new Endereco();
		
		//Instanciando informações comportamentais do estagiario
		PerfilComportamental comportamental = new PerfilComportamental();
		
		//Instanciando informações profissionais do estagiario
		PerfilProfissional profissional = new PerfilProfissional();
		
		//Instanciando faculdade
		Faculdade faculdade = new Faculdade();
		
		//Lendo informações do estagiario 
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		estagiario.setNome(nome);
		
		System.out.println("A instituição de ensino em que estuda: ");
		String instituicao = leitor.nextLine();
		faculdade.setInstituicao(instituicao);
		
		System.out.println("Curso que faz: ");
		String curso = leitor.nextLine();
		faculdade.setCurso(curso);
		
		//Lendo informações de endereço
		System.out.println("Digite o nome da rua: ");
		String rua = leitor.nextLine();
		endereco.setRua(rua);
		
		System.out.println("Digite o nome do seu bairro: ");
		String bairro = leitor.nextLine();
		endereco.setBairro(bairro);
		
		System.out.println("Digite o nome da cidade: ");
		String cidade = leitor.nextLine();
		endereco.setCidade(cidade);
		
		System.out.println("Digite o nome do estado: ");
		String estado = leitor.nextLine();
		endereco.setEstado(estado);
		
		System.out.println("Insira sua idade: ");
		int idade = leitor.nextInt();
		estagiario.setIdade(idade);
		
		System.out.println("Genero em que você se identifica: ");
		String genero = leitor.next();
		estagiario.setGenero(genero);
		
		System.out.println("Insira seu CPF: ");
		long cpf = leitor.nextLong();
		estagiario.setCpf(cpf);
		
		System.out.println("Insira seu RG: ");
		long rg = leitor.nextLong();
		estagiario.setRg(rg);
		
		System.out.println("Digite sua escolaridade: ");
		String escolaridade = leitor.next();
		estagiario.setEscolaridade(escolaridade);
		
		
		System.out.println("Informe o numero do seu telefone celular: ");
		int celular = leitor.nextInt();
		telefone.setCelular(celular);
		
		System.out.println("Informe o numero do seu telefone residencial: ");
		int residencial = leitor.nextInt();
		telefone.setResidencial(residencial);
		
		System.out.println("Me diga uma mentalidades sua:");
		String mentalidade = leitor.next();
		comportamental.setMentalidade(mentalidade);
		
		System.out.println("Me diga uma caracteristica sua:");
		String caracteristica = leitor.next();
		comportamental.setCaracteristicas(caracteristica);
		
		System.out.println("Insira uma linguagem de programação backend que tem conhecimento: ");
		String backend = leitor.next();
		profissional.setBackend(backend);
		
		System.out.println("Insira uma linguagem de programação frontend que tem conhecimento: ");
		String frontend = leitor.next();
		profissional.setFrontend(frontend);
		
		System.out.println();
		System.out.println("\t\t\tFormulario para a vaga de estagio na Empresa Knowleagde Software");
		System.out.println();
		
		System.out.println("Nome do candidato: "+ estagiario.getNome());
		System.out.println("Idade do candidato: "+ estagiario.getIdade());
		System.out.println("Genero que me identifico: "+ estagiario.getGenero());
		System.out.println("Numero do CPF: "+ estagiario.getCpf());
		System.out.println("Numero do RG: "+ estagiario.getRg());
		System.out.println("Instituição: "+ faculdade.getInstituicao());
		System.out.println("Curso: "+ faculdade.getCurso());
		System.out.println("Grau de escolaridade: "+ estagiario.getEscolaridade());
		System.out.println("Telefone celular do candidato para contato: "+ telefone.getCelular());
		System.out.println("Telefone residencial do candidato para contato: "+ telefone.getResidencial());
		System.out.println("Rua: "+ endereco.getRua());
		System.out.println("Bairro: " +endereco.getBairro());
		System.out.println("Cidade: " +endereco.getCidade());
		System.out.println("Estado: " +endereco.getEstado());
		System.out.println("Mentalidade escolhida do candidato: "+comportamental.getMentalidade());
		System.out.println("Caracteristica escolhida do candidato: " + comportamental.getCaracteristicas());
		System.out.println("Linguagem de programação backend que o candidato tem conhecimento: " + profissional.getBackend());
		System.out.println("Linguagem de programação frontend que o candidato tem conhecimento: " + profissional.getFrontend());
		
		leitor.close();
	}

}
