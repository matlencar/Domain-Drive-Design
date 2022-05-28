package br.com.fiap.checkpoint.model;

public class Produtos {

	// Atributos
	private double preco;
	private int quantidade;
	private int estoque;
	private String nome;
	private String sabor;

	// Construtores vazio
	public Produtos() {
	}

	// Construtores
	public Produtos(double preco, int quantidade, int estoque, String nome, String sabor) {
		super();
		this.preco = preco;
		this.quantidade = quantidade;
		this.estoque = estoque;
		this.nome = nome;
		this.sabor = sabor;
	}

	// Getters and Setters
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

}
