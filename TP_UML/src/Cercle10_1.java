import javax.swing.plaf.SliderUI;

/**
 * exo sur la delegation
 *Exercice 10.1

	Un cercle est d�fini par un objet Point qui est son centre et par un rayon qui est un entier. 
Nous pouvons d�placer ce cercle en donnant de nouvelles coordonn�es x, y
 pour d�finir la position du centre du cercle.
  Le d�placement du centre sera d�l�gu� au d�placement du Point qui d�finit le centre.

 *
 */

/**
 * @author franck Desmedt
 *
 */
public class Cercle10_1 {

	private double rayon;
	private Point10_1  deplacement; //attribut  permettant la delegation de la methode translation de la classe Point10_1
	 
	
	//autres methodes
	//position du cercle
	//delegation de la methode translation de la classe Point10_1
	public void translation(int dx, int dy) {
		
		deplacement.translation(dx, dy);
		
	}


	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return this.rayon;
	}


	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	/**
	 * @return the centre
	 */
	public Point10_1 getDeplacement() {
		return this.deplacement;
	}


	/**
	 * @param centre the centre to set
	 */
	public void setDeplacement(Point10_1 deplacement) {
		this.deplacement = deplacement;
	}	

	
	}

