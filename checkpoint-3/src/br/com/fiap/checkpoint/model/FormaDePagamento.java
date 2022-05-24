package br.com.fiap.checkpoint.model;

public class FormaDePagamento {

	// Atributos
	private double dinheiro;
	private double debito;
	private double credito;
	private double pix;

	// Getters and Setters
	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public double getDebito() {
		return debito;
	}

	public void setDebito(double debito) {
		this.debito = debito;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	public double getPix() {
		return pix;
	}

	public void setPix(double pix) {
		this.pix = pix;
	}

}
