
public class Maison {

	private int nbPieces;
	private int nbFenetres;
	private int nbPortes;
	private boolean etat;

	// getter et setter

	/**
	 * @return the nbPieces
	 */
	public int getNbPieces() {
		System.out.println("cette maison comporte "+this.nbPieces+" pieces.");
		return nbPieces;
	}

	/**
	 * @param nbPieces
	 *            the nbPieces to set
	 */
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	/**
	 * @return the nbFenetres
	 */
	public int getNbFenetres() {
		return nbFenetres;
	}

	/**
	 * @param nbFenetres
	 *            the nbFenetres to set
	 */
	public void setNbFenetres(int nbFenetres) {
		this.nbFenetres = nbFenetres;
	}

	/**
	 * @return the nbPortes
	 */
	public int getNbPortes() {
		return nbPortes;
	}

	/**
	 * @param nbPortes
	 *            the nbPortes to set
	 */
	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

	/**
	 * @return the etat
	 */
	public boolean getEtat() {
		return etat;
	}

	/**
	 * @param etat
	 *            the etat to set
	 */
	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	// methode etat nettoyage
	private void nettoie() {

		if (this.etat) {
			System.out.println("la maison est nettoyée");
		} else {
			System.out.println("la maison n'est pas nettoyée");
		}

	//	 (this.etat==(true))? System.out.println("la maison est nettoyée") : System.out.println("la maison n'est pas nettoyée");

	}
}
