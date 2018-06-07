/**
 * * PARTIE 7 : Classe abstraite JAVA

* Dans les exercices suivant vous devez créer les classes correspondantes aux situations énoncées. 

*Exercice 7.1

*Un meuble à un nombre de planche, un nombre de vis et un nom.
* Une table est un meuble qui a un nombre de place et sur laquelle on peut manger. 
* Un tabouret est un meuble qui a un nombre de pieds et 
*que l’on peut occuper. Un meuble n’est pas assez spécialisé pour être utilisé.
 *
 *classe fille de Meuble7_1
 *
 */

/**
 * @author franck Desmedt
 *
 */
public class Table7_1 extends Meuble7_1 {
	private int nbPlace;
	private boolean manger;

	//surcharge constructeur
	/**
	 * @param nbPlanche
	 * @param nbVis
	 * @param nom
	 */
	public Table7_1(int nbPlanche, int nbVis, String nom, int nbPlace, boolean manger) {
		super(nbPlanche, nbVis, nom);
		this.nbPlace=nbPlace;
		this.manger=manger;
	}
	
	
	// getter setter

	

	/**
	 * @return the nbPlace
	 */
	public int getNbPlace() {
		return this.nbPlace;
	}

	/**
	 * @param nbPlace
	 *            the nbPlace to set
	 */
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	/**
	 * @return the manger
	 */
	public boolean isManger() {
		return this.manger;
	}

	/**
	 * @param manger
	 *            the manger to set
	 */
	public void setManger(boolean manger) {
		this.manger = manger;
	}

	// autre methode
	public void isManger(boolean manger) {
		this.manger = manger;
	}

}
