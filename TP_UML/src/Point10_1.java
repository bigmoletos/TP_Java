/**
 * exo sur la delegation
 * *Exercice 10.1

	Un cercle est défini par un objet Point qui est son centre et par un rayon qui est un entier. 
Nous pouvons déplacer ce cercle un donnant de nouvelles coordonnées x, y
 pour définir la position du centre du cercle.
  Le déplacement du centre sera délégué au déplacement du Point qui définit le centre.

 *delegation de cercle10_1
 */

/**
 * @author franck Desmedt
 *
 */
public class Point10_1 {
	private int x;
	private int y;

	
	//autre methode
	//methode qui sera deleguée à la classe Cercle10_1
	public void translation(int x, int y) {
		this.x = x;
		this.y = y;

	}

	
	// getter setter
	/**
	 * @return the x
	 */
	public int getX() {
		return this.x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return this.y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	
	
//	public void translation(int dx, int dy) {
//		
//		
//	}

}
