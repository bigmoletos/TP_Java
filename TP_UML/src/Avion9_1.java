/**
 * Dans les exercices suivant vous devez créer les classes correspondantes aux situations énoncées. 

Exercice 9.1

L’avion à un nombre de hublot, il peut voler. 
Un réacteur peut être en panne ou non, et 
on peut savoir s’il est démarré ou non. Un avion à plusieurs réacteurs.
 *
 *
 */

/**
 * @author franck Desmedt
 *
 */
public class Avion9_1 {

	private int nbHublot;
	private boolean voler;
	private Reacteur9_1[] reacteur;
	
	//getter setter
	
	/**
	 * @return the nbHublot
	 */
	public int getNbHublot() {
		return this.nbHublot;
	}



	/**
	 * @param nbHublot the nbHublot to set
	 */
	public void setNbHublot(int nbHublot) {
		this.nbHublot = nbHublot;
	}



	/**
	 * @return the voler
	 */
	public boolean isVoler() {
		return this.voler;
	}



	/**
	 * @param voler the voler to set
	 */
	public void setVoler(boolean voler) {
		this.voler = voler;
	}



	/**
	 * @return the reacteur
	 */
	public Reacteur9_1[] getReacteur() {
		return this.reacteur;
	}



	/**
	 * @param reacteur the reacteur to set
	 */
	public void setReacteur(Reacteur9_1[] reacteur) {
		this.reacteur = reacteur;
	}



	//autre methode
	public void isVoler(boolean voler, boolean demarre) {
		
	}
	
	
}
