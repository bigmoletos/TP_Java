/**
 * 
 */
package designPattern.singleton;

/**
 * @author franck Desmedt cr�ation du design pattern Singleton
 */
public class MonSingleton {
//stokage de l'intance de la ref dans un champ statique
	private static MonSingleton instance = null;
//cr�ation dans une m�thode statique qui renvoie une valeur du type elle
	public static MonSingleton getInstance() {

		// condition permetttant de n'avoir qu'une seule instance de la classe
		if (instance == null) {
			// si l'instance n'esgt pas cr�e je la cr�e
			instance = new MonSingleton();
		}
		return instance;// puis je retourne tjrs la mm r�f�rence
	}

	// constructeur
	// le private garantit la non instanciation de la classe de l'ext�rieur

	/* public */ private MonSingleton() {

	}

	public void faituntruc() {

	}

}
