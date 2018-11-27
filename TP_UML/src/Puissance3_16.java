import java.util.Scanner;

/**
 * 
Exercice 3.16

Écrire de deux façons (itérative et récursive) 
une fonction ayant pour paramètres un entier x et un entier n, et retournant la valeur de x puissance n.

 */

/**
 * @author franck Desmedt
 *
 */
public class Puissance3_16 {

	private Scanner monClavier;

	// constructeur
	// on met ici le scanner dans le constructeur, pour l'appeler il faudra ensuite
	// faire this.clavier et non clavier
	public Puissance3_16() {
		this.monClavier = new Scanner(System.in);
	}

	public void PuissanceIteratif() {

		System.out.println("Choisissez le chiffre a elever à la puissance");
		int nbPuissance = Integer.parseInt(this.monClavier.nextLine());
		System.out.println("Choisissez la puissance");
		int puissance = Integer.parseInt(this.monClavier.nextLine());

		if (puissance == 0) {
			int resultat = 1;
			System.out.println(nbPuissance + "élevé à la puissance vaut: " + resultat);
		} else {
			for (int i = 0; i < puissance; i++) {
				long resultat = nbPuissance * nbPuissance;
				System.out.println(nbPuissance + "élevé à la puissance vaut: " + resultat);
			}

		}

	}

	public int PuissanceRecursif() {

		System.out.println("Choisissez le chiffre a elever à la puissance");
		int nbPuissance = Integer.parseInt(this.monClavier.nextLine());
		System.out.println("Choisissez la puissance");
		int puissance = Integer.parseInt(this.monClavier.nextLine());

		if (puissance == 0) {
			return 1;
		} else {
			int resultat = nbPuissance * PuissanceRecursif();
			System.out.println(nbPuissance + "élevé à la puissance vaut: " + resultat);
			return resultat;
		}
	}

	
	//autre methode charly
	public long PuissanceRecursifBis(long a, long b) {

		if (b == 0) {
			return a;
		} else {
			return a * PuissanceRecursifBis(a, b - 1);
		}
	}

}
