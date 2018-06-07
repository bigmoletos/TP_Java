/**
 * 
 */
package GestionCommande;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * @author franck Desmedt
 *
 */
public class Commande {

	private String numeroIdentifiantCde;// derived
	private HashMap<Produit, LigneCommande> listeDesProduits = new HashMap<>();// derived
	// private Hashset Produit=new HashSet();f
	// private double totalCde;// derived
	static int compteur = 0;// static car propre à la classe uniquement
	private Date date;

	// Produit produit=new Produit();
	// LigneCommande ligneDeCommande=new LigneCommande();

	// constructeur
	/**
	 *
	 */
	public Commande() {
		Commande.compteur++;
	}

	// getter et setter
	/**
	 * @return the compteur
	 */
	public static int getCompteur() {
		return compteur;
	}

	/**
	 * @param compteur
	 *            the compteur to set
	 */
	public static void setCompteur(int compteur) {
		Commande.compteur = compteur;
	}

	// autres methodes
	// methode calul du total commande
	public void calculTotalCde() {
		// todo
		for (Produit p : this.listeDesProduits.keySet()) {
			LigneCommande lc = this.listeDesProduits.get(p);
		}
	}

	// methode calcul du numero identifiant unique de commande
	// format YYYY-MM-xxxx
	public String numeroIdentifiantCde(String deignationProduit) {
		String numeroIdentifiantCde = dateCde() + genereCompteur();
		return numeroIdentifiantCde;
	}

	// methode pour ajouter un produit dans une commande
	public LigneCommande ajoutProduit(Produit produit, LigneCommande quantite) {
		// todo implemetation produit*quantite et
		// creation methode LigneDeCde dans la classe LigneCommande

		// return this.listeDesProduits.put(produit,lc.setPrixDeVente(prix));
		// String nouvelleLigneCde=produit*quantite;
		// return String.format("%04d",Commande.getCompteur());
		// return String.format("produit: %s, quantite %f, prix:%f, total:%f", produit,
		// quantite, prix,quantite*prix);
		// return String.format("produit: %s, quantite %f, prix:%f, total", produit,
		// quantite, prix);
	//	try {
			LigneCommande lc = new LigneCommande(produit.getPrix(), quantite);
			return this.listeDesProduits.put(produit, lc);
	//	} catch (IllegalArgumentException e) {
	//		System.err.println("le produit n'est pas conforme veuillez le ressaisir");
	//	}

	//	catch (RuntimeException e) {
	//		System.err.println("le produit n'est pas conforme veuillez le ressaisir");
	//	}

	}

	// methode pour retirer un produit dans une commande
	public LigneCommande supprimeProduit(Produit produit, double quantite) {
		// todo implementation produit*quantite et
		// creation methode LigneDeCde dans la classe LigneCommande
		// Commande.compteur ++;L
		// String nouvelleLigneCde=produit*quantite;
		return this.listeDesProduits.remove(produit);

	}

	// methode pour determiner la date de la commande au bon format YYYY-MM
	public String dateCde() {
		Date date = Calendar.getInstance().getTime();
		DateFormat formatter = new SimpleDateFormat("YYY-MM-");
		String anneeMois = formatter.format(date);
		// System.out.println(anneeMois);
		// String taDate = tonSimpleDateFormat.parse(new Date());
		return anneeMois;

	}

	// methode pour generer le compteur integré au numero identifiant de commande
	public String genereCompteur() {
		// int cpt=1;//sortir et mettre en statique au niveau de la classe
		// int compteur2 =Commande.getCompteur()+1;
		// String compteur=Integer.toString(compteur2);//parse du int en string autre
		// solution String.valueOf
		return String.format("%04d", Commande.getCompteur());// formatage avec toujours 4 chiffres, met des zeros pour
																// completer
		// return compteur;

	}

}
