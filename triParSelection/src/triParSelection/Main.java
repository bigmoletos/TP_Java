/**
 * 
 */
package triParSelection;



/**
 * @author franck Desmedt
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//appel de la methode trieSelection de la classe TrieSelection.java
		
		TrieSelection selection=new TrieSelection();
		
		selection.setI(0);
		selection.setTaille(10);
		
		
		
		//System.out.println(selection);
		

//		/**
//		 * algo permettant un tri sur des données par la méthode SELECTION On cherche
//		 * dans la liste la plus petite valeur On la permute avec le premier élément de
//		 * la liste. On cherche ensuite la plus petite valeur à partir de la deuxième
//		 * case on la permute avec le second élément de la liste. ainsi de suite jusqu’à
//		 * avoir parcouru toute la liste.
//		 */
//
//		/**
//		 * @author franck Desmedt
//		 *
//		 */
//
//		// public void trieParSelection() {
//
//		// attributs
//
//		int taille;
//		int valeurAtrier;
//		int valMini;
//		int i;
//		int j;
//		int tmp;
//		// System.out.println(tmp);
//
//		// initialisation tableau de n(taille) valeurs
//
//		// saisie clavier de la taille du tableau, sort forcement un String
//		System.out.println("Veuillez selectionner la taille du tableau: ");
//		Scanner monScan = new Scanner(System.in);
//		String tailleTableau = monScan.nextLine();
//		// String tailleTableau2 = monScan.nextLine();
//		// String tailleTableau="10";
//		System.out.println("la taille du tableau est de:  " + tailleTableau);
//		// System.out.println("la taille du tableau est de: " + tailleTableau21);
//
//		// conversion de la saisie clavier string en int
//		taille = Integer.parseInt(tailleTableau);
//		// initialisation tableau
//		int[] tab1 = new int[taille];
//
//		// boucle pour rentrer les n valeurs du tableau
//		for (i = 0; i < tab1.length; i++) {
//			// int l = tab1[taille];
//
//			// saisie des valeurs du tableau
//			System.out.println("Veuillez entrer une valeur: ");
//
//			Scanner scanVal = new Scanner(System.in);
//			String valTableau = scanVal.nextLine();
//
//			// System.out.println("vous venez de saisir la valeur: " + valTableau);
//			// conversion de la saisie clavier string en int
//			valeurAtrier = Integer.parseInt(valTableau);
//
//			// insertion des données saisies dans le tableau
//			tab1[i] = valeurAtrier;
//		}
//
//		System.out.println("Tableau de vos données non triées: ");
//		// boucle affichant les valeurs du tableau
//		for (int k = 0; k < tab1.length; k++) {
//			System.out.println(tab1[k]);
//		}
//
//		// algo de tri par selection
//		valMini = tab1[0];
//		System.out.println("valMini: "+valMini);
//		//j diminue la  taille du tableau à chaque tour
//		j = 0;
//		for (int k = 0; k < tab1.length - j; k++) {
//			if (valMini>tab1[k]) {
//				valMini = tab1[k];
//				j--;
//				tab1[k]=valMini;
//			} else {
//
//			}
//		}
//		// boucle affichant les valeurs du tableau trié
//				for (int k = 0; k < tab1.length; k++) {
//					System.out.println(tab1[k]);
//				}
//				
//
//	}
//
//	// fermeture du scanner
//	// monScan.close();
//	// scanVal.close();
//
}

 }
