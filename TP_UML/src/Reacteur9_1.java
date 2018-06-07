/**
 * 
 *Dans les exercices suivant vous devez créer les classes correspondantes aux situations énoncées. 

Exercice 9.1

L’avion à un nombre de hublot, il peut voler. 
Un réacteur peut être en panne ou non, et 
on peut savoir s’il est démarré ou non. Un avion à plusieurs réacteurs.
 *
 */

/**
 * @author franck Desmedt
 *composition de avion
 */
public class Reacteur9_1 {

	private boolean demarrer;
	private boolean panne;
	
	
	//setter getter
	/**
	 * @return the demarrer
	 */
	public boolean isDemarrer() {
		return this.demarrer;
	}
	/**
	 * @param demarrer the demarrer to set
	 */
	public void setDemarrer(boolean demarrer) {
		this.demarrer = demarrer;
	}
	/**
	 * @return the panne
	 */
	public boolean isPanne() {
		return this.panne;
	}
	/**
	 * @param panne the panne to set
	 */
	public void setPanne(boolean panne) {
		this.panne = panne;
	}
	
	
	
	//autre methode
	
	
	
}
