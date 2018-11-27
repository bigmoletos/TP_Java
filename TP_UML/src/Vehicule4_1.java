/**
 * Exercice 4.1 & 4.2

Vous reprendrez les diagrammes UML 1.5 et 1.6 pour les réaliser en Java (l’implémentation des méthodes n’est pas demandée, seulement les déclarations).

 * Exercice 1.5 (Interface)

Une voiture et une moto ont le même fonctionnement lié à la notion de véhicule,
 ils peuvent rouler à une vitesse donnée, freiner jusqu’à une vitesse donnée, avoir un accident.
Une moto peut avoir une selle pour le passager ou non.
Une voiture à une capacité de coffre.
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
		// methode roule à une certaine vitesse

		

		public void roule() {

		}

		// methode à un accident
	
	
}
