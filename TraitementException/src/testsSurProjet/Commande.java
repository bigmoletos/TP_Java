package testsSurProjet;

import java.util.Date;
import java.util.HashMap;

public class Commande {

	private static int nextNumCommande;

	private static int lastGenerationMonthValue = 0;

	private HashMap<Produit, LigneCommande> lignesCommande = new HashMap<>();

	private String codeCommande;

	private Date date;

	public String getCodeCommande() {
		return codeCommande;
	}

	public Date getDate() {
		return date;
	}

	public double getTotal() {
		double total = 0;
		for (Produit p : this.lignesCommande.keySet()) {
			LigneCommande lcp = lignesCommande.get(p);
			total += lcp.prixVente * lcp.qte;
		}
		return total;
	}

	public Commande() {
		this.date = new Date();
		this.codeCommande = Commande.generateNumCommande();
	}

	private static String generateNumCommande() {
		// TODO Auto-generated method stub
		Date now = new Date();
		if (now.getMonth() != Commande.lastGenerationMonthValue) {
			Commande.nextNumCommande = 1;
			Commande.lastGenerationMonthValue = now.getMonth();
		}
		return String.format("%04d-%02d-%04d", now.getYear(), now.getMonth(), Commande.nextNumCommande++);
	}

	public void AjouterProduit(Produit p, int qte) throws IllegalArgumentException {
		if (p == null) {
			throw new IllegalArgumentException("merci de mettre un produit");
		}
		if (qte <= 0) {
			throw new IllegalArgumentException("la quantite doit etre positivet");
		}

		LigneCommande lc = new LigneCommande(p.getPrix(), qte);
		lignesCommande.put(p, lc);
	}

	public void SupprimerProduit(Produit p) {
		this.lignesCommande.remove(p);
	}

}
