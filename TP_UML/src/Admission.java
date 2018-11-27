import java.util.Scanner;

/**
 *Exercice 3.6

Écrire une fonction qui affiche si un lycéen est admis, 
recalé ou au rattrapage en fonction de la note saisis par l’utilisateur.  
 */

/**
 * @author franck Desmedt
 *
 */
public class Admission {
Scanner scanner;
	public void Admission() {
		
		this.scanner=new Scanner(System.in);
			System.out.println("note au bac: ");	
			int note=Integer.parseInt(scanner.nextLine());
			if (note<8) {
				System.out.println("recalé");
			} else if (note<10){
				System.out.println("rattrapage");
			} else {
				System.out.println("admis");
				}
			
			
			
	}
	
}
