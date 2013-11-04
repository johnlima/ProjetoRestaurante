package br.unicesumar.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;

public class Caixa {

	public void abrirCaixa() {
	};

	public void fecharCaixa() {
	};

	public void vender() {
	};

	public void receber() {
	};
	
	public List<Mesa> getMesa() {
		return mesa;
	}

	public void setMesa(List<Mesa> mesa) {
		this.mesa = mesa;
	}

	/*CARDINALIDADE*/
	@OneToOne(mappedBy = "caixa", cascade = CascadeType.ALL)
	private Usuario usuario;
	
	@OneToMany(mappedBy = "caixa_mesa")
	private List<Mesa> mesa = new ArrayList<Mesa>();


}
