import java.util.Scanner;

/**
 * *3.11
 * Écrire une fonction demandant 
 * à l’utilisateur de saisir un entier 
 * strictement positif et réalisant l’affichage ci-dessous :
 * 						*
 					*********
 				***************
 */

/**
 * @author franck Desmedt
 *
 */
public class Pyramide3_11 {

	// methode fd
	public void pyramideFd() {
		Scanner clavier = new Scanner(System.in);
		String espaces = null;
		System.out.println("Choisissez la taille de votre pyramide");
		int taillePy = Integer.parseInt(clavier.nextLine());
		System.out.println("la taille de votre pyramide est: " + taillePy);
		String etoile = "*";
		for (int i = taillePy; i > 0; i--) {
			 espaces = " ";
			for (int j = i; j > 0; j--) {
				espaces += " ";
			}

			System.out.println(espaces + etoile);
			etoile = etoile + "**";
		}
	}

	public static void pyramid(int ligne) {
		String stars = "*";
		for (int i = ligne; i >= 0; i--) {
			String spaces = " ";
			for (int j = i; j > 0; j--) {
				spaces += " ";
			}
			System.out.println(spaces + stars);
			// on rajoute 2 etoiles, 1 a droite, 1 à gauche
			stars = stars + "**";
		}
	}

}