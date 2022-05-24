package br.fiap.exercicio.model;

public class LivroInfantil extends Livro {

	// Atributo
	private String ilustrador;
	
	//Construtores
	public LivroInfantil(int codigo, int preco, String autor, String titulo, String isbn, String ilustrador) {
		super(codigo, preco, autor, titulo, isbn);
		this.ilustrador = ilustrador;
	}

	// Getters and Setters
	public String getIlustrador() {
		return ilustrador;
	}

	public void setIlustrador(String ilustrador) {
		this.ilustrador = ilustrador;
	}

}
