package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Classe permettant de configurer et d'utiliser une connexion à une base de
 * données MySQL
 * @author Christophe RT
 *
 */
public class DALConfig {
	
	private Connection cnx;
	private Statement statement;
	private PreparedStatement prepState;
	private ResultSet resultSet;
	private Properties props = new Properties();
	
	
	public DALConfig(String identifiant, String motDePasse, String url) {
		try {
			//création d'une classe utilisant le driver choisi (ici MySQL)
			Class.forName("com.mysql.cj.jdbc.Driver");


			// Création des propriétées à utiliser avec le driver
			
			props.setProperty("user",identifiant); 
			props.setProperty("password",motDePasse); 
			props.setProperty("autoReconnect", "true");
			props.setProperty("serverTimezone", "Europe/Paris"); // permet de spécifier une timezone compatible avec celle de JAVA
			props.setProperty("useSSL", "true"); // utilise la connexion ssl avec la BDD

			// Instanciation de la connexion
			cnx = DriverManager.getConnection(url, props);

			statement = cnx.createStatement();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Champs de la table `customers` :
	 * customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, 
	 * addressLine2, city, state, postalCode, country, salesRepEmployeeNumber, creditLimit
	 */
	
	
	
	/**
	 * Exemple d'une requete SELECT avec un Statement.
	 * La requète est écrite en dur dans le code
	 * @return le résultat de la requete
	 * @throws SQLException
	 */
	public ResultSet selectExempleStatement() throws SQLException {
		resultSet = statement.executeQuery("select * from customers");
		return resultSet;
	}
	

	
	/*					Champs de la table `employees` :
	 * employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle
	 */
	
	/**
	 * Exemple d'une requète INSERT avec un PreparedStatement
	 * @return le nombre de lignes modifiées par la requète
	 * @throws SQLException
	 */
	public int insertExemplePreparedState() throws SQLException {
		// préparation de la requète paramétrée
		prepState = cnx.prepareStatement("insert into  employees values (?, ?, ?, ?, ?, ?, ?, ?)");
		// définition des valeurs à utiliser dans la requète
		// les .setInt/String sont définis dans l'ordre des '?' de la requète (et au même nombre)
		prepState.setInt(1, 8888);
		prepState.setString(2, "TEST NOM");
		prepState.setString(3, "Testeur");
		prepState.setString(4, "x102");
		prepState.setString(5, "testeur.test@mail.fr");
		prepState.setInt(6, 1);
		prepState.setInt(7, 1621);
		prepState.setString(8, "metier de testeur");
		
		return prepState.executeUpdate(); // execution de la requète
	}
	
	/**
	 * Exemple de requète UPDATE avec un PreparedStatement
	 * @return le nombre de lignes modifiées par la requète
	 * @throws SQLException
	 */
	public int updateExemplePreparedState() throws SQLException {
		// préparation de la requète paramétrée
		prepState = cnx.prepareStatement("update employees set "
					+ "employeeNumber = ?, "
					+ "lastName = ?, "
					+ "firstName = ?, "
					+ "extension = ?, "
					+ "email = ?, "
					+ "officeCode = ?, "
					+ "reportsTo = ?, "
					+ "jobTitle = ?"
					+ "where employeeNumber = ?");
		
		prepState.setInt(1, 8888);
		prepState.setString(2, "TEST NOM");
		prepState.setString(3, "Testeur");
		prepState.setString(4, "x102");
		prepState.setString(5, "testeur.test@mail.fr");
		prepState.setInt(6, 1);
		prepState.setInt(7, 1621);
		prepState.setString(8, "metier de testeur");
		prepState.setInt(9, 8888);
		
		return prepState.executeUpdate(); // execution de la requète
	}
	
	/**
	 * Exemple d'une requète DELETE avec un PreparedStatement
	 * @return le nombre de lignes supprimées par la requète
	 * @throws SQLException
	 */
	public int deleteExemplePreparedState() throws SQLException {
		prepState = cnx.prepareStatement("delete from employees where employeeNumber = ?");
		prepState.setInt(1, 8888);
		return prepState.executeUpdate();
	}
	
	/**
	 * Exemple de parcours d'un resultat de requete SELECT
	 * @param resultSet
	 * @throws SQLException
	 */
	public void writeResultSet(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {
			// On peut récupérer les valeur du resultSet avec un .getString(*) :
			//	* = int --> par le numéro de la colonne ( de 1 à nombre_max_de_colonnes_de_la_table)
			//	* = String --> par le nom de la colonne (comme dans la table)
//			int customerNumber = Integer.parseInt(resultSet.getString(1));
//			String customerName = resultSet.getString(2);
			
			System.out.printf("Client N° %s : %s\n", resultSet.getString(1), resultSet.getString(2));
		}
	}
	
	/**
	 * Ne pas oublier de fermer les ressources lorsqu'elles ne sont plus utilisées.
	 */
	public void close() {
		try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (cnx != null) {
                cnx.close();
            }
            if (prepState != null) {
            	prepState.close();
            }
        } catch (Exception e) {
        	System.out.println(e.getStackTrace());
        }
		
	}

}
