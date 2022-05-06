package br.com.fiap.checkpoint.view;

import java.util.Scanner;

import br.com.fiap.checkpoint.model.Cargo;
import br.com.fiap.checkpoint.model.Endereco;
import br.com.fiap.checkpoint.model.Estagiario;
import br.com.fiap.checkpoint.model.PerfilComportamental;
import br.com.fiap.checkpoint.model.PerfilProfissional;
import br.com.fiap.checkpoint.model.Telefone;


public class FormularioEstagiario {

	public static void main(String[] args) {
		
		//Instanciando um leitor
		Scanner sc = new Scanner(System.in);
		
		//Instanciando o candidato
		Estagiario estagiario = new Estagiario();
		
		//Instanciando Telefone
		Telefone telefone = new Telefone();
		
		//Instanciando a endereco
		Endereco logradouro = new Endereco();
		
		//Instanciando Perfil Comportamental
		PerfilComportamental comportamental = new PerfilComportamental();
		
		//Instanciando Perfil Profissional
		PerfilProfissional profissional = new PerfilProfissional();
		
		
		//Ler o nome do estagiario
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		estagiario.setNome(nome);
		
		//Ler o numero do CPF
		System.out.println("Insira o seu CPF: ");
		Long cpfLong = sc.nextLong();
		estagiario.setCpf(cpfLong);
		
		//Ler o numero do RG
		System.out.println("Insira o seu RG: ");
		Long rgLong = sc.nextLong();
		estagiario.setRg(rgLong);
		
		//Ler o Genero
		System.out.println("Qual seu genero: ");
		String genero = sc.next();
		estagiario.setGenero(genero);
		
		//Ler a idade
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		estagiario.setIdade(idade);
		
		//Ler a escolaridade
		System.out.println("Qual sua escolaridade?: ");
		String escolaridade = sc.next();
		estagiario.setEscolaridade(escolaridade);
		
		//Ler o telefone
		System.out.println("Informe o seu telefone: ");
		int celular = sc.nextInt();
		telefone.setCelular(celular);
		
		//Ler a rua
		System.out.println("Informe a rua onde mora: ");
		String rua = sc.next();
		logradouro.setRua(rua);
		sc.next();
		
		//Ler o bairro
		System.out.println("Informe o seu bairro: ");
		String bairro = sc.next();
		logradouro.setBairro(bairro);
		sc.next();
		
		//Ler a cidade
		System.out.println("Informe o sua cidade: ");
		String cidade = sc.next();
		logradouro.setCidade(cidade);
		sc.next();
		
		//Ler o estado
		System.out.println("Informe o seu estado: ");
		String estado = sc.next();
		logradouro.setEstado(estado);
		sc.next();
		
		//Ler as soft skills(Mentalidade)
		System.out.println("Me diga quais são suas mentalidades :");
		String mentalidade = sc.next();
		comportamental.setMentalidade(mentalidade);
		sc.next();
		
		//Ler as soft skills(Caracteristicas)
		System.out.println("Insira aqui uma caracteristica sua :");
		String caracteristica = sc.next();
		comportamental.setCaracteristicas(caracteristica);
		sc.next();
		
		//Ler as hard skills(Habilidades)
		System.out.println("Habilidades tecnicas: ");
		String habilidades = sc.next();
		profissional.setHabilidades(habilidades);
		sc.next();
		
		//Ler as hard skills(Experiencia)
		System.out.println("Se tiver experiencia profissional por favor digite aqui: ");
		String experiencia = sc.next();
		profissional.setExperiencia(experiencia);
		sc.next();
		
		//Nome da empresa
		System.out.println();
		System.out.println("Formulario para a vaga na Empresa Knowlegde Software");
		System.out.println();
		
		//Exibindo a ficha do estagiario
		System.out.println("Nome do candidato: " + estagiario.getNome());
		System.out.println("Numero do CPF: " + estagiario.getCpf());
		System.out.println("Numero do RG: " + estagiario.getRg());
		System.out.println("Genero: " + estagiario.getGenero());
		System.out.println("Idade: " + estagiario.getIdade());
		System.out.println("Grau de escolaridade: " + estagiario.getEscolaridade());
		System.out.println("Telefone Celular: " + telefone.getCelular());
		System.out.println("Rua: " + logradouro.getRua());
		System.out.println("Bairro: " + logradouro.getBairro());
		System.out.println("Cidade: " + logradouro.getCidade());
		System.out.println("Estado: " + logradouro.getEstado());
		System.out.println("Habilidades tecnicas: " + profissional.getHabilidades());
		System.out.println("Experiencia profissional: " + profissional.getExperiencia());
		System.out.println("Mentalidade do candidato : " + comportamental.getMentalidade());
		System.out.println("aracteristicas do candidato: " + comportamental.getCaracteristicas());
		
		sc.close();
	}

}
