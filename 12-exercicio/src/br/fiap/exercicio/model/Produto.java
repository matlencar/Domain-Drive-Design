package br.fiap.exercicio.model;

public class Produto {
	
	//Atributo
	private int codigo;
	private int preco;
	
	//Construtores
	public Produto(int codigo, int preco) {
		super();
		this.codigo = codigo;
		this.preco = preco;
	}
	
	//Getters and Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
}
