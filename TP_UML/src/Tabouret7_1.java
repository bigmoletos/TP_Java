/**
 * * PARTIE 7 : Classe abstraite JAVA

* Dans les exercices suivant vous devez créer les classes correspondantes aux situations énoncées. 

*Exercice 7.1

*Un meuble à un nombre de planche, un nombre de vis et un nom.
* Une table est un meuble qui a un nombre de place et sur laquelle on peut manger. 
* Un tabouret est un meuble qui a un nombre de pieds et 
*que l’on peut occuper. Un meuble n’est pas assez spécialisé pour être utilisé.
 *
 **classe fille de Meuble7_1
 *
 *
 */

/**
 * @author franck Desmedt
 *
 */
public class Tabouret7_1 extends Meuble7_1 {
	private int nbPieds;
	private boolean assoir;

	// surchage du constructeur
	/**
	 * @param nbPlanche
	 * @param nbVis
	 * @param nom
	 */
	public Tabouret7_1(int nbPlanche, int nbVis, String nom, int nbPieds, boolean assoir) {
		super(nbPlanche, nbVis, nom);
		this.nbPieds = nbPieds;
		this.assoir = assoir;
	}

	// getter setter
	/**
	 * @return the nbPieds
	 */
	public int getNbPieds() {
		return this.nbPieds;
	}

	/**
	 * @param nbPieds
	 *            the nbPieds to set
	 */
	public void setNbPieds(int nbPieds) {
		this.nbPieds = nbPieds;
	}

	/**
	 * @return the assoir
	 */
	public boolean isAssoir() {
		return this.assoir;
	}

	/**
	 * @param assoir
	 *            the assoir to set
	 */
	public void setAssoir(boolean assoir) {
		this.assoir = assoir;
	}

	// autres methodes

	public void isAssoir(boolean assoir) {
		this.assoir = assoir;
	}

}
