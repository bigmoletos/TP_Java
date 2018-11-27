/**
 * exo 4.1
 * 
 * classe fille de la classe Exercice 4.1 & 4.2

Vous reprendrez les diagrammes UML 1.5 et 1.6 pour les réaliser en Java (l’implémentation des méthodes n’est pas demandée, seulement les déclarations).
Exercice 1.5 (Interface)

Une voiture et une moto ont le même fonctionnement lié à la notion de véhicule, ils peuvent rouler à une vitesse donnée, freiner jusqu’à une vitesse donnée, avoir un accident.
Une moto peut avoir une selle pour le passager ou non.
Une voiture à une capacité de coffre.


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
