package br.eti.clairton.discontrol.mb;

import java.io.Serializable;

import br.eti.clairton.discontrol.entity.EntidadePersistente;

/**
 * Contrato para os managedBeans.
 *
 * @author Clairton Rodrigo Heinzen <clairton.rodrigo@gmail.com>
 */
public interface ManagedBean<Entidade extends EntidadePersistente> extends Serializable{
}
