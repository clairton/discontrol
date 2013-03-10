package br.eti.clairton.discontrol.mb;

import br.eti.clairton.discontrol.entity.EntidadePersistente;

/**
 * ManagedBean abstrato que contem as implementações padrão para o ManagedBean.
 *
 * @author Clairton Rodrigo Heinzen <clairton.rodrigo@gmail.com>
 */
public abstract class AbstractManagedBean<Entidade extends EntidadePersistente> implements ManagedBean<Entidade> {
	private static final long serialVersionUID = 7795196312482434212L;
	private Entidade entidade;
	
	
	
	public Entidade getEntidade() {
		return entidade;
	}
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
}
