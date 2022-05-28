package br.com.fiap.checkpoint.model;

public class Vendas {

	private String cliente;
	private Produtos produtos;
	private String formaPagamento;
	private int quantidade;

	public Vendas() {
	}

	public Vendas(String cliente, Produtos produtos, String formaPagamento, int quantidade) {
		this.cliente = cliente;
		this.produtos = produtos;
		this.formaPagamento = formaPagamento;
		this.quantidade = quantidade;
	}

	// Tirar a quantidade do estoque e retornar o valor a ser pago
	public double vendaFinalizada() {
		getProdutos().setEstoque(getProdutos().getEstoque() - quantidade);
		return getProdutos().getPreco() * quantidade;
	}

	// sobrescrever o m�todo toString()
	@Override
	public String toString() {
		return cliente + " - Produto: " + produtos.getNome() + " - Qtd: " + quantidade;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

	public double vendaFinalizada(int i) {

		return 100 - quantidade;
	}

}
