package fr.humanbooster.service;

import javax.ejb.Local;

import fr.humanbooster.entity.Produit;

@Local
public interface ServiceLocal {
	
	public String getProduit();
	public void create(Produit p);
	
	
}

