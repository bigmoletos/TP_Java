/**
 * exo 4.1
 * 
 * classe fille de la classe Exercice 4.1 & 4.2

Vous reprendrez les diagrammes UML 1.5 et 1.6 pour les r�aliser en Java (l�impl�mentation des m�thodes n�est pas demand�e, seulement les d�clarations).
Exercice 1.5 (Interface)

Une voiture et une moto ont le m�me fonctionnement li� � la notion de v�hicule, ils peuvent rouler � une vitesse donn�e, freiner jusqu�� une vitesse donn�e, avoir un accident.
Une moto peut avoir une selle pour le passager ou non.
Une voiture � une capacit� de coffre.


 */

/**
 * @author franck Desmedt
 *
 */
public class Voiture4_1 extends  Vehicule4_1 {

	private int coffreCapacite;

	/**
	 * @return the coffreCapacite
	 */
	public int getCoffreCapacite() {
		return coffreCapacite;
	}

	/**
	 * @param coffreCapacite the coffreCapacite to set
	 */
	public void setCoffreCapacite(int coffreCapacite) {
		this.coffreCapacite = coffreCapacite;
	}
	
}
