package br.com.fiap.checkpoint.model;

public class Endereco {

	// Atributos
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	
	//Construtores
	public Endereco() {
		super();
	}

	// Getters and Setters
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
