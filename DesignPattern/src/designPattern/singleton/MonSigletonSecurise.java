/**
 * 
 */
package designPattern.singleton;

/**
 * @author franck Desmedt
 *singleton sécurisé contre le multithread
 */
public class MonSigletonSecurise {

	   /** Constructeur privé */  
    private MonSigletonSecurise()
    {
}
     
    /** Holder */
    private static class SingletonHolder
    {      
        /** Instance unique non préinitialisée */
        private final static MonSigletonSecurise instance = new MonSigletonSecurise();
    }
    /** Point d'accès pour l'instance unique du singleton */
    public static MonSigletonSecurise getInstance()
    {
        return SingletonHolder.instance;
    }
	
	
}
