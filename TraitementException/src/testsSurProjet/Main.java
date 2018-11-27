package testsSurProjet;

import TraitementException.Commande;

public class Main {

	public static void main(String[] args) {

		//LigneCommande newLigne = new LigneCommande(5, 112);
		Produit pdt1=new Produit("01254888","farine",2);
		
		LigneCommande ligneCde1=new LigneCommande(3, 26);
		
		Commande newLigneCde = new Commande();
		newLigneCde.ajoutProduit(pdt1,ligneCde1);

//		Commande numeroIdentifiantCde = new Comma;nde();
//		Commande numeroIdentifiantCde2 = new Commande();
//		Commande numeroIdentifiantCde3 = new Commande();
		System.out.printf("%s %s\n", newLigneCde);
//		System.out.printf("%s\n", numeroIdentifiantCde2.numeroIdentifiantCde("haricot blanc"));
//		System.out.printf("%s\n", numeroIdentifiantCde3.numeroIdentifiantCde("farine"));

	}

}
