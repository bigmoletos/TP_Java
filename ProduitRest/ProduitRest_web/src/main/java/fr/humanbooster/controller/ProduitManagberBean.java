package fr.humanbooster.controller;

import javax.ejb.EJB;

import fr.humanbooster.entity.Categorie;
import fr.humanbooster.entity.Produit;
import fr.humanbooster.service.ServiceLocal;

//@named("ProduitManagerBean")//indique que l'on met un manager Bean avec une ancienne version sans le faces_config

public class ProduitManagberBean {

	@EJB
	private ServiceLocal service;

	public String createProduit() {
		Produit p = new Produit();
		p.setNom("seidge");
		p.setPrix(26);

		Categorie cate = new Categorie();
		cate.setNom("mont");
		p.setIdCategorie(cate);

		service.create(p);
		return null;

	}

}
