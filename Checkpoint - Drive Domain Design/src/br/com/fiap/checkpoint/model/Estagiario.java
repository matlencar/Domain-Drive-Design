package br.com.fiap.checkpoint.model;

public class Estagiario {

	// Atributos
	private String nome;
	private long cpf;
	private long rg;
	private String genero;
	private int idade;
	private String escolaridade;
	private Telefone telefone;
	//private Endereco endereco;
	//private PerfilComportamental comportamental;
	//private PerfilProfissional profissional;
	//private PerfilPessoal pessoal;
	//private Cargo cargo;
	
	//Construtores
	public Estagiario() {
		super();
	}

	// Getters and Setters
	/*
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	/*
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public PerfilComportamental getComportamental() {
		return comportamental;
	}

	public void setComportamental(PerfilComportamental comportamental) {
		this.comportamental = comportamental;
	}

	public PerfilProfissional getProfissional() {
		return profissional;
	}

	public void setProfissional(PerfilProfissional profissional) {
		this.profissional = profissional;
	}
*/
}
