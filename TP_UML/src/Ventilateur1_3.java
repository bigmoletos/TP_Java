/**
 * TP UML 1.3
 * Un ventilateur à une marque et est composé de pales.
 *  Il peut ventiler une pièce si on lui précise une vitesse.
 */

/**
 * @author franck Desmedt
 *
 */
public class Ventilateur1_3 {

	private String nomMarque;
	private int pales;
	private int vitesse;
	
	
	//getter et setter
	/**
	 * @return the nomMarque
	 */
	public String getNomMarque() {
		return this.nomMarque;
	}
	/**
	 * @param nomMarque the nomMarque to set
	 */
	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}
	/**
	 * @return the pales
	 */
	public int getPales() {
		return this.pales;
	}
	/**
	 * @param pales the pales to set
	 */
	public void setPales(int pales) {
		this.pales = pales;
	}
	/**
	 * @return the vitesse
	 */
	public int getVitesse() {
		return this.vitesse;
	}
	/**
	 * @param vitesse the vitesse to set
	 */
	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	
	//autres methodes
	//methode ventile en fonction de la vitesse
	//on aurait pu mettre cette methode à l'interieur du setter
	public void ventile(int vitesse) {
		if(vitesse>1) {
			System.out.println("la vitesse du ventilateur est de :"+this.vitesse);
			
		}
	}
	
}
