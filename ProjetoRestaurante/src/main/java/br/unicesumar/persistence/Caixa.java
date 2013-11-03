package br.unicesumar.persistence;

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
	
	/*CARDINALIDADE*/
	@OneToOne(mappedBy = "caixa", cascade = CascadeType.ALL)
	private Usuario usuario;

}
