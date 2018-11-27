import java.util.Scanner;

/**
 * Exercice 3.10

Écrire un algorithme qui demande un nombre compris entre 10 et 20, 
jusqu’à ce que la réponse convienne. En cas de réponse supérieure à 20, on fera apparaître un message : 
« Plus petit ! », et inversement, « Plus grand ! » si le nombre est inférieur à 10.
 */

/**
 * @author franck Desmedt
 *
 */
public class PlusPetitPlusGrand3_10 {

	public void chiffreEntre() {
		Scanner scanner = null;
		int number = -1;
		while (number > 10 || number < 20) {
			System.out.println("veuillez entrer un chiffre entre 10 et 20");
			number = Integer.parseInt(scanner.nextLine());
			if (number < 10) {

				System.out.println("trop petit!");
			} else if (number > 20) {
				System.out.println("trop grand!");
			}

		}
		System.out.println("Bravo votre chiffre est: " + number);
	}

	// autre version avec un do while

	public void chiffreEntre2() {
		Scanner scanner = null;
		int number=-1;
		do {
			System.out.println("veuillez entrer un chiffre entre 10 et 20");
			number=Integer.parseInt(scanner.nextLine());
		}
		while(number>10 || number<20) ;{
			
			
			if (number<10) {
				
				System.out.println("trop petit!");
			} else if(number>20){
				System.out.println("trop grand!");
			}
			
		}
		System.out.println("Bravo votre chiffre est: "+number);
	}

}
