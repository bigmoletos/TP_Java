import java.util.Scanner;

/**
 * Exercice 3.3
*
*�crire un programme qui demande un nombre � l�utilisateur,
* puis qui calcule et�affiche le carr� de ce nombre.
 */

/**
 * @author franck Desmedt
 *
 */
public class Carre {
	
	private  Scanner scanner ;
	 //on va instancier le scanner dans le constructeur
	
	//constructeur
	public Carre() {
		this.scanner=new Scanner(System.in);
		
	}
	
	
	//destructeur
	public void finalyse() {
		this.scanner.close();
	}
	
	
	public  int carre(int a) {
		System.out.println("enter un nb pour calucler son carre :");
		
		int val=Integer.parseInt(scanner.nextLine());
		
		System.out.println("lecarre de "+val+" est: "+val*val);
		 int carre=val*val;
		return carre;
	}

}
