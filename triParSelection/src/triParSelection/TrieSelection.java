package triParSelection;

import java.util.Scanner;

/**
	 * algo permettant un tri sur des données par la méthode SELECTION On cherche
	 * dans la liste la plus petite valeur On la permute avec le premier élément de
	 * la liste. On cherche ensuite la plus petite valeur à partir de la deuxième
	 * case on la permute avec le second élément de la liste. ainsi de suite jusqu’à
	 * avoir parcouru toute la liste.
	 */

/**
 * @author franck Desmedt
 *
 */
public class TrieSelection{

		// attributs

		private int taille;
		private	int valeurAtrier;
		private	int valMini;
		private	int i;
		private	int j;
		private	int tmp;
	
		//getter et setter
		
		
	public void trieParSelection() {

	
		// System.out.println(tmp);

		// initialisation tableau de n(taille) valeurs

		// saisie clavier de la taille du tableau, sort forcement un String
		System.out.println("Veuillez selectionner la taille du tableau: ");
		Scanner monScan = new Scanner(System.in);
		String tailleTableau = monScan.nextLine();
		// String tailleTableau2 = monScan.nextLine();
		// String tailleTableau="10";
		System.out.println("la taille du tableau est de:  " + tailleTableau);
		// System.out.println("la taille du tableau est de: " + tailleTableau21);

		// conversion de la saisie clavier string en int
		taille = Integer.parseInt(tailleTableau);
		// initialisation tableau
		int[] tab1 = new int[taille];

		// boucle pour rentrer les n valeurs du tableau
		for (i = 0; i < tab1.length; i++) {
			// int l = tab1[taille];

			// saisie des valeurs du tableau
			System.out.println("Veuillez entrer une valeur: ");

			Scanner scanVal = new Scanner(System.in);
			String valTableau = scanVal.nextLine();

			// System.out.println("vous venez de saisir la valeur: " + valTableau);
			// conversion de la saisie clavier string en int
			valeurAtrier = Integer.parseInt(valTableau);

			// insertion des données saisies dans le tableau
			tab1[i] = valeurAtrier;
		}

		System.out.println("Tableau de vos données non triées: ");
		// boucle affichant les valeurs du tableau
		for (int k = 0; k < tab1.length; k++) {
			System.out.println(tab1[k]);
		}

		// algo de tri par selection
		valMini = tab1[0];
		System.out.println("valMini: "+valMini);
		//j diminue la  taille du tableau à chaque tour
		j = 0;
		for (int k = 0; k < tab1.length - j; k++) {
			if (valMini>tab1[k]) {
				valMini = tab1[k];
				j--;
				tab1[k]=valMini;
			} else {

			}
		}
		// boucle affichant les valeurs du tableau trié
				for (int k = 0; k < tab1.length; k++) {
					System.out.println(tab1[k]);
				}
				

	

	// fermeture du scanner
	// monScan.close();
	// scanVal.close();

	}

	//getter et setter
	
	/**
	 * @return the taille
	 */
	public int getTaille() {
		return this.taille;
	}

	/**
	 * @param taille the taille to set
	 */
	public void setTaille(int taille) {
		this.taille = taille;
	}

	/**
	 * @return the valeurAtrier
	 */
	public int getValeurAtrier() {
		return this.valeurAtrier;
	}

	/**
	 * @param valeurAtrier the valeurAtrier to set
	 */
	public void setValeurAtrier(int valeurAtrier) {
		this.valeurAtrier = valeurAtrier;
	}

	/**
	 * @return the valMini
	 */
	public int getValMini() {
		return this.valMini;
	}

	/**
	 * @param valMini the valMini to set
	 */
	public void setValMini(int valMini) {
		this.valMini = valMini;
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return this.i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}

	/**
	 * @return the j
	 */
	public int getJ() {
		return this.j;
	}

	/**
	 * @param j the j to set
	 */
	public void setJ(int j) {
		this.j = j;
	}

	/**
	 * @return the tmp
	 */
	public int getTmp() {
		return this.tmp;
	}

	/**
	 * @param tmp the tmp to set
	 */
	public void setTmp(int tmp) {
		this.tmp = tmp;
	}			
}