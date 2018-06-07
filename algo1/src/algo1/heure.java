/**
 * 
 */
package algo1;

import java.util.Scanner;
//importation de toutes les classes du package java.util
//import java.util.*;

/**
 * @author FD
 *
 */
public class heure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("calcul des heures minutes secondes");
		Scanner sc = new Scanner(System.in);
		String message1 = "le resultat en secondes est: ";
		String message2 = "entrez les heures ";
		String message3 = "entrez les minutes: ";
		String message4 = "entrez les secondes: ";
		//System.out.println(message1);
		//System.out.println(message2);
		//System.out.println(message3);
		//System.out.println(message4);

		//Double   resultat;
		System.out.println(message2);
		Double heure=sc.nextDouble();
		System.out.println(message3);
		Double minute=sc.nextDouble();
		System.out.println(message4);
		Double seconde=sc.nextDouble();


Double resultat=heure*3600+minute*60+seconde;
System.out.println(resultat+"secondes");

	/*	if (val1 > val2) {
			System.out.println("le nombre max est"+val1);
			System.out.println("le nombre min est"+val2);}
		else {
			System.out.println("le nombre max est"+val2);
			System.out.println("le nombre min est"+val1);
		}
	 */
	}

}
