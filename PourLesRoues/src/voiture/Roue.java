/**
 * 
 */
package voiture;

/**
 * @author franck Desmedt
 *
 */
public class Roue {

	private String numSerie;

	
	//surcharge constructeur
	public Roue(String numSerie) {
		this.numSerie=numSerie;
	}
	
	//@override  redifinition de la classe toString
	public String toString() {
		return String.format("Roue numero: %s",  this.numSerie);
	}
	
	
	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
	}

	/**
	 * @param numSerie
	 *            the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

}
