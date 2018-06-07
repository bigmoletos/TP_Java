import java.util.Scanner;

/**
 * 
Exercice 11.1 (Morpion)

Le tic-tac-toe, aussi appelé « morpion », est un jeu de réflexion
 se pratiquant à deux joueurs au tour par tour dont le but est de créer le premier un alignement. 

Deux joueurs s'affrontent. Ils doivent remplir
 chacun à leur tour une case de la grille avec le symbole 
 qui leur est attribué ? Le gagnant est celui qui arrive à
  aligner trois symboles identiques, horizontalement, verticalement ou en diagonale.

Vous réaliserez un jeu de morpion opposant 2 joueurs
 qui pourront définir leur pseudo et les symboles qu’ils souhaitent utiliser.
Le jeu se déroulera en plusieurs manches définie par l’utilisateur. L’affichage se limitera à une sortie console.
 *
 *
 */

/**
 * @author franck Desmedt
 *
 */
public class Joueur11_3 {
	private String pseudo;
	private String symbole;
	private int nbScore;
	private int manche;
	private Scanner saisieClavier;
	// private objet joueur;

	// constructeur modifié pour initialiser le scanner
	public Joueur11_3() {
		this.saisieClavier = new Scanner(System.in);
	}

	// getter setter
	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return this.pseudo;
	}

	/**
	 * @param pseudo
	 *            the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @return the symbole
	 */
	public String getSymbole() {
		return this.symbole;
	}

	/**
	 * @param symbole
	 *            the symbole to set
	 */
	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}

	/**
	 * @return the nbScore
	 */
	public int getNbScore() {
		return this.nbScore;
	}

	/**
	 * @param nbScore
	 *            the nbScore to set
	 */
	public void setNbScore(int nbScore) {
		this.nbScore = nbScore;
	}

	/**
	 * @return the manche
	 */
	public int getManche() {
		return this.manche;
	}

	/**
	 * @param manche
	 *            the manche to set
	 */
	public void setManche(int manche) {
		this.manche = manche;
	}

	/**
	 * @return the saisieClavier
	 */
	public Scanner getSaisieClavier() {
		return this.saisieClavier;
	}

	/**
	 * @param saisieClavier
	 *            the saisieClavier to set
	 */
	public void setSaisieClavier(Scanner saisieClavier) {
		this.saisieClavier = saisieClavier;
	}

	// autres methode
	public Object joueur() {
		Scanner saisieClavier = new Scanner(System.in);
//for (int i = 0; i < 1; i++) {
	System.out.println("Entrez votre pseudo: ");
		this.pseudo = saisieClavier.nextLine();
		System.out.println("Entrez votre symbol: ");
		this.symbole = saisieClavier.nextLine();
		System.out.println("Combien de manche voulez-vous faire?  ");
		this.manche = Integer.parseInt(saisieClavier.nextLine());
		System.out.println("votre pseudo est: " + this.pseudo + " votre symbol est: " + this.symbole);
		return joueur();

//}
		
	}

}
