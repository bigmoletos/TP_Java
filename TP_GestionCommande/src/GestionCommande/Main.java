/**
 * 
 */
package GestionCommande;

/**
 * @author franck Desmedt
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Commande dateDuJour = new Commande();
		//dateDuJour.dateCde();
		//System.out.println(dateDuJour.dateCde());
		
		Commande nouvelLigneCde = new Commande();
		nouvelLigneCde.ajoutProduit("farine",2,25);
		
		
		Commande numeroIdentifiantCde = new Commande();
		Commande numeroIdentifiantCde2 = new Commande();
		Commande numeroIdentifiantCde3 = new Commande();
		System.out.printf("%s\n",numeroIdentifiantCde.numeroIdentifiantCde("haricot verts"));
		System.out.printf("%s\n",numeroIdentifiantCde2.numeroIdentifiantCde("haricot blanc"));
		System.out.printf("%s\n",numeroIdentifiantCde3.numeroIdentifiantCde("farine"));
		//System.out.println(numeroIdentifiantCde.numeroIdentifiantCde("haricot verts"));
		//numeroIdentifiantCde.genereCompteur();
		
		
		
	}
}
