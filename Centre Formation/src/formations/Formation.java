/**
 * 
 */
package formations;

import java.util.HashSet;

import participants.Personne;

/**
 * @author franck Desmedt version pascal Boyer
 */
public class Formation {
	private String intitule;
	// association avec la classe Personne
	private Personne formateur;// attribut "derived" venant de la classe Personne, il sera donc du type
								// Personne
	private HashSet<Personne> stagiaires = new HashSet<>();// crée la liste des stagiaires avec le set, donc il n'y aura
															// pas de doublon

	// setter et getter
	// /**
	// * @return the stagiaires
	// */
	// public Personne getStagiaires() {
	// return getStagiaires();
	// }

	// /**
	// * @param stagiaires
	// * the stagiaires to set
	// */
	// public void setStagiaires(Personne stagiaires) {
	// this.stagiaires = stagiaires;
	// }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * redefinition de toString qui converti un objet en String avec un retour formaté
	 */
	@Override
	public String toString() {
//		return "Formation [intitule=" + this.intitule + ", formateur=" + this.formateur + ", stagiaires="
//				+ this.stagiaires + ",l'intitulé de la formation getIntitule()=" + this.getIntitule() + ", getFormateur()=" + this.getFormateur()
//				+ ", getNbStagiaires()=" + this.getNbStagiaires() + ", toString()=" + super.toString() + "]";
		//return String.format("l'intitulé de la formation est: %s", this.getIntitule());
		return String.format("l'intitulé de la formation est: %S  animé par Mr%S %s il y a %d stagiaires",
				this.getIntitule(), 
				formateur.getNom(), 
				formateur.getPrenom(), 
				this.getNbStagiaires());
	}
	

	/**
	 * @return the intitule
	 */
	public String getIntitule() {
		return this.intitule;
	}

	/**
	 * @param intitule the intitule to set
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	/**
	 * @return the formateur
	 */
	public Personne getFormateur() {
		return formateur;
	}

	/**
	 * @param formateur
	 *            the formateur to set
	 */
	public void setFormateur(Personne formateur) {
		// on verifie que le nom du formateur n'est pas contenu dans la liste des
		// stagiaires
		if (!this.stagiaires.contains(formateur)) {
			this.formateur = formateur;
		}
	}

	// autres methodes

	// methode stagiaire
	// methode donnat le nombre de statgiaires avec le size de Hashset<>
	public int getNbStagiaires() {
		return this.stagiaires.size();
	}

	// methode inscrire stagiaire
	public void inscrire(Personne nouveauStagiaire) {
		// on veut empecher que le nouveau stagiaire soit en meme temps le formateur

		if (nouveauStagiaire != this.formateur)

			this.stagiaires.add(nouveauStagiaire);// le .add appartient à la classe Hashset<> d'interface set<>
	}

}
