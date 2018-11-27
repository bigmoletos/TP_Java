import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// appel de la classe Utilisateur

		Utilisateur user = new Utilisateur();
		//on assigne une valeur à l'attribut nom de la classe utilisateur via le SETTER
		user.setNom("franck");
		
		System.out.println(user.getNom());

		// variables

		int small = 2121212122;
		long big = 95116651656664444l;

		small = (int) big;

		System.out.println("hello world");
		System.out.print("\nhello world\n");
		System.out.print("\nhello world\n" + " encore une entrée " + 10 + "\n");

		int[] tab1 = new int[10];

		tab1[1] = 2;

		int[][] tab2 = new int[10][10];
		// tab2[0][5]=10;

		for (int i = 0; i < tab2.length; i++) {
			for (int j = 0; j < tab2[i].length; j++) {
				tab2[i][j] = i + j;
				System.out.println(tab2);
			}
		}

		System.out.println("entrez votre age: ");

		Scanner monScan = new Scanner(System.in);
		String saisieClavier = monScan.nextLine();
		System.out.println("votre age est de " + saisieClavier);

		monScan.close();
		int var1 = 3;
		int var2 = 5;

		if (var1 > var2) {
			System.out.println("la variable var1: " + var1 + " est plus grand que la variable var2: " + var2);
		} else {
			System.out.println("la variable var1: " + var1 + " est plus petite que la variable var2: " + var2);
		}

	}
}
