/**
 * 
 *Dans les exercices suivant vous devez cr�er les classes correspondantes aux situations �nonc�es. 

Exercice 9.1

L�avion � un nombre de hublot, il peut voler. 
Un r�acteur peut �tre en panne ou non, et 
on peut savoir s�il est d�marr� ou non. Un avion � plusieurs r�acteurs.
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
