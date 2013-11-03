package br.unicesumar.persistence;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

public class HistoricoMesa {
	
	@Id
	@Column(nullable = false, length = 5)
	private int numeroMesa;
	
	@Column(nullable = false)
	private Date data;
	
	@Column(nullable = false)
	private Double valor;
	
	private List<Produto> produtos = new ArrayList();	
	
	
	
	public void gerarRelatorio(){}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public int getMesa() {
		return numeroMesa;
	}


	public void setMesa(int mesa) {
		this.numeroMesa = mesa;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	};
}
