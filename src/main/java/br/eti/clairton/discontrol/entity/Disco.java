package br.eti.clairton.discontrol.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Representa a Entidade Disco.
 * 
 * @author Clairton Rodrigo Heinzen <clairton.rodrigo@gmail.com>
 * 
 */
@Entity
public class Disco extends AbstractEntidadePersistente implements
		EntidadePersistente {
	private static final long serialVersionUID = 611994931872228412L;
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	@Temporal(value = TemporalType.TIME)
	private Date duracao;
	private String sinope;
	@ManyToOne
	private Genero genero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDuracao() {
		return duracao;
	}

	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}

	public String getSinope() {
		return sinope;
	}

	public void setSinope(String sinope) {
		this.sinope = sinope;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}
