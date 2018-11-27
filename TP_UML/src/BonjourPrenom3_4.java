import java.util.Scanner;

/**
 * Exercice 3.4
*Écrire un programme qui demande son prénom à l'utilisateur, et qui lui réponde par un charmant « Bonjour » suivi du prénom. 
*On aura ainsi le dialogue suivant : 
*Machine : Quel est votre prénom ? 
*Utilisateur : Marie-Cunégonde
*Machine : Bonjour, Marie Cunégonde !
 */

/**
 * @author franck Desmedt
 *
 */
public class BonjourPrenom3_4 {
	
		private String prenom;
		
		private Scanner scanner;
		
		//on met ici le scanner dans le constructeur ce qui permet d'eviter de l'instancier 
		//a chaque fois, il n'aura comme durée de vie que celle de la classe et donc de l'objet
		
		//CONSTRUCTOR
		 public BonjourPrenom3_4() {
			this.scanner = new Scanner(System.in);
		}
			
		
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		
	
		return this.prenom;
	}


	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
			this.prenom=prenom;
	}
//en passant par le constructeur
//public BonjourPrenom() {
//	Scanner scanner = null;
//	System.out.println("veuillez entrer votre prenom: ");
//	String prenomClavier=scanner.nextLine();
//	System.out.println("bonjour "+prenomClavier);
//}

	public   void bonjour() {
		
		System.out.println("veuillez entrer votre prenom: ");
		//leve l'exception de scanner null:
		//@SuppressWarnings("null")
		String prenomClavier=scanner.nextLine();
		System.out.println("bonjour "+prenomClavier);
		//System.out.println("Bonjour "+this.prenom+ "!");
		
	}
	
}
