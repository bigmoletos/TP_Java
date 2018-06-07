package societe;

import java.time.LocalDate;

public abstract class Salarié {

	private final String numSecu;// pas de setter car unique et final oblige à l'initaliser dans le consctruteur et ne bougera plus ensuite
	private String nom;
	private String prenom;

	public String getNom() {
		return this.nom;

		// getter et setter
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumSecu() {
		return this.numSecu;
	}

	// constructeur
	/**
	 * @param numSecu
	 * @param nom
	 * @param prenom
	 */
	public Salarié(String numSecu, String nom, String prenom) {

		this.numSecu = numSecu;
		this.nom = nom;
		this.prenom = prenom;
	}

	// autres methodes
	public void travailler(int nbHeures) {
		System.out.printf("numéro de sécu %s %s travaille  %d heures le %s\n", 
				this.numSecu,
				this.nom,
				nbHeures,
				LocalDate.now().toString()
				);

	}
	
	public abstract void travailler2(int nbHeures); 
//	{
//		System.out.printf("numéro de sécu %s %s travaille  %d heures le %s\n", 
//				this.numSecu,
//				this.nom,
//				nbHeures,
//				LocalDate.now().toString()
//				);

	}


	
	
}
