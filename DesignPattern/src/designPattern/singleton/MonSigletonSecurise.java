/**
 * 
 */
package designPattern.singleton;

/**
 * @author franck Desmedt
 *singleton s�curis� contre le multithread
 */
public class MonSigletonSecurise {

	   /** Constructeur priv� */  
    private MonSigletonSecurise()
    {
}
     
    /** Holder */
    private static class SingletonHolder
    {      
        /** Instance unique non pr�initialis�e */
        private final static MonSigletonSecurise instance = new MonSigletonSecurise();
    }
    /** Point d'acc�s pour l'instance unique du singleton */
    public static MonSigletonSecurise getInstance()
    {
        return SingletonHolder.instance;
    }
	
	
}
