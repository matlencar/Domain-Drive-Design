package br.com.fiap.checkpoint.model;

public class PerfilComportamental {
	
	//Atributos
	private String mentalidade;
	private String caracteristicas;
	
	
	//Construtores
	public PerfilComportamental(String mentalidade, String caracteristicas) {
		this.mentalidade = mentalidade;
		this.caracteristicas = caracteristicas;
	}
	
	//Getters and Setters
	public String getMentalidade() {
		return mentalidade;
	}
	public void setMentalidade(String mentalidade) {
		this.mentalidade = mentalidade;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
}
