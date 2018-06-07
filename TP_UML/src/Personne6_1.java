/**
 * 
 *Dans les exercices suivant vous devez créer les classes correspondantes aux situations énoncées. 

Exercice 6.1

Une personne à un nom et prénom, 
elle peut respirer et dormir. Un étudiant est une personne qui
 a en plus une adresse mail. Un étudiant a 
 au minimum un nom et un prénom quand il est instancié. 
On pourra aussi avoir besoin de l’instancier
 avec un nom, prénom et une adresse mail.
 *
 */

/**
 * @author franck Desmedt
 *
 */
public class Personne6_1 {

	protected String nom;
	protected String prenom;
	private boolean respirer;
	private boolean dormir;

	// constructeur par defaut
	public Personne6_1() {

	}

	// constructeur surchargé
	public Personne6_1(String nom, String prenom) {

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

	/**
	 * @return the respirer
	 */
	public boolean isRespirer() {
		return this.respirer;
	}

	/**
	 * @param respirer
	 *            the respirer to set
	 */
	public void setRespirer(boolean respirer) {
		this.respirer = respirer;
	}

	/**
	 * @return the dormir
	 */
	public boolean isDormir() {
		return this.dormir;
	}

	/**
	 * @param dormir
	 *            the dormir to set
	 */
	public void setDormir(boolean dormir) {
		this.dormir = dormir;
	}

	// autres methodes
	// methode respirer
	public void respirer() {
		System.out.println("je respire");
	}

	// methode dormir
	public void dormir() {
		System.out.println("je dors");
	}

}
