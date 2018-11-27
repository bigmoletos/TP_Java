package fr.humanbooster.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.humanbooster.entity.Produit;

@Stateless
public class ProduitService implements ServiceLocal {

	@PersistenceContext
	EntityManager em;

	@Override
	public String getProduit() {
		return "produitA";
	}

	@Override
	public void create(Produit p) {
		em.persist(p);

	}

}
