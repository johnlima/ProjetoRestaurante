package br.unicesumar.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class ItemMesa {
	
	@Column
	private int id;
	
	@Column
	private int mesa;
	
	@Column
	private double quantidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}


	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

}
