import java.util.Scanner;

/**
 *Exercice 3.6

�crire une fonction qui affiche si un lyc�en est admis, 
recal� ou au rattrapage en fonction de la note saisis par l�utilisateur.  
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
				System.out.println("recal�");
			} else if (note<10){
				System.out.println("rattrapage");
			} else {
				System.out.println("admis");
				}
			
			
			
	}
	
}
