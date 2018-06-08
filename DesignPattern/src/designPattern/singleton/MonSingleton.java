/**
 * 
 */
package designPattern.singleton;

/**
 * @author franck Desmedt création du design pattern Singleton
 */
public class MonSingleton {
//stokage de l'intance de la ref dans un champ statique
	private static MonSingleton instance = null;
//création dans une méthode statique qui renvoie une valeur du type elle
	public static MonSingleton getInstance() {

		// condition permetttant de n'avoir qu'une seule instance de la classe
		if (instance == null) {
			// si l'instance n'esgt pas crée je la crée
			instance = new MonSingleton();
		}
		return instance;// puis je retourne tjrs la mm référence
	}

	// constructeur
	// le private garantit la non instanciation de la classe de l'extérieur

	/* public */ private MonSingleton() {

	}

	public void faituntruc() {

	}

}
