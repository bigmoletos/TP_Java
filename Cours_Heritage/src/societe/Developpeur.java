package societe;

import java.time.LocalDate;

public final class Developpeur extends Salari�{
private Specialite2 specialite;
	
	
	//constructeur
	/**
	 * @param numSecu
	 * @param nom
	 * @param prenom
	 */
	public Developpeur(String numSecu, String nom, String prenom,  Specialite2 specialite) {
		super(numSecu, nom, prenom);
		this.specialite=specialite;
		// TODO Auto-generated constructor stub
	}

	//getter et setter
	final public String getSpecialite() {//Par d�faut en java toute m�thode est  virtuelle donc potentiellement 
		//red�finissable � l'h�ritage ou � la sp�cialisation ce qui presente un risque 
		//car on peut redefinir les methodes comme les getter par xe pojur eviter cela le mets en final. 
		//final stop la virtualit� des  m�thodes on ne pourra plus y toucher
		return this.specialite.getlibelle();
	}


	final	public void setSpecialite(Specialite2 specialite) {
		this.specialite = specialite;
	}
	
	
	//redefinnition travailler
	@Override//indique quec'est un e redefinition
	public abstract void  travailler(int nbHeures) {
		System.out.printf("le developpeur  %s %s, code en %s %s %s pendant  %d heures le %s\n", 
				
				this.getNom(),
				this.getPrenom(),
				this.specialite.getlibelle(),
				this.specialite.toString(),//ne ressort nos caract�res speciaux
				getSpecialite(),
				
				nbHeures,
				LocalDate.now().toString()
				);
	}



	
	
	
}
