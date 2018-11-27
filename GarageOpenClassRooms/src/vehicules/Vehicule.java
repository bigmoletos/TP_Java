/**
 * 
 */
package vehicules;

import java.util.HashSet;
import java.util.Set;

import enumerations.*;
import moteur.Moteur;
import option.Option;

/**
 * @author franck Desmedt
 *
 */
public abstract class Vehicule {

	private Set<Option> listeOption = new HashSet<>();// liste des options
	private Double prix;
	// private Marque nomMarque;
	private String nom;
	private Moteur moteur;

	// setter et getter

	public Double getPrix() {
		return this.prix;
	}

	// methode getMarque du type de l'énumératon Marque
	public abstract Marque getNomMarque();

	public String getNom() {
		return this.nom;
	}

	// methode pour ajouter une option dansla liste des options
	public void addOption(Option option) {
		listeOption.add(option);

	}

	public void setMoteur(Moteur moteur) {
		// TODO Auto-generated method stub
		this.moteur = moteur;

	}

	// public void getMoteur(Moteur moteur) {
	// // TODO Auto-generated method stub
	// this.moteur = moteur;
	//
	// }

	// redéfinition ToString
	@Override
	public String toString() {

		//StringBuilder strBuilder = new StringBuilder();
		// parcours la liste HashSet listeOption et affiche le contenu
		for (Option option : listeOption) {
			//strBuilder.append(option.toString());// append va rajouter la chaine entre ()
			//strBuilder.append("\n");
			System.out.println("option pour cette voiture: "+option);

		}
		return listeOption.toString();
		//return strBuilder.toString();// on renvoie la chaine toString compléte
	}

}
