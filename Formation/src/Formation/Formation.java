/**
 * 
 */
package Formation;


import java.util.HashSet;

/**
 * @author franck Desmedt
 *version franck Desmedt
 */
public class Formation {

	private String intitulé;
	private Personne formateur;
	private Personne stagiaire;
	private HashSet<Personne> listeStagiaires = new HashSet<>();

	// getter setter
	/**
	 * @return the intitulé
	 */
	public String getIntitulé() {
		return this.intitulé;
	}

	/**
	 * @return the formateur
	 */
	public Personne getFormateur() {
		return this.formateur;
	}

	/**
	 * @param formateur
	 *            the formateur to set
	 */
	public void setFormateur(Personne formateur) {
		this.formateur = formateur;
	}

	// methode inscrire un stagiaire
	public void inscrireStagiaire() {

		
	}
	
	//methode listeStagiaires
//	public Personne listeStagiaire() {
//		
//		
//		
//	}
	
}