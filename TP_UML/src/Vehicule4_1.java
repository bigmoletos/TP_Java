/**
 * Exercice 4.1 & 4.2

Vous reprendrez les diagrammes UML 1.5 et 1.6 pour les r�aliser en Java (l�impl�mentation des m�thodes n�est pas demand�e, seulement les d�clarations).

 * Exercice 1.5 (Interface)

Une voiture et une moto ont le m�me fonctionnement li� � la notion de v�hicule,
 ils peuvent rouler � une vitesse donn�e, freiner jusqu�� une vitesse donn�e, avoir un accident.
Une moto peut avoir une selle pour le passager ou non.
Une voiture � une capacit� de coffre.
 * 
 */

/**
 * @author franck Desmedt
 *
 */
public class Vehicule4_1 {

	// attributs
		private int vitesse;
		private boolean accidenter;
		private int nbRoues;

		// getter et setter
		/**
		 * @return the vitesse
		 */
		public int getVitesse() {
			return this.vitesse;
		}

		/**
		 * @param vitesse the vitesse to set
		 */
		public void setVitesse(int vitesse) {
			this.vitesse = vitesse;
		}

		/**
		 * @return the accidenter
		 */
		public boolean isAccidenter() {
			return  this.accidenter;
		}

		/**
		 * @param accidenter the accidenter to set
		 */
		public void setAccidenter(boolean accidenter) {
			this.accidenter = accidenter;
		}

		/**
		 * @return the nbRoues
		 */
		public int getNbRoues() {
			return  this.nbRoues;
		}

		/**
		 * @param nbRoues the nbRoues to set
		 */
		public void setNbRoues(int nbRoues) {
			this.nbRoues = nbRoues;
		}
		
		// autre methode
		// methode freine
//on aurait pu lefaire avec le setter
		public void Freine(int vitesse) {
if (this.vitesse>vitesse) {
	this.vitesse=vitesse;
	System.out.println("je freine!");
} 
		}
		// methode roule � une certaine vitesse

		

		public void roule() {

		}

		// methode � un accident
	
	
}
