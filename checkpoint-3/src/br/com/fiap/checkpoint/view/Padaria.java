package br.com.fiap.checkpoint.view;

import java.util.Scanner;

import br.com.fiap.checkpoint.model.Bebidas;
import br.com.fiap.checkpoint.model.Doces;
import br.com.fiap.checkpoint.model.Estabelecimento;
import br.com.fiap.checkpoint.model.Frios;
import br.com.fiap.checkpoint.model.Lanches;
import br.com.fiap.checkpoint.model.Vendas;
import br.com.fiap.checkpoint.model.Pao;
import br.com.fiap.checkpoint.model.Salgados;

public class Padaria {

	public static void main(String[] args) {

		// Instanciando Scanner
		Scanner leitor = new Scanner(System.in);

		// Instanciando estabelecimento
		Estabelecimento padoca = new Estabelecimento("Padaria FIAP  - ","Avenida Lins de vasconcelos - 1200 - ",
				" Aclimação - "," São Paulo");

		// Intanciando salgados
		Salgados salgados = new Salgados();

		// Instanciando doces
		Doces doces = new Doces();
		
		//Instanciando frios
		Frios frios = new Frios();
		
		//Intanciando bebidas
		Bebidas bebidas = new Bebidas();
		
		//Instanciando o pao
		Pao pao = new Pao(0.15, 100, 100, "Frances", null, null);
		
		//Instanciando Lanches
		Lanches lanches = new Lanches();
		
		//Instanciando o pagamento
		Vendas pagamento = new Vendas();
		
		//Instanciando o metodo de valor a ser pago pelo cliente
		double total = pagamento.vendaFinalizada(1);
		
		
		//Exibir o estabelecimento
		System.out.println("Nome da padaria: " + padoca.getNome());
		System.out.println("Endereco da padaria: " + padoca.getEndereco());
		System.out.println("Bairro : " + padoca.getBairro());
		System.out.println("Cidade: " + padoca.getCidade());
		
		
		//Menu do que o cliente ira ver
		int menu = 6;
		
		
			
			System.out.println("Qual tipo de pão você quer? ");
			String tipo = leitor.nextLine();
			pao.setTipo(tipo);
			
			System.out.println("Quantos pães você deseja adquirir? ");
			int quantidade = leitor.nextInt();
			pao.getQuantidade();
			
			//Pagamento
			System.out.println("Total a pagar: " + total);
			System.out.println("Estoque até o momento: " + pao.getEstoque());
			
		}
		
		
		
	}


