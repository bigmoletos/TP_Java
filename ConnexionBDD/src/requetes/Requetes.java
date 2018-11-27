package requetes;

//import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Requetes {

	// private Connection cnx;
	// ConnectionDB cnx=new ConnectionDB();
	Connection BDD = connexion.SingletonConnectionDB.getCnx();// objet connexion

	public void insertSales(Timestamp date, int idBeer, int idPub, String typeRegl) throws SQLException {

		try {
			// connexion.ConnectionDB.seConnecter().prepareStatement(typeRegl);
			// connexion.SingletonConnectionDB.connect(typeRegl, typeRegl, typeRegl);
			connexion.SingletonConnectionDB.getCnx().setAutoCommit(false);
			PreparedStatement pstate = connexion.SingletonConnectionDB.getCnx().prepareStatement(
					"insert into  sales (date_sales, id_Beer, id_Pub, type_paiement) " + "values (?, ?, ?, ?)");

			pstate.setDate(1, new java.sql.Date(date.getTime()));/* il faut forcement mettre le type java.sql.Date */
			pstate.setInt(2, idBeer);
			pstate.setInt(3, idPub);
			pstate.setString(4, typeRegl);

			pstate.executeUpdate();

			// ventes par ordre croissant de création
			this.printQuery(connexion.SingletonConnectionDB.getCnx().prepareStatement(typeRegl)
					.executeQuery("SELECT * FROM sales ORDER BY update_date ASC"));

			connexion.SingletonConnectionDB.getCnx().commit();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			connexion.SingletonConnectionDB.getCnx().rollback();
			e.printStackTrace();
		}

	}

	// methode retourne le resultat de la requete en System.out.printf
	public void printQuery(ResultSet result) throws SQLException {
		while (result.next()) {
			for (int col = 1; col <= result.getMetaData().getColumnCount(); ++col) {
				System.out.printf(" %s : %s-", result.getMetaData().getColumnName(col), result.getString(col));

			}

			System.out.println(";");

		}
	}

	// methode
	public static ResultSet executeQuery(String query) throws SQLException {
		return executeQuery(query);
	}

	// methode question 11
	// # Q 11 (1 points) : afficher le chiffre d'affaire total par code postal trié
	// par ordre décroissant
	// SELECT
	// SUM(B.price ) AS total_ventes,
	// postcode
	// FROM
	// beers B
	// INNER JOIN
	// sales S ON S.id_beer = B.id_beer
	// INNER JOIN
	// pubs P ON S.id_pub = P.id_pub
	// GROUP BY postcode
	// ORDER BY postcode DESC

	public void VentesParCp() throws SQLException {

		try {
			// connexion.ConnectionDB.seConnecter().prepareStatement(typeRegl);
			// connexion.SingletonConnectionDB.connect(typeRegl, typeRegl, typeRegl);
			connexion.SingletonConnectionDB.getCnx().setAutoCommit(false);
			/* Création de l'objet gérant les requêtes */
			// Statement statement = connexion.createStatement();
			this.printQuery(connexion.SingletonConnectionDB.getCnx().createStatement()
					.executeQuery("SELECT  SUM(B.price ) ," + " postcode FROM beers B  " + "INNER JOIN  sales S"
							+ " ON S.id_beer = B.id_beer " + " INNER JOIN pubs P" + " ON S.id_pub = P.id_pub 	"
							+ "GROUP BY postcode " + "ORDER BY postcode DESC "));

			// connexion.SingletonConnectionDB.getCnx().commit();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// connexion.SingletonConnectionDB.getCnx().rollback();
			e.printStackTrace();
		}
	}
}

// public int executeInsertQuery(String query) throws SQLException {
// return executeUpdate(query);
// }
