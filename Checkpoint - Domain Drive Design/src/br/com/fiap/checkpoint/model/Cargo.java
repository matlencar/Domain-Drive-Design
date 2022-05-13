package br.com.fiap.checkpoint.model;

public class Cargo {

	// Atributos
	private String nome;
	private String funcao;
	private String requisitos;
	private String softSkills;

	// Construtores
	public Cargo(String nome, String funcao, String requisitos, String softSkills) {
		this.nome = nome;
		this.funcao = funcao;
		this.requisitos = requisitos;
		this.softSkills = softSkills;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public String getSoftSkills() {
		return softSkills;
	}

	public void setSoftSkills(String softSkills) {
		this.softSkills = softSkills;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

}
