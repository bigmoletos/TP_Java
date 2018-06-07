import java.util.Scanner;

/**
 * 
 * Exercice 3.13

Écrire une fonction qui déclare un tableau de 9 notes, 
dont on fait ensuite saisir les valeurs par l’utilisateur. 
Elle retournera ensuite ce tableau.
 * 
 * 
 */

/**
 * @author franck Desmedt
 *
 */
public class Tableau9notes3_13 {

	public float[] insertNotes() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("combien de notes voulez rentrer?");
		int nbNotes=Integer.parseInt(scanner.nextLine());
		//instanciation tableau
		float[] tabNotes=new float[nbNotes];
		for (int i = 0; i < tabNotes.length; i++) {
			System.out.println("entrez la note "+(i+1)+" : ");
			tabNotes[i]=Float.parseFloat(scanner.nextLine());
		}
		for (int i = 0; i < tabNotes.length; i++) {
			System.out.println("la note à l'index: "+i+" est: "+tabNotes[i]);
		}
		
		
		return tabNotes;
	}
	
}
