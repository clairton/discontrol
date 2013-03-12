package br.eti.clairton.discontrol.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.eti.clairton.discontrol.entity.Disco;

@Stateless
public class DiscoEjb {
	@PersistenceContext(unitName = "defaultPersistenceUnit")
	private EntityManager	em;

	public Disco save(Disco entidade) {
		em.persist(entidade);
		return entidade;
	}

	public List<Disco> find() {
		final Query query = em.createQuery("SELECT b FROM Disco b ORDER BY b.nome DESC");
		List<Disco> entries = query.getResultList();
		if (entries == null) {
			entries = new ArrayList<Disco>();
		}
		return entries;
	}

	public void delete(Disco entidade) {
		entidade = em.merge(entidade);
		em.remove(entidade);
	}
}
