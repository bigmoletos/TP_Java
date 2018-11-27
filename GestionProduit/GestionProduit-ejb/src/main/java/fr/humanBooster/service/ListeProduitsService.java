package fr.humanBooster.service;

import java.util.ArrayList;
import java.util.List;
//import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
// @Local

public abstract class ListeProduitsService implements ServiceLocal {

	// constructeur par defaut
	public ListeProduitsService() {

	}

	// //private List<> produit=new List<>();
	//
	// public void create(Produit p) {
	// /*on cree l'entite produit pour l'envoyer au jpa*/
	// System.out.println("classe produit");
	//
	// }

	// @Override
	// public List<Produit> getAllProduits() {
	// ProduitJpaController dao = new ProduitJpaController(null,emf);
	// return dao.findProduitEntities();
	//
	// }

	@Override
	public List<String> lesProduits() {
		// System.out.println("liste de tous les produits");

		List<String> prodList = new ArrayList<String>();
		prodList.add("seidge");
		prodList.add("perdigone");
		prodList.add("nymphe");
		prodList.add("Cdc");
		prodList.add("canne");
		prodList.add("soie");
		prodList.add("pointe");
		return prodList;
	}

	// // return System.out.println("liste de tous les produit");
	//
	// }
	@Override
	public List<String> bonjour() {
		List<String> bonjour = new ArrayList<String>();
		bonjour.add("bonjour");
		bonjour.add("hello");
		return bonjour;
		// return System.out.println("liste de tous les produit");

	}

}
