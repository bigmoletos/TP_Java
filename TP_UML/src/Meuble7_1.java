/**
 * PARTIE 7 : Classe abstraite JAVA

* Dans les exercices suivant vous devez créer les classes correspondantes aux situations énoncées. 

*Exercice 7.1

*Un meuble à un nombre de planche, un nombre de vis et un nom.
* Une table est un meuble qui a un nombre de place et sur laquelle on peut manger. 
* Un tabouret est un meuble qui a un nombre de pieds et 
*que l’on peut occuper. Un meuble n’est pas assez spécialisé pour être utilisé.
 */

/**
 * @author franck Desmedt
 *
 */
public abstract class Meuble7_1 {
	private int nbPlanche;
	private int nbVis;
	private String nom;

	
	//constructeur par defaut
	public Meuble7_1() {
		
	}
	
	//surcharge constructeur
	/**
	 * @param nbPlanche
	 * @param nbVis
	 * @param nom
	 */
	public Meuble7_1(int nbPlanche, int nbVis, String nom) {
		super();
		this.nbPlanche = nbPlanche;
		this.nbVis = nbVis;
		this.nom = nom;
	}

	// getter setter
	/**
	 * @return the nbPlanche
	 */
	public int getNbPlanche() {
		return this.nbPlanche;
	}

	/**
	 * @param nbPlanche
	 *            the nbPlanche to set
	 */
	public void setNbPlanche(int nbPlanche) {
		this.nbPlanche = nbPlanche;
	}

	/**
	 * @return the nbVis
	 */
	public int getNbVis() {
		return this.nbVis;
	}

	/**
	 * @param nbVis
	 *            the nbVis to set
	 */
	public void setNbVis(int nbVis) {
		this.nbVis = nbVis;
	}

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

}
