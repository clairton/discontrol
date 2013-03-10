package br.eti.clairton.discontrol.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe que representa o genero para os discos.
 *
 * @author Clairton Rodrigo Heinzen <clairton.rodrigo@gmail.com>
 */
@Entity
public class Genero  extends AbstractEntidadePersistente implements EntidadePersistente{
	private static final long serialVersionUID = -3205811992554121645L;
	@Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Genero() {
    }

    public Genero(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
    
}
