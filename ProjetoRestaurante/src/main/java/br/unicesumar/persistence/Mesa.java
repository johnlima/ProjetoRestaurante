package br.unicesumar.persistence;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
	private int numeroPedido;
	private Date data;
	private int numeroMesa;
	List<Produto> produto = new ArrayList<Produto>();
	
	
	public void adicionarItem(){};
	public void fecharPedido(){};
	public void abrirPedido(){}
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	};
}
