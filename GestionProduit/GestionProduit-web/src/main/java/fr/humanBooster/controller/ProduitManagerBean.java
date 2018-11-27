/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.humanBooster.controller;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;

import fr.humanBooster.service.ServiceLocal;

/**
 *
 * @author franck Desmedt
 */

public class ProduitManagerBean {

	private String nom;
	private List<String> listP ;
	 private List<String> listePr;
	private List<String> prixP;
	private List<String> list; // attribut list string

	/**
	 * @return the listeProd
	 */
//	public ServiceLocal getListeProd() {
//		return this.listeProd;
//	}
//
//	/**
//	 * @param listeProd the listeProd to set
//	 */
//	public void setListeProd(ServiceLocal listeProd) {
//		this.listeProd = listeProd;
//	}

	// getter et setter
	/**
	 * @return the nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	

	/**
	 * @return the list
	 */
	public List<String> getList() {
		return this.list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(List<String> list) {
		this.list = list;
	}

	public List<String> getPrixP() {
		return prixP;
	}

	public List<String> getListP() {
		return listP;
	}

	public void setListP(List<String> listP) {
		this.listP = listP;
	}

	public void setPrixP(List<String> prixP) {
		this.prixP = prixP;
	}

	/**
	 * @return the listePr
	 */
	public List<String> getListePr() {
		return this.listePr;
	}

	/**
	 * @param listePr the listePr to set
	 */
	public void setListePr(List<String> listePr) {
		this.listePr = listePr;
	}

	/**
	 * Creates a new instance of ProduitManagedBean
	 */
	public ProduitManagerBean() {
	}

	// autres methodes

	// methode pour créer une liste produit
	public String listProduit() {
		listP = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			listP.add("produit n°: " + i);
		}
		return "produit";
	}

	// methode pour revenir à l'accueil
	public String forwardProducts() {
		return "index";
	}

	// methode affichant les prix
	public String prix() {
		prixP = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			prixP.add("prix " + i);
		}

		return "produit";

	}

	// appel de la methode getTousLesProduits() dans l'ejb produitsService.java
	// public void TousLesProduits(){
	// produitService.getTousLesProduits();
	// return produitService.getTousLesProduits();
	// }

	// appel a l'EJB , aux services via l'interface ServiceLocal, c'est un injection
	// car on ne peut instancier un EJB
	@EJB 
	//private ServiceLocal listeDesProduits;
	private ServiceLocal listeProd;//il faut rajouter les getter et setter
	
	
	// private List<String> list; //pour avoir une liste on créer un attribut de
	// type List string
	// avec ses getter et ses setter

	// appel de la methode listeDesProduits() dans l'ejb ListeProduitsService.java
	public String tousLesProduits() {

		// listePr.listeDesProduits();
		// l'attribut list de type List prend l'instanciation listePr de
		// la méthode listeDesProduits de fr.humanBooster.service.ListeProduitsService
		//list = listeProd.listeDesProduits2();
		System.out.println("Je suis dans tousLesProduits");
	//	list = listeProd.lesProduits();
		//list = listeProd.bonjour();
		//System.out.println("----------------------"+list.size());
		return null;// on met null pour ne pas changer de page

	}

	public  List<String> produits() {
		// System.out.println("liste de tous les produits");
		listP= new ArrayList<String>();
		//List<String> listP= new ArrayList<String>();
		listP.add("seidge");
		listP.add("perdigone");
		listP.add("nymphe");
		listP.add("Cdc");
		listP.add("canne");
		listP.add("soie");
		listP.add("pointe");
		return listP;
	}
	
	
	// methode affiche le nom
	public String afficheNom() {
		return this.nom;
	}

}
