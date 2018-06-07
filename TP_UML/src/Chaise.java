/**
 * 
 */

/**
 * @author franck Desmedt
 *
 */
public class Chaise {
	private String couleur;
	private int nbPieds;
	private boolean occupe;

	// constructeur par defaut
	public Chaise() {
		// constructeur par defaut, ici on ne fait rien
	}

	// surcharge du constructeur par defaut
	public Chaise(String color, int pieds, boolean etat) {
		this.couleur = color;
		this.nbPieds = pieds;
		this.occupe = etat;
	}

	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur
	 *            the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

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
	 * @return the occupe
	 */
	public boolean isOccupe() {
		return this.occupe;
	}

	/**
	 * @param occupe
	 *            the occupe to set
	 */
	public void setOccupe(boolean occupe) {
		this.occupe = occupe;
	}

	// autres methode
	

}
