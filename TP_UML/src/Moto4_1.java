/**
 * exo 4_1
 * 
 * classe fille de la classe vehivuel4_1
 * 
 * 
 * Exercice 1.5 (Interface)

Une voiture et une moto ont le m�me fonctionnement li� � la notion de v�hicule, ils peuvent rouler � une vitesse donn�e, freiner jusqu�� une vitesse donn�e, avoir un accident.
Une moto peut avoir une selle pour le passager ou non.
Une voiture � une capacit� de coffre.
 */

/**
 * @author franck Desmedt
 *
 */
public class Moto4_1 extends Vehicule4_1{

	private boolean sellePassager;
//getter setter
	/**
	 * @return the sellePassager
	 */
	public boolean isSellePassager() {
		return this.sellePassager;
	}

	/**
	 * @param sellePassager the sellePassager to set
	 */
	public void setSellePassager(boolean sellePassager) {
		this.sellePassager = sellePassager;
	}
	
	
}
