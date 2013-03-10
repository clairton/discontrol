package br.eti.clairton.discontrol.mb;

import br.eti.clairton.discontrol.entity.Genero;

/**
 * ManagedBean para os Discos.
 *
 * @author Clairton Rodrigo Heinzen <clairton.rodrigo@gmail.com>
 */
@javax.faces.bean.ManagedBean
public class GeneroMB extends AbstractManagedBean<Genero> implements ManagedBean<Genero> {
	private static final long serialVersionUID = 5980418602004159206L;
	private String name = "teste;";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
