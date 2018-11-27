/**
 * 
 */
package participants;

/**
 * @author franck Desmedt
 *version pascal Boyer
 */

public class Personne {
	private String nom;
	private String prenom;

	// surcharge construteur pour obliger la saisie  du nom et du prenom
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	// getter setter
	/**
	 * @return the nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * @param nom
	 * @param prenom
	 */

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	
	
}
