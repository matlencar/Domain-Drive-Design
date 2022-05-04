package br.com.fiap.checkpoint.model;

public class PerfilProfissional {

	// Atributos
	private String habilidades;
	private String experiencia;

	// Construtores
	public PerfilProfissional(String habilidades, String experiencia) {
		this.habilidades = habilidades;
		this.experiencia = experiencia;

	}

	// Getters and Setters
	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

}