/**
 * 
 */
package Formation;

import java.util.ArrayList;

/**
 * @author franck Desmedt
 * @param <Stagiaire>
 *version franck Desmedt
 */
public class Personne<Stagiaire> {

	private String nom;
	private String prenom;

	//surcharge constructeur
//		/**
//	 * @param nom
//	 * @param prenom
//	 */
//	public Personne(String nom, String prenom) {
//		
//		this.nom = nom;
//		this.prenom = prenom;
//	}
//	
	
	// getter setter

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
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
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	
	
	// autres methodes
	
	// methode pour creer la personne stagiaire
	
	// c'est une association dont les membres ne doivent pas etre redondant
	// on va donc utiliser un Set<> avec hashSet<>
	// comme on aura plusieurs stagiaires sans en connaitre la valeur max, plutot
	// que de passer par un tableau
	// on va utiliser une collection
	public void stagiaire() {
		//private ArrayList<Stagiaire> listeStagiaires = new ArrayList<>();
		Personne stagiaire=new Personne();
		
	}
	
	
	//methode pour creer la personne formateur
	
	
	

}





