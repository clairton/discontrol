package br.eti.clairton.discontrol.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.eti.clairton.discontrol.ejb.DiscoEjb;
import br.eti.clairton.discontrol.entity.Disco;

@Named(value = "bean")
@RequestScoped
public class DiscoBean {
	@Inject
	private DiscoEjb ejb;

	private Disco entidade = new Disco();


	public Disco getEntidade() {
		return entidade;
	}

	public void setEntidade(Disco entidade) {
		this.entidade = entidade;
	}

	public List<Disco> getEntidades() {
		return ejb.find();
	}

	public String save() {
		ejb.save(entidade);
		return "success";
	}

	public void delete(Disco entidade) {
		ejb.delete(entidade);
	}
}
