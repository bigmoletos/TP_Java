import java.util.Scanner;

/**
 * Exercice 3.15

Écrire une fonction qui demandera à l’utilisateur deux chiffre entre 1 et 10. 
On utilisera les chiffres saisis comme taille d’un tableau de chaine de caractère à deux dimensions.
On initialisera toutes les cases de ce tableau avec la concaténation 
suivante : « Cette cellule correspond à la première dimension i et
 à la deuxième dimension j. » (on remplacera i et j par les index du tableau).
Ce tableau sera ensuite retourné.
 * 
 * 
 * 
 * 
 */

/**
 * @author franck Desmedt
 *
 */
public class Tableau2Dim3_15 {
Scanner clavier=new Scanner(System.in);	
	// scanner dans le constructeur

	public Tableau2Dim3_15() {
		this.clavier = new Scanner(System.in);
	}

	public String[][] tableau2Dim() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quelle est le nombre de  colonnes?(max 10)");
		int nbCol = Integer.parseInt(this.clavier.nextLine());
		System.out.println("Quelle est la nombre de  lignes?(max 10)");
		int nbLignes = Integer.parseInt(this.clavier.nextLine());

		// instanciation tableau à 2 dimensions
		String[][] tabDouble = new String[nbCol][nbLignes];
		for (int i = 0; i < nbCol; i++) {

			for (int j = i; j < nbLignes; j++) {
				tabDouble[i][j] = "Cette cellule correspond à la colonne " + i + "et à la ligne index" + j;
				// System.out.println("Cette cellule correspond à la colonne " + i + "et à la
				// ligne index" + j);
			}
		}
		return tabDouble;
	}

	// on peut auss passer par une methode privee
	// pour factoriser la fonction saisie de chiffre entre de 2 bornes
	private int numberBetweenOneAndTen() {
		int number = -1;
		while (number < 1 || number > 10) {
			System.out.println("choisir unnombre entre 1 et 10: ");
			number = Integer.parseInt(this.clavier.nextLine());
		}
		return number;
	}

	// autre methode en passant par lafonction privée quipefmet de choisir un
	// chiffre numberBetweenOneAndTen
	public String[][] tableau2DimBis() {
		// Scanner scanner = new Scanner(System.in);

		int nbCol = this.numberBetweenOneAndTen();
		int nbLignes = this.numberBetweenOneAndTen();

		// instanciation tableau à 2 dimensions
		String[][] tabDouble = new String[nbCol][nbLignes];
		for (int i = 0; i < nbCol; i++) {

			for (int j = i; j < nbLignes; j++) {
				tabDouble[i][j] = "Cette cellule correspond à la colonne " + i + "et à la ligne index" + j;
				// System.out.println("Cette cellule correspond à la colonne " + i + "et à la
				// ligne index" + j);
			}
		}
		return tabDouble;
	}

}
