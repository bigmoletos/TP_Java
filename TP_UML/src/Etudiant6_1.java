/**
 * *Dans les exercices suivant vous devez cr�er les classes correspondantes aux situations �nonc�es. 

Exercice 6.1

Une personne � un nom et pr�nom, 
elle peut respirer et dormir. Un �tudiant est une personne qui
 a en plus une adresse mail. Un �tudiant a 
 au minimum un nom et un pr�nom quand il est instanci�. 
On pourra aussi avoir besoin de l�instancier
 avec un nom, pr�nom et une adresse mail.
 *
 *classe fille de Personne6_1
 *
 *travail sur les constructeurs surcharg�s, avec l'utilisation de "super"
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

	// constructeur surcharg�

	public Etudiant6_1(String nom, String prenom, String mail) {

		super(nom, prenom);
		this.mail = mail;

	}

}
