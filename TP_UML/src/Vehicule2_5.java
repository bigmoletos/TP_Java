/**
 * Exercice 2.5 (Interface)

*Une voiture et
 *une moto ont le même fonctionnement lié à la notion de véhicule, 
 *ils peuvent rouler à une vitesse donnée,
 * freiner jusqu’à une vitesse donnée,
 *  avoir un accident.
*Une moto peut avoir une selle pour le passager ou non.
*Une voiture à une capacité de coffre.
 */

/**
 * @author franck Desmedt
 *
 */
public class Vehicule2_5 {

	// attributs
	private int vitesse;
	private boolean sellePassager;
	private boolean coffre;

	// getter et setter
	/**
	 * @return the vitesse
	 */
	public int getVitesse() {
		return this.vitesse;
	}

	/**
	 * @param vitesse
	 *            the vitesse to set
	 */
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	/**
	 * @return the sellePassager
	 */
	public boolean isSellePassager() {
		return this.sellePassager;
	}

	/**
	 * @param sellePassager
	 *            the sellePassager to set
	 */
	public void setSellePassager(boolean sellePassager) {
		this.sellePassager = sellePassager;
	}

	/**
	 * @return the coffre
	 */
	public boolean isCoffre() {
		return this.coffre;
	}

	/**
	 * @param coffre
	 *            the coffre to set
	 */
	public void setCoffre(boolean coffre) {
		this.coffre = coffre;
	}

	/**
	 * @return the nbRoues
	 */
	public int getNbRoues() {
		return this.nbRoues;
	}

	/**
	 * @param nbRoues
	 *            the nbRoues to set
	 */
	public void setNbRoues(int nbRoues) {
		this.nbRoues = nbRoues;
	}

	private int nbRoues;

	// autre methode
	// methode freine

	public void freine() {

	}
	// methode roule à une certaine vitesse

	public void roule() {

	}

	// methode à un accident

}
