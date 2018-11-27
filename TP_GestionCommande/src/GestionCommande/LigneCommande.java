/**
 * 
 */
package GestionCommande;

/**
 * @author franck Desmedt
 *
 */
public class LigneCommande {
	private double quantite;

	private LigneCommande prixDeVente;

	// constructeur
	/**
	 * @param quantite
	 * @param prixDeVente
	 */
	public LigneCommande(double quantite, LigneCommande prixDeVente) {
		this.quantite = quantite;
		this.prixDeVente = prixDeVente;
	}

	// getter et setter
	/**
	 * @return the quantite
	 */
	public double getQuantite() {
		return this.quantite;
	}

	/**
	 * @param quantite
	 *            the quantite to set
	 */
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	/**
	 * @return the prixDeVente
	 */
	public LigneCommande getPrixDeVente() {
		return this.prixDeVente;
	}

	/**
	 * @param prixDeVente
	 *            the prixDeVente to set
	 */
	public void setPrixDeVente(double prixDeVente) {
		this.prixDeVente = prixDeVente;
	}

	// autre methode
	//

}
