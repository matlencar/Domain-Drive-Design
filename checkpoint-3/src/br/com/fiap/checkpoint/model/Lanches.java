package br.com.fiap.checkpoint.model;

public class Lanches extends Produtos {

	// Atributos
	private String opcoes;

	// Construtor vazio
	public Lanches() {
	}

	// Construtor
	public Lanches(double preco, int quantidade, int estoque, String nome, String sabor, String opcoes) {
		super(preco, quantidade, estoque, nome, sabor);
		this.opcoes = opcoes;
	}

	// Getters and Setters
	public String getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(String opcoes) {
		this.opcoes = opcoes;
	}

}
