/**
 * 
 */
package ReadText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author franck Desmedt
 *gestion des exception avec try catch
 */
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("rentrez un nombre entier :");
		//comme scanner, BufferedReader permet de lire les entrées clavier
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
			int valeurSaisie = Integer.parseInt(br.readLine());
			System.err.printf("la division entière de 10 par %d donne : %d\n"
					,valeurSaisie,10/valeurSaisie);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.err.println("Division par 0 impossible!");
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		catch (NumberFormatException e) {
			//utiliser plutot System.err.println que System.out.println
			System.err.println("veuillez saisir uniquement un nombre!");
			//e.printStackTrace();
		}
		
		//version pascal
		try {
			
			System.out.println("rentrez un nombre entier :");
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
				int valeurSaisie = Integer.parseInt(br.readLine());
				System.out.printf("la division entière de 10 par %d donne : %d\n"
						,valeurSaisie,10/valeurSaisie);
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (NumberFormatException e)
			{ //erreur de parsing de la chaine vers un entier
				System.err.println("Tu n'as pas saisi un entier, enlève tes mouffles");
			}
			catch (ArithmeticException e){
				System.err.println("C'est pas possible de diviser par 0");
			}
			
		
	}

}

