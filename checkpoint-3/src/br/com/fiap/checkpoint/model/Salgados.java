package br.com.fiap.checkpoint.model;

public class Salgados extends Produtos {

	// Atributos
	private String recheio;

	// Construtor vazio
	public Salgados() {
	}

	// Construtor
	public Salgados(double preco, int quantidade, int estoque, String nome, String sabor,
			String recheio) {
		super(preco,  quantidade, estoque, nome, sabor);
		this.recheio = recheio;
	}

	// Getters and Setters
	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

}
