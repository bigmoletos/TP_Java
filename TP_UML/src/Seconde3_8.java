import java.util.Scanner;

/**
 * Exercice 3.8

* �crire une fonction demandant une dur�e en secondes � l�utilisateur, et
* qui la convertit en heures, minutes, secondes. 
* On affichera ensuite le r�sultat.
 */

/**
 * @author franck Desmedt
 *
 */
public class Seconde3_8 {

	public void convertSeconde() {
		Scanner scanner = null;
		System.out.println("combien de secondes souhaitez convertir en heures, minute, secondes?");
		long secondes=Long.parseLong(scanner.nextLine());
		double h=secondes/3600;
		double m=(secondes-(h*3600))/60;
		double s=secondes%60;
		System.out.println(h+"heures"+m+"minutes"+s+"secondes");
		
	}
	
}
