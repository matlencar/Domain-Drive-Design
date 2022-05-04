package br.com.fiap.checkpoint.model.em;

public class Vaga {

	// Atributos
	private String cargo;
	private String responsabilidades;
	private String comportamental;
	private String profissional;
	private String pessoal;
	
	//Construtores
	public Vaga(String cargo, String responsabilidades, String comportamental, String profissional, String pessoal) {
		this.cargo = cargo;
		this.responsabilidades = responsabilidades;
		this.comportamental = comportamental;
		this.profissional = profissional;
		this.pessoal = pessoal;
	}

	// Getters and Setters
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getResponsabilidades() {
		return responsabilidades;
	}

	public void setResponsabilidades(String responsabilidades) {
		this.responsabilidades = responsabilidades;
	}

	public String getComportamental() {
		return comportamental;
	}

	public void setComportamental(String comportamental) {
		this.comportamental = comportamental;
	}

	public String getProfissional() {
		return profissional;
	}

	public void setProfissional(String profissional) {
		this.profissional = profissional;
	}

	public String getPessoal() {
		return pessoal;
	}

	public void setPessoal(String pessoal) {
		this.pessoal = pessoal;
	}

}
