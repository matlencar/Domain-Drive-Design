package br.com.fiap.checkpoint.model;

public class Funcionario {
	
	private String nome, cargo;
	private long matricula;
	
	//Construtor 
	public Funcionario(String nome, String cargo, long matricula) {
		this.nome = nome;
		this.cargo = cargo;
		this.matricula = matricula;
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	
}
