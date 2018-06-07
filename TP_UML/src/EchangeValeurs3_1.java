import java.util.Scanner;

/**
 * TP JAVA
 * Exercice 3.1
*
* Écrire une fonction permettant d’échanger les valeurs de deux entiers A et B, 
* et ce quel que soit leur contenu préalable.
 */

/**
 * @author franck Desmedt
 *
 */
public class EchangeValeurs3_1 {
	// attributs
	private int valA;
	private int valB;
	private int tmp;

	// autres methodes
	// methode echange les valeurs

	/**
	 * @return the valA
	 */
	public int getValA() {
		return this.valA;
	}

	/**
	 * @param valA
	 *            the valA to set
	 */
	public void setValA(int valA) {
		this.valA = valA;
	}

	/**
	 * @return the valB
	 */
	public int getValB() {
		return this.valB;
	}

	/**
	 * @param valB
	 *            the valB to set
	 */
	public void setValB(int valB) {
		this.valB = valB;
	}

	// /**
	// * @return the tmp
	// */
	// public int getTmp() {
	// return this.tmp;
	// }

	// /**
	// * @param tmp the tmp to set
	// */
	// public void setTmp(int tmp) {
	// this.tmp = tmp;
	// }

	// avec une fonction on a un retour donc un int ou autre d'ou public void
	public int[] permutte2(int[] A) {
		int[] Tab = new int[A.length];
		Tab[0] = A[1];
		Tab[1] = A[0];
		return Tab;
	}

	// autre version en mettant la methode en static, elle sera ainsi accessible
	// sans faire appel à la classe
	public static int[] permutte3(int[] A) {
		int[] Tab = new int[A.length];
		Tab[0] = A[1];
		Tab[1] = A[0];
		return Tab;
	}

	// avec une procedure on utilise public void
	public void permutte() {
		// saisie clavier des valerus A et B, sort forcement un String
		System.out.println("Veuillez selectionner la valeur de A: ");
		Scanner monScan = new Scanner(System.in);
		String valeurA = monScan.nextLine();

		System.out.println("Veuillez selectionner la valeur de B: ");
		String valeurB = monScan.nextLine();

		// cas d'une saisie string et non int

		// conversion de la saisie clavier string en int

		// try {
		// if( valA == Integer.parseInt(valeurA) {
		//
		// }
		// catch (ArithmeticException e) {
		// System.out.println("veuillez saisir un entier !");
		// }
		valA = Integer.parseInt(valeurA);
		valB = Integer.parseInt(valeurB);

		System.out.println("la valeur de A est: " + valA + " la valeur de B est: " + valB);
		tmp = valB;
		valB = valA;
		valA = tmp;
		System.out.println("Maintentant la valeur de A est: " + valA + " la valeur de B est: " + valB);
	}

	// methode pour permutter 3 valeurs tp3.2

	public static String[] permut3Val(String[] tab) {
		String tmp = tab[0];
		tab[0] = tab[2];
		tab[2] = tab[1];
		tab[1] = tmp;
		return tab;
	}
}
