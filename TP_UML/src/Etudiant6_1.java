/**
 * *Dans les exercices suivant vous devez créer les classes correspondantes aux situations énoncées. 

Exercice 6.1

Une personne à un nom et prénom, 
elle peut respirer et dormir. Un étudiant est une personne qui
 a en plus une adresse mail. Un étudiant a 
 au minimum un nom et un prénom quand il est instancié. 
On pourra aussi avoir besoin de l’instancier
 avec un nom, prénom et une adresse mail.
 *
 *classe fille de Personne6_1
 *
 *travail sur les constructeurs surchargés, avec l'utilisation de "super"
 */

/**
 * @author franck Desmedt
 *
 */
public class Etudiant6_1 extends Personne6_1 {

	private String mail;

	//getter setter
	/**
	 * @return the mail
	 */
	public String getMail() {
		return this.mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	// constructeur par defaut
	public Etudiant6_1(String nom, String prenom) {

		super(nom, prenom);

	}

	// constructeur surchargé

	public Etudiant6_1(String nom, String prenom, String mail) {

		super(nom, prenom);
		this.mail = mail;

	}

}
