package societe;

import java.time.LocalDate;

public class Commercial extends Salarié{


//constructeur surchargé avec reference olbigatoire à la classe de base 
	/**
	 * @param numSecu
	 * @param nom
	 * @param prenom
	 */
	public Commercial(String numSecu, String nom, String prenom) {
		super(numSecu, nom, prenom);//doit etre la premiere ligen du constructeur
		
	}
	
	//redefinition de la methode Salarie.travaille
	//le nom de la variable "nbHeures" n'est pas obligatoire sont type oui sinon c'est une surcharge
	@Override//indique quec'est un e redefinition
	public void  travailler(int nbHeures) {
		System.out.printf("le commercial  %s , vends des  trucs pendant %s travaille  %d heures le %s\n", 
				this.getNumSecu(),
				this.getNom(),
				nbHeures,
				LocalDate.now().toString()
				);
	}
}
