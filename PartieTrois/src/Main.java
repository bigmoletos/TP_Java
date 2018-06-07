
public class Main {

	public static void main(String[] args) {
					
		//DEBUT Appel Exercice 3.1
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.1");
		System.out.println("--------------------------------");
		PartieTrois p3 = new PartieTrois();
		//p3.echangeProcedure(3, 5);
		
		//Déclaration de mon tableau d'entier (ici : 2 entiers)
		int[] monTabEntier = new int[2];
		int[] monTabEntier1;
		monTabEntier[0] = 3;
		monTabEntier[1] = 5;
		
		// J'appel une fonction pour permuter les 2 entiers du tableau et l'affecter de nouveau a la variable correspondante. 
		monTabEntier1 = PartieTrois.echangeFonction(monTabEntier);
		System.out.print("\n");
		//FIN Appel Exercice 3.1
		
	
		//DEBUT Appel exercice 3.2
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.2");
		System.out.println("--------------------------------");
		String[] tabString = new String[3];
		tabString[0] = "A";
		tabString[1] = "B";
		tabString[2] = "C";
		System.out.println("AVANT : " + tabString[0] + " " + tabString[1] + " " + tabString[2]);
		tabString = PartieTrois.permutThreeElements(tabString);
		System.out.println("APRES : " + tabString[0] + " " + tabString[1] + " " + tabString[2]);
		System.out.println("Longueur du tableau : " + monTabEntier1.length);
		System.out.println("Element 1 : " + monTabEntier1[0] + " // Element 2 : " +  monTabEntier1[1]);
		System.out.print("\n");
		//FIN Appel exercice 3.2
		
		
		//DEBUT Appel exercice 3.3 
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.3");
		System.out.println("--------------------------------");
		p3.carre();
		System.out.print("\n");
		//FIN Appel exercice 3.3
		
		
		//DEBUT Appel exercice 3.4
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.4");
		System.out.println("--------------------------------");
		p3.askFirstName();
		System.out.print("\n");
		//FIN Appel exercice 3.4
		
		
		//DEBUT Appel exercice 3.5
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.5");
		System.out.println("--------------------------------");
		p3.askPriceAndQuantity();
		System.out.print("\n");
		//FIN Appel exercice 3.5
		

		
		//DEBUT Appel exercice 3.6
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.6");
		System.out.println("--------------------------------");
		p3.bacNotation();
		System.out.print("\n");
		//FIN Appel exercice 3.6
		
		
		//DEBUT Appel exercice 3.7
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.7");
		System.out.println("--------------------------------");
		p3.convertSecondToHoursMinutesSeconds();
		System.out.print("\n");
		//FIN Appel exercice 3.7
		
		
		//DEBUT Appel exercice 3.8
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.8");
		System.out.println("--------------------------------");
		p3.remiseMarchand(500);
		System.out.print("\n");
		//FIN Appel exercice 3.8
				
		
		//DEBUT Appel exercice 3.9
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.9");
		System.out.println("--------------------------------");
		p3.numberBetweenTenAndTwenty();
		System.out.print("\n");
		//FIN Appel exercice 3.9
		
		
		//DEBUT Appel exercice 3.10
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.10");
		System.out.println("--------------------------------");
		PartieTrois.pyramid(8);
		System.out.print("\n");
		//FIN Appel exercice 3.10
		
		
		//DEBUT Appel exercice 3.11
		System.out.println("--------------------------------");
		System.out.println("EXERCICE 3.11");
		System.out.println("--------------------------------");
		PartieTrois.pyramidCenter(8);
		System.out.print("\n");
		//FIN Appel exercice 3.11	
		
	}

}
