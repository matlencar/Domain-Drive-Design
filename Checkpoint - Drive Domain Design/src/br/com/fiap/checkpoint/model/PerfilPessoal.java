package br.com.fiap.checkpoint.model;

public class PerfilPessoal {

	// Atributos
	private String sobre;
	private String objetivo;
	private String copetencia;

	// Construtores
	public PerfilPessoal(String sobre, String objetivo, String copetencia) {
		this.sobre = sobre;
		this.objetivo = objetivo;
		this.copetencia = copetencia;
	}

	// Getters and Setters
	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getCopetencia() {
		return copetencia;
	}

	public void setCopetencia(String copetencia) {
		this.copetencia = copetencia;
	}

}
