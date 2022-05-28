package br.com.fiap.checkpoint.model;

public class Pao extends Produtos {

	private String tipo;
	private Vendas pagamento;


	// Construtor vazio
//	public Pao() {
//	}

	// Construtor
	public Pao(double preco, int quantidade, int estoque, String nome, String sabor, String tipo) {
		super(preco, quantidade, estoque, nome, sabor);
		this.tipo = tipo;
	}

	// Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Vendas getPagamento() {
		return pagamento;
	}

	public void setPagamento(Vendas pagamento) {
		this.pagamento = pagamento;
	}

}
