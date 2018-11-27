package algo1;

import java.util.Scanner;

public class tableMutliplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("choix saisi entre 1 et 3 ");

		// String message1 = "table de: ";
		// String message2 = "à :";
		String message3 = "bravo vous avez trouvé le bon résultat ";
		String message4 = "entrez un nombre entre 1 et 3 ";
		// System.out.println(message1);
		// System.out.println(message2);
		// System.out.println(message3);
		// System.out.println(message4);

		// Double resultat;
		// System.out.println(message4);
		// Double seconde=sc.nextDouble();
//		System.out.println(message3);
//		Double minute=sc.nextDouble();
//		System.out.println(message4);
//		Double seconde=sc.nextDouble();

//Double resultat=heure*3600+minute*60+seconde;
//System.out.println(resultat+"secondes");

		// Int resultat=1;

		int toto = 2;
		while (toto > 1 && toto < 3) {
			System.out.println(message4);
			toto = sc.nextInt();

			// int nbre=sc.nextInt();
			System.out.println(message3);

		}
	}
}
