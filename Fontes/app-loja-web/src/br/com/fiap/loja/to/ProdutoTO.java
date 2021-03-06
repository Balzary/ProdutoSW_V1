package br.com.fiap.loja.to;

import java.io.Serializable;

public class ProdutoTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codigoProduto;
	private double preco;
	private int quantidade;
	private String descricao;

	public ProdutoTO() {
		super();
	}

	public ProdutoTO(int codigoProduto, double preco, int quantidade, String descricao) {
		super();
		this.codigoProduto = codigoProduto;
		this.preco = preco;
		this.quantidade = quantidade;
		this.descricao = descricao;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
