package br.unicesumar.persistence;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Mesa {
	
	@Id
	@Column(nullable = false, length = 5)
	private int numeroMesa;
	
	@Column(nullable = false)
	private Date data;
	
	List<Produto> produto = new ArrayList<Produto>();
	
	
	public void adicionarItem(){}
	public void fecharPedido(){}
	public void abrirPedido(){}
	
	@ManyToOne
	private Caixa caixa_mesa;

	
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
