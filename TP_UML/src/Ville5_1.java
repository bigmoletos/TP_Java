/**
 *
 * Exercice 5.1

Vous reprendrez le diagramme UML 1.8 pour le r�aliser en Java 
(l�impl�mentation des m�thodes n�est pas demand�e, seulement les d�clarations).
 * 
 * Une ville � un nom un nombre d�habitant.
 *  Une capitale est une ville, elle peut d�finir son nom et � un monument.
 *  
 *  
 */

/**
 * @author franck Desmedt
 *
 *         utilisation d'un attribut protected
 */
public class Ville5_1 {
	// attributs
	protected String nom;
	private long nbHabitants;

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
	 * @return the nbHabitants
	 */
	public long getNbHabitants() {
		return this.nbHabitants;
	}

	/**
	 * @param nbHabitants
	 *            the nbHabitants to set
	 */
	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	

}
