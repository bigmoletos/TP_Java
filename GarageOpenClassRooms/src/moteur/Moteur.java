/**
 * 
 */
package moteur;

import enumerations.TypeMoteur;

/**
 * @author franck Desmedt
 *
 */
public abstract class Moteur {
	private String cylindre;
	private double prix;
	// private TypeMoteur type; //inutile

	public Moteur() {

	}

	// surcharge constructeur
	public Moteur(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;

	}

	// final pour eviter la redefinition du prix
	public final double getPrix() {
		return this.prix;
	}

	// redéfinition méthode ToString
	 @Override
	 public String toString() {
	 String str = "Je suis un objet de la " + this.getClass().getName() + " mon type de cylindre est " + this.cylindre + ", mon prix " + this.prix;
	 // String str = "Je suis un objet de la " + this.getClass() + ", mon type de
	 // cylindre est " + this.cylindre + ", mon prix " + this.prix;
	 return str;
	 }
	
	// autre methode de redefinition de ToString
//	@Override
//	public String toString() {
//		StringBuilder strBuilder = new StringBuilder();
//		// Option listeOption = null;
//		//
//		strBuilder.append("la cylindré est: " + this.cylindre + " le prix est de :" + this.prix + " €");// append va
//																										// rajouter la
//																										// chaine entre
//																										// ()
//		strBuilder.append('\n');
//
//		return strBuilder.toString();// on renvoie la chaine toString compléte
//	}

	//méthode getTypeMoteur
	public abstract TypeMoteur geTypeMoteur();

}
