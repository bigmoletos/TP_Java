package main;

import java.sql.ResultSet;
import java.sql.SQLException;

import dal.DALConfig;

public class MainTestJDBC {
	
	

	public static void main(String[] args) {
		/*
		 * Bien Penser à renseigner l'IDENTIFIANT et
		 * le MOT DE PASSE de connexion à votre base de donnée
		 */
		String identifiant = "franck Desmedt";
		String motDePasse = "zak";
		// url = "jdbc:mysql://IP de votre serveur de bdd:port du serveur/schéma à utiliser"
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		ResultSet resultSet;
		DALConfig mySql = new DALConfig(identifiant, motDePasse, url);
		
		try {
			
			/*
			 * Commenter et décommenter pour visualiser dans la base les changement (refresh la table ciblée)
			 */
			
			resultSet = mySql.selectExempleStatement();
			mySql.writeResultSet(resultSet);
			
			
	//		mySql.insertExemplePreparedState();
			
	//		mySql.updateExemplePreparedState();
			
	//		mySql.deleteExemplePreparedState();
			
			mySql.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
