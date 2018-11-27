package fr.humanBooster.service;

import java.util.List;

import javax.ejb.Local;
//import javax.ejb.Local;


@Local
//@local
public interface ServiceLocal {
	public List<String> lProduits();
	public List<String> lesProduits();
	public List<String> bonjour();
	public  List<String> hello();
	// List<Produit> getAllProduits();
	//public void listeDeProduits();
	
	
}
