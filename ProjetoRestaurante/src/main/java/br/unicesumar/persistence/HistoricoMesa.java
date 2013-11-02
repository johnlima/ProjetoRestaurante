package br.unicesumar.persistence;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class HistoricoMesa {

	private List<Produto> produtos = new ArrayList();
	private Date data;
	private int mesa;
	private Double valor;
	
	
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
		return mesa;
	}


	public void setMesa(int mesa) {
		this.mesa = mesa;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	};
}
