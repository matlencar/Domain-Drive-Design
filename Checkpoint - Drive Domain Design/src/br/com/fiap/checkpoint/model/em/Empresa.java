package br.com.fiap.checkpoint.model.em;

public class Empresa {

	// Atributos
	private long cnpj;
	private String nome;
	private int funcionarios;

	// Construtores
	public Empresa(String nome, int funcionarios) {
		this.nome = nome;
		this.funcionarios = funcionarios;
	}

	// Getters and Setters
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}

}
