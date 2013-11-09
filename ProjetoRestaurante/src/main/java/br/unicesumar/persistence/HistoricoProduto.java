package br.unicesumar.persistence;

import javax.persistence.Column;
import javax.persistence.Id;

public class HistoricoProduto {

	@Column
	private int numeroMesa;
	
	@Column(nullable = false, length = 5)
	private int idProduto;
	
	@Column
	private double quantidade;

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public int getMesa() {
		return numeroMesa;
	}

	public void setMesa(int mesa) {
		this.numeroMesa = mesa;
	}


	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

}