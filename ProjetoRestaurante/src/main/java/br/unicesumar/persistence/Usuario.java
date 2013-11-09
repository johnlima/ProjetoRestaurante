package br.unicesumar.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.unicesumar.types.TipoUsuario;
@Entity
public class Usuario {
	
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length=12,nullable=false)
	private String login;
	
	@Column(length=4,nullable=false)
	private String senha;
	
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;
	
	/*CARDINALIDADE*/
	/*
	@OneToOne
	@JoinColumn(name = "caixa_id", nullable = false)
	private Caixa caixa;
	*/
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	/*
	public Caixa getCaixa() {
		return caixa;
	}
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	*/
}
