
//import java.util.Arrays;
import java.util.Scanner;

/**
 * *Exercice 11.1

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
 *associe a la classe JeuDevine11_1
 */

/**
 * @author franck Desmedt
 *
 */
public class InterfaceJeuDevine11_1 {
	private boolean rejouer;
	private Scanner saisieClavier;
	private int score = 0;
	private String pseudo;
	private int choixNombre=0;
	private JeuDevine11_1 jeuDe;// definition attribut de la classe JeuDevine11_1

	// modif du constructeur avec le scanner et instanciation d'un objet jeuDe de la
	// classe JeuDevine11_1
	public InterfaceJeuDevine11_1() {
		this.saisieClavier = new Scanner(System.in);
		this.jeuDe = new JeuDevine11_1();
	}

	// getter setter
	/**
	 * @return the rejouer
	 */
	public boolean isRejouer() {
		return this.rejouer;
	}

	/**
	 * @param rejouer
	 *            the rejouer to set
	 */
	public void setRejouer(boolean rejouer) {
		this.rejouer = rejouer;
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

	/**
	 * @return the score
	 */
	public int getScore() {
		return this.score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the jeuDe
	 */
	public JeuDevine11_1 getJeuDe() {
		return this.jeuDe;
	}

	/**
	 * @param jeuDe
	 *            the jeuDe to set
	 */
	public void setJeuDe(JeuDevine11_1 jeuDe) {
		this.jeuDe = jeuDe;
	}

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
	 * @return the choixNombre
	 */
	public int getChoixNombre() {
		return this.choixNombre;
	}

	/**
	 * @param choixNombre
	 *            the choixNombre to set
	 */
	public void setChoixNombre(int choixNombre) {
		this.choixNombre = choixNombre;
	}

	public String lancementJeu() {
		System.out.println("Bienvenue vous allez commencer une nouvelle partie!");
		System.out.println("quel est votre pseudo");
		this.pseudo = this.saisieClavier.nextLine();

		return this.pseudo;
	}

	// autres methodes
	// methode moteur du jeu
	public boolean jouer() {
		// compare les valeurs de 2 tableaux
		// Arrays.equals(a, a2);
		// resultat=0;
		this.rejouer = true;
		boolean resultat = false;
		this.score = 0;
		this.lancementJeu();
		System.out.println(this.pseudo + " ");
		while (this.rejouer) {
			// System.out.println("chiffre alea: " + jeuDe.valAleatoire());
			// System.out.println("chiffre alea: " + jeuDe.getValAleatoire());
			// appel de la methode valAleatoire de la classe JeuDevine11_1 via l'objet
			// jeuDe.valAleatoire();
			int nbreCible = jeuDe.valAleatoire();
			// boucle jouer
			while (!resultat) {
				// System.out.println(" Veuillez entrer un chiffre entre 10 et 20");
				// int choixNombre = Integer.parseInt(this.saisieClavier.nextLine());
				// on lance le controle de saisi des caracteres
				this.controleChoixNombre();
				System.out.println("vous avez entré le chiffre: " + this.choixNombre);

				if (nbreCible == this.choixNombre) {
					// partie gagnée
					System.out.println("Bravo " + this.pseudo + " vous avez gagné !");
					System.out.println("Votre score est de: " + this.score);
					// rejouer

					resultat = false;
					this.rejouer();
					System.out.println("Votre score est de: " + this.score);

				} else if (this.choixNombre < nbreCible) {

					// chiffre trop petit
					System.out.println("Le chiffre recherché est plus grand !");
					this.score++;
					System.out.println("Votre score est de: " + this.score);
					resultat = false;

				} else {
					// chiffre trop grand
					System.out.println("Le chiffre recherché est plus petit !");
					this.score++;
					System.out.println("Votre score est de: " + this.score);
					resultat = false;
				}
			}
		}
		return resultat;
	}

	public void rejouer() {

		System.out.println("Voulez-vous rejouer?(oui/non)");
		String reponseRejouer = this.saisieClavier.nextLine();

		if (reponseRejouer.equals("oui") || reponseRejouer.equals("1") || reponseRejouer.equals("yes")) {
			System.out.println("etat rejouer: " + this.rejouer);
			this.rejouer = true;
			// return this.rejouer;

		} else {
			System.out.println("Fin du jeu, à bientôt!");
			System.out.println(this.pseudo + "! votre score est de: " + this.score);
			this.rejouer = false;
			// this.jouer();
		}
		// System.out.println("etat rejouer: " + this.rejouer);
		// return this.rejouer;

	}

	// methode permettant de controler la saisie du chiffre, afin d'eviter une
	// erreur
	// si le joueur entre un string
	public int controleChoixNombre() {
		
		boolean erreur = false;
		while (erreur==false) {
			try {
				System.out.println(" Veuillez entrer un chiffre entre 10 et 20");
				this.choixNombre = Integer.parseInt(this.saisieClavier.nextLine());
				erreur = false;
				return this.choixNombre;
				// retour erreur si saisie d'un caractere :java.lang.NumberFormatException
			} catch (java.lang.NumberFormatException e) {
				System.out.println("veuillez saisir uniquement un nombre!");
				// this.controleChoixNombre();
				erreur = true;
			}
		}
		return this.choixNombre;
	}
}
