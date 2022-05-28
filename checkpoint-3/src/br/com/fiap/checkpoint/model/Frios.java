package br.com.fiap.checkpoint.model;

public class Frios extends Produtos{

	//Atributos
	private String embutidos;
	private String queijos;
	
	//Construtor vazio
	public Frios() {}
	
	//Construtor
	public Frios(double preco, int quantidade, int estoque, String nome, String sabor, String embutidos,
			String queijos) {
		super(preco, quantidade, estoque, nome, sabor);
		this.embutidos = embutidos;
		this.queijos = queijos;
	}

	//Getters and Setters
	public String getEmbutidos() {
		return embutidos;
	}
	public void setEmbutidos(String embutidos) {
		this.embutidos = embutidos;
	}
	public String getQueijos() {
		return queijos;
	}
	public void setQueijos(String queijos) {
		this.queijos = queijos;
	}
	
}
