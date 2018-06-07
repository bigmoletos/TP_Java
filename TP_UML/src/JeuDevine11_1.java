import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;
/**
 * 
 *Exercice 11.1

Le jeu consiste à découvrir par essais successifs un nombre
 sélectionner par hasard par le programme. Pour chaque essai,
  le joueur reçoit un message : "Le chiffre recherché est plus grand !", 
  "Le chiffre recherché est plus petit !" ou "Bien joué !
le nombre à trouver était : 18, trouvé en 4 coups !". 

La partie est finie quand le joueur a trouvé le nombre.

A la fin d’une partie, l’utilisateur doit 
indiquer s’il veut faire une nouvelle partie ou non. 

Pour choisir un nombre au hasard on utilisera la méthode 
random de la classe Math qui retourne un réel (double) tiré au hasard et
 de manière uniforme dans l'intervalle [0 1].

Pour choisir un nombre au hasard, on utilisera la Random de la sorte : 
Random rand = new Random();
rand.nextInt(100);  obtenir un nombre entre 0 et 100
 *
 */

/**
 * @author franck Desmedt
 *
 */
public class JeuDevine11_1 {

	private Scanner saisieClavier2;
	private int valAleatoire;

	// constructeur modifié pour initialiser le scanner
	public JeuDevine11_1() {
		this.saisieClavier2 = new Scanner(System.in);
	}

	// getter et setter
	/**
	 * @return the saisieClavier2
	 */
	public Scanner getSaisieClavier2() {
		return this.saisieClavier2;
	}

	/**
	 * @param saisieClavier2
	 *            the saisieClavier2 to set
	 */
	public void setSaisieClavier2(Scanner saisieClavier2) {
		this.saisieClavier2 = saisieClavier2;
	}

	// autres methodes
	// methode creation d'un chiffre aleatoire entre bornes

	/**
	 * @return the valAleatoire
	 */
	public int getValAleatoire() {
		return this.valAleatoire;
	}

	/**
	 * @param valAleatoire the valAleatoire to set
	 */
	public void setValAleatoire(int valAleatoire) {
		this.valAleatoire = valAleatoire;
	}

	public int valAleatoire() {

		// nombre aléatoire entre 2 bornes min et max
		// Random r = new Random();
		// int valeur = valeurMin + r.nextInt(valeurMax - valeurMin)
		Random randomNb = new Random();
		this.valAleatoire = 10 + randomNb.nextInt(20 - 10);
		return this.valAleatoire;

	}

}
