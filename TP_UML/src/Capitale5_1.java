/**
 * exo 5.1 reprise du 1.8
 *Une ville à un nom un nombre d’habitant. 
 *Une capitale est une ville, elle peut définir son nom et à un monument.
 *
 *capitale est une extension de ville
 */

/**
 * @author franck Desmedt
 *
 */

public class Capitale5_1 extends Ville5_1 {
	
	private String monument;

	// getter setter
	/**
	 * @return the monument
	 */
	public String getMonument() {
		return this.monument;
	}

	/**
	 * @param monument
	 *            the monument to set
	 */
	public void setMonument(String monument) {
		this.monument = monument;
	}

	// autres methodes
	public void nomMonument(String monument) {
		this.monument=monument;
	}

}
