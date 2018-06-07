import java.util.Scanner;

/**
 * Exercice 3.5

Écrire une fonction qui lit le libellé d’un article, le prix HT d’un article, le nombre d’articles et le taux de TVA, et qui affichera le prix total TTC correspondant.

On aura ainsi le dialogue suivant : 
Machine : Quel est le libellé de l’article ? 
Utilisateur : Clé USB
Machine : Quel est le prix HT de l’article ? 
Utilisateur : 10 
Machine : Combien avez-vous d’article ? 
Utilisateur : 3
Machine : Quel est le taux de TVA applicable ? 
Utilisateur : 20
Machine : 3 x Clé USB = 30 € HT soit 36 € TTC
 */

/**
 * @author franck Desmedt
 *
 */
public class PrixTTC3_5 {

	private String libelle;
	private double prixHT;
	private double Tva;
	private int nbArt;

	// getter et setter
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return this.libelle;
	}

	/**
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the prixHT
	 */
	public double getPrixHT() {
		return this.prixHT;
	}

	/**
	 * @param prixHT
	 *            the prixHT to set
	 */
	public void setPrixHT(double prixHT) {
		this.prixHT = prixHT;
	}

	/**
	 * @return the tva
	 */
	public double getTva() {
		return this.Tva;
	}

	/**
	 * @param tva
	 *            the tva to set
	 */
	public void setTva(double tva) {
		this.Tva = tva;
	}

	/**
	 * @return the nbArt
	 */
	public int getNbArt() {
		return this.nbArt;
	}

	/**
	 * @param nbArt
	 *            the nbArt to set
	 */
	public void setNbArt(int nbArt) {
		this.nbArt = nbArt;

	}

	// autre methode
	public double calculPrixTTC() {
		double prixTTC = this.getPrixHT() * (1 + this.getTva() * this.getNbArt());
		System.out.println("le prix TTC de :" + libelle + " est de " + prixTTC);
		return prixTTC;
	}

	// autre possibilite
	public void CalculPrixTTC() {
		// initialisation du scanner
		Scanner scanner = null;
		// this.scanner= new Scanner(System.in);

		System.out.println("quel est le prix du produit? ");

		Float prixHT = scanner.nextFloat();

		// parse du string en float
		// Float prixHT=Float.parseFloat(scanner.nextline());

		System.out.println("quel est le libellé du produit? ");

		String libelle = scanner.nextLine();

		System.out.println("quel est le nombre d'article? ");
		int nombreArtciles = scanner.nextInt();

		System.out.println("quel est la TVA? ");
		Float tva = scanner.nextFloat();
		float prixttc = prixHT + (1 + tva) * nombreArtciles;

		System.out.println("pdt :" + libelle + "quantite: " + nombreArtciles + "prix TTC" + prixttc);

	}
}
