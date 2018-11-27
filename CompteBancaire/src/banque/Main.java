package banque;

import java.util.ArrayList;

/**
 * 
 */

/**
 * @author franck Desmedt
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 System.out.println("---------");
		 System.out.println("Solde bancaire");
		 System.out.println("---------");
banque.CompteBancaire monCompte;
try {
	monCompte = new CompteBancaire("Pascal");
	monCompte.deposerArgent(240);
	monCompte.deposerArgent("-1250");
	monCompte.deposerArgent(null);
	monCompte.retirerArgent(120);
	
	System.out.printf("le compte numéro %s de %s a un solde de %.2f\n",
			monCompte.getNumCompte(),
			monCompte.getTitulaire(),
			monCompte.getSolde()
			);
	CompteBancaire.setTauxRemunueration(0.005f);
	CompteBancaire.remunererTousLesComptes();
	
	System.out.printf("le compte numéro %s de %s a un solde de %.2f\n",
			monCompte.getNumCompte(),
			monCompte.getTitulaire(),
			monCompte.getSolde()
			);
} catch (BankAccountException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		 System.out.println("---------");
		 System.out.println("Solde bancaire apres le catch");
		 System.out.println("---------");
		
//		CompteBancaire compte=new CompteBancaire("Mr DESMEDT");
//		//compte.setTitulaire("franck");
//		compte.deposerArgent(300000);
//		compte.retirerArgent(3000);
//		compte.retirerArgent("-1250");
//		compte.retirerArgent(3000);
		//System.out.println(compte.getTitulaire()+" votre solde bancaire est de : "+compte.getSolde()+" €");
		
		//autre solution pour l'affichage
		//System.out.printf("\n%s votre solde bancaire est de %.2f €\n",compte.getTitulaire(),compte.getSolde() );
		
//		CompteBancaire tauxRem=new CompteBancaire("DESMEDT");
//		tauxRem.setTauxRemunueration((float) 0.08);
//		CompteBancaire.remunererTousLesComptes();
//		//System.out.printf("le taux d'interet est de: %s",tauxRem.getTauxRemunueration());
//		System.out.printf("\nla remuneration est de:%s, \n le taux d'interet est de: %f%% ,\nle numero de compte est le: %s,\n %s votre solde bancaire est de %.2f €\n",
//				compte.getSolde(),
//				tauxRem.getTauxRemunueration()*100,
//				compte.getNumCompte(),
//				compte.getTitulaire(),
//				compte.getSolde());
		
		
		////////////////////////////////////////////////////////////////////////////
		System.out.println("\n\n//////////////////////test foreach/////////////////////\n\\n");
		//test foreach 
		int monTab[]=new int[8];
	
		int nb=-10;
		for(int val: monTab) {
			System.out.println(nb);
			nb++;
			val++;
		};
		
		int montab2[]=new int[5];
		int val=10;
		for (int i : montab2) {
			System.out.println(val++);
			
		}
		
		//ne marche pas car int est une valeur, hors il faut forcement une classe
		//ArrayList<int> dynArray= new ArrayList<>();
		
		// marche pas car Integer est une classe, car il faut forcement une classe
		ArrayList<Integer> dynArray= new ArrayList<Integer>();
		System.out.println(dynArray);
		
	}
	

}
