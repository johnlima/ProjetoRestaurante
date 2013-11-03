package br.unicesumar.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
=======
>>>>>>> f981600b18c778905f6e6668e35e132fa0872fe5
import javax.persistence.Id;

@Entity
public class ItemMesa {
<<<<<<< HEAD
	//teste de repositorio
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
=======
	
	@Id
	@Column(nullable = false, length = 5)
>>>>>>> f981600b18c778905f6e6668e35e132fa0872fe5
	private int mesa;
	
	@Id
	@Column(nullable = false, length = 5)
	private int idProduto;
	
	@Column(nullable = false)
	private double quantidade;

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
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
