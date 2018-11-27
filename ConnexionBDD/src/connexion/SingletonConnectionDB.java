package connexion;

//public class ConnexionBase {

//	* To change this license header, choose License Headers in Project Properties.
//	* To change this template file, choose Tools | Templates
//	* and open the template in the editor.

import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @param args
 *            the command line arguments
 */
/* faire un singleton avec la connexio */
public class SingletonConnectionDB {

	private static Connection cnx;
	//private static Statement statement;
	private static SingletonConnectionDB	instance=null;
	private Properties props = new Properties();

	// constructeur par defaut en private et non en public pour le singleton
//	private SingletonConnectionDB() {
//		// TODO Auto-generated constructor stub
//	}

	// surcharge constructeur en private et non en public pour le singleton
	private SingletonConnectionDB(String identifiant, String motDePasse, String url) {
		try {
			// cr�ation d'une classe utilisant le driver choisi (ici MySQL)
			Class.forName("com.mysql.cj.jdbc.Driver");
/****************/
			/* Chargement du driver JDBC pour MySQL */
//			try {
//			    Class.forName( "com.mysql.jdbc.Driver" );
//			} catch ( ClassNotFoundException e ) {
//			    /* G�rer les �ventuelles erreurs ici. */
//				System.out.println("impossible de charger le driver  jdbc:com.mysql.jdbc.Driver");
//			}		
/*****************/	
// Cr�ation des propri�t�es � utiliser avec le driver

			props.setProperty("user", identifiant);
			props.setProperty("password", motDePasse);
			props.setProperty("autoReconnect", "true");
			props.setProperty("serverTimezone", "Europe/Paris"); // permet de sp�cifier une timezone compatible
																	// avec celle de JAVA
			props.setProperty("useSSL", "true"); // utilise la connexion ssl avec la BDD

			// Instanciation de la connexion
			cnx = DriverManager.getConnection(url, props);

		//	statement = cnx.createStatement();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	// setter cnx

//	public void setCnx(Connection cnx) {
//		SingletonConnectionDB.cnx = cnx;
//	}

	// getter
	public static Connection getCnx() {
		return cnx;
	}

//	public Statement getStatement() {
//		return statement;
//	}
//
//	public Properties getProps() {
//		return props;
//	}
//
//	/*
//	 * 
//	 */
//
//	public static ResultSet executeQuery(String query) throws SQLException {
//		return statement.executeQuery(query);
//	}
//
//	public int executeInsertQuery(String query) throws SQLException {
//		return statement.executeUpdate(query);
//	}

	/* singleton de connexion � la base de donn�e*/
	public static SingletonConnectionDB connect(String identifiant, String motDePasse, String url) {

		if (instance == null) {
			System.out.println("nouvelle connexion");
			instance= new  SingletonConnectionDB(identifiant, motDePasse, url);
		}
		//else
		//	System.out.println("connexion en cours");
		return instance;

	}

}
//
//public class MonSigletonSecurise {
//
//	   /** Constructeur priv� */  
// private MonSigletonSecurise()
// {
//}
//  
// /** Holder */
// private static class SingletonHolder
// {      
//     /** Instance unique non pr�initialis�e */
//     private final static MonSigletonSecurise instance = new MonSigletonSecurise();
// }
// /** Point d'acc�s pour l'instance unique du singleton */
// public static MonSigletonSecurise getInstance()
// {
//     return SingletonHolder.instance;
// }


//public class MonSingleton {
//	//stokage de l'instance de la ref dans un champ statique
//		private static MonSingleton instance = null;
//	//cr�ation dans une m�thode statique qui renvoie une valeur du type elle
//		public static MonSingleton getInstance() {
//
//			// condition permetttant de n'avoir qu'une seule instance de la classe
//			if (instance == null) {
//				// si l'instance n'esgt pas cr��e je la cr�e
//				instance = new MonSingleton();
//			}
//			return instance;// puis je retourne tjrs la mm r�f�rence
//		}
//
//		// constructeur
//		// le private garantit la non instanciation de la classe de l'ext�rieur
//
//		/* public */ private MonSingleton() {
//
//		}
//
//		public void faituntruc() {
//
//		}
//
//	}
