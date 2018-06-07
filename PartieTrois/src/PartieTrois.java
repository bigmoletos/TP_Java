import java.util.Scanner;

public class PartieTrois {

	private Scanner scanner;
	
	
	//CONSTRUCTOR
	public PartieTrois() {
		this.scanner = new Scanner(System.in);
	}
	
	//DESTRUCTOR
	public void finalize() {
		//this.scanner = null;
		this.scanner.close();
	}
	
	//3.1
	public void echangeProcedure(int A, int B) {
		int save;
		save = A;
		A = B;
		B = save;
		
		System.out.println(A + " " + B);		
	}

	//3.1 BIS
	public static int[] echangeFonction(int[] A) {
		int[] newTab = new int[A.length];
		newTab[0] = A[1];
		newTab[1] = A[0];
		return newTab;
	}
	
	//3.2 
	public static String[] permutThreeElements(String[] tab) {
		String tmp = tab[0];
		tab[0] = tab[2];
		tab[2] = tab[1];
		tab[1] = tmp;
		return tab;
	}
	
	//3.3 
	public void carre() {
		System.out.println("Entrer un nombre pour que je puisse calculer son carré : ");
		int userVal = Integer.parseInt(scanner.nextLine());
		System.out.println("Le carré de : " + userVal + " est " + userVal*userVal);
	}
	
	
	//3.4
	public void askFirstName() {
		System.out.println("Quel est votre prénom ? ");
		String userVal = scanner.nextLine();
		System.out.println("Bonjour, " + userVal + " ! ");
	}
	
	//3.5 
	public void askPriceAndQuantity() {
		System.out.println("Quel est le libellé de l’article ?");
		String productName = scanner.nextLine();
		
		System.out.println("Quel est le prix HT de l’article ?");
		float productPriceHT = scanner.nextFloat();
		//float productPriceHT = Float.parseFloat(scanner.nextLine());
		
		System.out.println("Combien avez-vous d’article ?");
		int productQuantity = scanner.nextInt();
		//int productQuantity = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Quel est le taux de TVA applicable ? (ex: 20)");
		float productTVA = scanner.nextFloat();
		//float productTVA = Float.parseFloat(scanner.nextLine());
		
		float tva = (1+(productTVA/100));
		float productTTC = tva*productPriceHT;
		
		System.out.println("Produit : " + productName + " Quantité : " + productQuantity + " x " + productPriceHT+ " = " + productPriceHT*productQuantity + " € HT soit " + productTTC*productQuantity + " € TTC");
	}
	
	//3.6 
	public void bacNotation() {
		//Dans le cas ou on utilise des nextFloat() / nextInt() ... Le scanner pose problème et crash une exception lors de l'execution... Un WORKAROUND : re instancier le scanner ... Pas très visuel mais fait le job. 
		this.scanner = new Scanner(System.in);
		System.out.println("Note au BAC : ");
		int note = Integer.parseInt(scanner.nextLine());
		if(note < 8) {
			System.out.println("Recalé");
		} else if(note < 10) {
			System.out.println("Rattrapage");
		} else {
			System.out.println("Admis");
		}
	}
	
	
	//3.7 
	public void convertSecondToHoursMinutesSeconds() {
		System.out.println("Combien de secondes souhaitez-vous convertir en heures minutes secondes ?");
		long secondes = Long.parseLong(scanner.nextLine());
		double h = secondes / 3600;
		double m = (secondes - (h * 3600)) / 60;
		double s = secondes % 60;
		System.out.print(h + " heures, " + m + " minutes, " + s + " secondes");
	}
	
	//3.8
	public float remiseMarchand(float value) {
		if(value >= 100 && value <= 500) {
			return (float) (value*0.95);
		} else if (value > 500){
			return (float) (value*0.92);
		} 
		return value;
	}
	
	//3.9 
	public void numberBetweenTenAndTwenty() {
		int number = -1;
		while(number < 10 || number > 20) {
			System.out.println("Un nombre entre 10 et 20 s'il vous plait : ");
			number = Integer.parseInt(scanner.nextLine());
			
			if(number > 20) {
				System.out.println("Plus petit !");
			} else if (number < 10) {
				System.out.println("Plus grand !");
			}
		}
		System.out.println("L'utilisateur à rentré le chiffre : " + number);
	}
	
	
	//3.10 
	public static void pyramid(int line) {
		for(int i = line; i>0; i--) {
			String stars = "";
			for(int j = i; j>0; j--) {
				stars += "*";
			}
			System.out.println(stars);
		}
	}
	
	//3.11
	public static void pyramidCenter(int line) {
		String stars = "*";
		for(int i = line; i>=0; i--) {
			String spaces = "";
			
			for(int j = i; j>=0; j--) {
				spaces += " ";
			}
			System.out.println(spaces + stars);
			stars = stars + "**";
		}
	}
	
	
	
}
