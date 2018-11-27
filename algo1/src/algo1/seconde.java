package algo1;

import java.util.Scanner;

public class seconde {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("calcul des heures minutes secondes à partir de secondes");

		String message1 = "le resultat en secondes est: ";
		String message2 = "le resultat en minutes est:";
		String message3 = "le resultat en heures est: ";
		String message4 = "entrez les secondes: ";
		// System.out.println(message1);
		// System.out.println(message2);
		// System.out.println(message3);
		// System.out.println(message4);

		// Double resultat;
		System.out.println(message4);
		Double seconde = scanner.nextDouble();
//		System.out.println(message3);
//		Double minute=sc.nextDouble();
//		System.out.println(message4);
//		Double seconde=sc.nextDouble();

//Double resultat=heure*3600+minute*60+seconde;
//System.out.println(resultat+"secondes");

		Double reste = seconde % 3600;
		System.out.println("le modulo de seconde/3600 est: " + reste);
		// if (reste>=1) {
		Double heure = seconde / 3600;
		// heure=Integer.parseInt(seconde/3600);
		System.out.println(message3 + heure);
		Double reste2 = reste % 60;
		Double minute = reste / 60;
		System.out.println(message2 + minute);
		// Double seconde=;

		// System.out.println(message3+minute);
		Double reste3 = reste2;

		System.out.println(message1 + reste3);

		// }

		// else {

		// System.out.println("le nombre max est"+val2);
//			System.out.println("le nombre min est"+val1);
	}
//	 
}
