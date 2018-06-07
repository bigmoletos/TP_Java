/**
 * 
 */
package GestionCommande;

/**
 * @author franck Desmedt
 *
 */
public class Produit {
	private String codeBarre;
	private double prix;
	private String designationProduit;
	
	//constructeur
		/**
	 * @param codeBarre
	 * @param prix
	 * @param designationProduit
	 */
	public Produit(String codeBarre, double prix, String designationProduit) {
		
		this.codeBarre = codeBarre;
		this.prix = prix;
		this.designationProduit = designationProduit;
	}
	
	
	//getter et setter
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return this.prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	/**
	 * @return the designationProduit
	 */
	public String getDesignationProduit() {
		return this.designationProduit;
	}
	/**
	 * @param designationProduit the designationProduit to set
	 */
	public void setDesignationProduit(String designationProduit) {
		this.designationProduit = designationProduit;
	}
	/**
	 * @return the codeBarre
	 */
	public String getCodeBarre() {
		return this.codeBarre;
	}
	
	//autre methode




}
