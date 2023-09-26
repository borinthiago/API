package com.idwall.api.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Procurados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String ds_nome;
	
	@Column
	private String dt_nascimento;
	
	@Column
	private String ds_nacionalidade;
	
	@Column
	private String ds_referencia;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDs_nome() {
		return ds_nome;
	}

	public void setDs_nome(String ds_nome) {
		this.ds_nome = ds_nome;
	}

	public String getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getDs_nacionalidade() {
		return ds_nacionalidade;
	}

	public void setDs_nacionalidade(String ds_nacionalidade) {
		this.ds_nacionalidade = ds_nacionalidade;
	}

	public String getDs_referencia() {
		return ds_referencia;
	}

	public void setDs_referencia(String ds_referencia) {
		this.ds_referencia = ds_referencia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ds_nacionalidade, ds_nome, ds_referencia, dt_nascimento, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Procurados other = (Procurados) obj;
		return Objects.equals(ds_nacionalidade, other.ds_nacionalidade) && Objects.equals(ds_nome, other.ds_nome)
				&& Objects.equals(ds_referencia, other.ds_referencia)
				&& Objects.equals(dt_nascimento, other.dt_nascimento) && id == other.id;
	}

	public Procurados(long id, String ds_nome, String dt_nascimento, String ds_nacionalidade, String ds_referencia) {
		super();
		this.id = id;
		this.ds_nome = ds_nome;
		this.dt_nascimento = dt_nascimento;
		this.ds_nacionalidade = ds_nacionalidade;
		this.ds_referencia = ds_referencia;
	}

	public Procurados() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
}
