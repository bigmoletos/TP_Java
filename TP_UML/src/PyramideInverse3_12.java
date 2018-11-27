/**
 * *3.12
 * Écrire une fonction demandant 
 * à l’utilisateur de saisir un entier 
 * strictement positif et réalisant l’affichage ci-dessous :
 * 						
 					
 				***************
 				 ***********
 				  ********
 				   *****
 */					

/**
 * @author franck Desmedt
 *
 */
public class PyramideInverse3_12 {

	public static void pyramid(int ligne) {
		for (int i = ligne; i >0; i--) {
			String stars="";
			for (int j = i; j >0; j--) {
				stars+="*";
			}
		}
	}
	
	
	
}
