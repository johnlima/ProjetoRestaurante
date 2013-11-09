package br.unicesumar.persistence;

import javax.persistence.Column;

public class Grupo {
	@Column
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
