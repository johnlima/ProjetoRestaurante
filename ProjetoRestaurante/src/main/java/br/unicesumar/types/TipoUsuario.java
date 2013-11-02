package br.unicesumar.types;

public enum TipoUsuario {
	GERENTE("Gerente"),
	ATENDENTE("Atendente");
	
	private String descricao;
	
	private TipoUsuario(String descricao) {
		this.descricao=descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
