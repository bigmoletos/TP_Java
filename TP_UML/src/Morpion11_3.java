import java.util.Scanner;

/**
 * 
 *
Exercice 11.1 (Morpion)

Le tic-tac-toe, aussi appelé « morpion », est un jeu de 
réflexion se pratiquant à deux joueurs au tour 
par tour dont le but est de créer le premier un alignement. 

Deux joueurs s'affrontent. Ils doivent 
remplir chacun à leur tour une case de la grille avec le symbole qui leur est attribué ? 
Le gagnant est celui qui arrive à aligner trois symboles identiques, horizontalement, verticalement ou en diagonale.

Vous réaliserez un jeu de morpion opposant 2 joueurs qui
 pourront définir leur pseudo et les symboles qu’ils souhaitent utiliser.
Le jeu se déroulera en plusieurs manches 
définie par l’utilisateur. L’affichage se limitera à une sortie console.

 *		veuillez entrer le nom du joueur 1
 *		veuillez entrer le symbole du joueur 1
 *		
 * * *
 *		veuillez entrer lde nom du joueur 2
 *		veuillez entrer le symbole du joueur 2
 *	combien de manche voulez-vous faire?
 *le jeu peut commencer joueur 1 contre joueur 2
 *1er manche:
 *joueur 1 veuillez entrer la ligne et la colonne visée
 *joueur 2 veuillez entrer la ligne et la colonne visée
 *
 *	
 *		|__x_|__o_|___|
 *		|_o__|__x_|___|		
 *		|    |  o | x |		
 *		
 *				
 *		
 */

/**
 * @author franck Desmedt
 *
 */
public class Morpion11_3 {
	//private Joueur11_3[] joueur;
	private boolean score;
	private Scanner saisieClavier;

	//instanciatin de la classe Joueur11_3  des 2 joueurs
	//Joueur11_3 joueur1=new Joueur11_3();
	Joueur11_3 joueur2=new Joueur11_3();
	// constructeur modifié pour initialiser le scanner
		public Morpion11_3() {
			this.saisieClavier = new Scanner(System.in);
		}
	
	// Getter setter
	/**
//	 * @return the joueur
//	 */
//	public Joueur11_3[] getJoueur() {
//		return this.joueur;
//	}
//
//	/**
//	 * @param joueur
//	 *            the joueur to set
//	 */
//	public void setJoueur(Joueur11_3[] joueur) {
//		this.joueur = joueur;
//	}

	/**
	 * @return the score
	 */
	public boolean isScore() {
		return this.score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(boolean score) {
		this.score = score;
	}
	
	
	//autre mehtode
	//methode intialisatin du jeu
//	public void initialisationJeu() {
//		Scanner saisieClavier = new Scanner(System.in);
//
//		
//		for (int i = 1; i < 2; i++) {
//			String[][] tabJoueurs = new String[2][1];
//			System.out.println("veuillez entrer votre pseudo: ");
//			joueur1.this.pseudo = saisieClavier.nextLine();
//			// tableau double entrée d'ou erreur, faire un double for pour le remplir
//			for (int j = 0; j < tabJoueurs.length; j++) {
//				System.out.println("Entrez votre symbol: ");
//				this.symbole = saisieClavier.nextLine();
//				tabJoueurs[i][j] = saisieClavier.nextLine();
//			}
//  
//			String joueur;
//			System.out.println("Joueur: " + this.joueur);
//			System.out.println("veuillez entrer la ligne visée: ");
//			int ligneCible = Integer.parseInt(saisieClavier.nextLine());
//
//			System.out.println("veuillez entrer la colonne visée: ");
//			int colCible = Integer.parseInt(saisieClavier.nextLine());
//
//		}
//	}
//}
	
	public void initJoueurs() {
	//TODO faire un tableau d'objet avec des objects joueurs
		
		Joueur11_3 joueur1=new Joueur11_3();
		joueur1.joueur();
	 joueur2.joueur();
	}
	
	//methode algo du jeu
	public void jeuMorpion() {
		
		
	}
	
}
