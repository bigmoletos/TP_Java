/**
 * 
 */
package testsSurProjet;

/**
 * @author franck Desmedt
 *
 */
public class Produit {
	
		private final String codeBarre;
		private double prix;
		private String designation;
		
	public double getPrix() {
			return prix;
		}
		public void setPrix(double prix) {
			this.prix = prix;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getCodeBarre() {
			return codeBarre;
		}

		public Produit(String codeBarre,String designation, double prix) {
			this.codeBarre= codeBarre;
			this.designation = designation;
			this.prix = prix;
		
		}

		
		
	}



