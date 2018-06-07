import java.util.Scanner;

/**
 * 
 * Exercice 3.14

Écrire une fonction qui demandera à l’utilisateur combien de phrase il veut saisir. 
On fera ensuite saisir ces phrases à l’utilisateur et on les stockera.
 * 
 * 
 */

/**
 * @author franck Desmedt
 *
 */
public class Phrase3_14 {
	public String[] phrase() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("combien de phrases voulez rentrer?");
		int nbPhrases=Integer.parseInt(scanner.nextLine());
		//instanciation tableau
		String[] tabPhrase=new String[nbPhrases];
		for (int i = 0; i < tabPhrase.length; i++) {
			System.out.println("entrez la phrase "+(i+1)+" : ");
			tabPhrase[i]=scanner.nextLine();
		}
		for (int i = 0; i < tabPhrase.length; i++) {
			System.out.println("la phrase à l'index : "+i+" est: "+tabPhrase[i]);
		}
		
		
		return tabPhrase;
	}
	
	
	
	
	

}
