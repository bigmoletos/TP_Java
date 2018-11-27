package main;

import java.sql.ResultSet;
import java.sql.SQLException;

import dal.DALConfig;

public class MainTestJDBC {
	
	

	public static void main(String[] args) {
		/*
		 * Bien Penser � renseigner l'IDENTIFIANT et
		 * le MOT DE PASSE de connexion � votre base de donn�e
		 */
		String identifiant = "franck Desmedt";
		String motDePasse = "zak";
		// url = "jdbc:mysql://IP de votre serveur de bdd:port du serveur/sch�ma � utiliser"
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		ResultSet resultSet;
		DALConfig mySql = new DALConfig(identifiant, motDePasse, url);
		
		try {
			
			/*
			 * Commenter et d�commenter pour visualiser dans la base les changement (refresh la table cibl�e)
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
