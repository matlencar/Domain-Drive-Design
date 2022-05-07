package br.com.fiap.checkpoint.model;

public class Proposta {
	
	
	//Atributos
	private double salario;
	private String convenio;
	private String contratacao;
	private int tempo;
	private String beneficios;
	
	//Construtores
	public Proposta(double salario, String convenio, String contratacao, int tempo, String beneficios) {
		this.salario = salario;
		this.convenio = convenio;
		this.contratacao = contratacao;
		this.tempo = tempo;
		this.beneficios = beneficios;
	}
	//Getters and Setters
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getConvenio() {
		return convenio;
	}
	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	public String getContratacao() {
		return contratacao;
	}
	public void setContratacao(String contratacao) {
		this.contratacao = contratacao;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
}
