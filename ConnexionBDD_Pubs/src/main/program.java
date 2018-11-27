package main;

import requetes.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import connexion.*;

public class program {

	public static void main(String[] args) throws SQLException {
		//url de la base de donnée url =jdbc:mysql://localhost:3306/pubs
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		// prepState.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
		connexion.SingletonConnectionDB.connect("franck Desmedt", "zak", "jdbc:mysql://localhost:3306/pubs");

		Requetes rq = new Requetes();
		// insertion données dans la base
		rq.insertSales(timestamp, 4, 6, "visa");
		// prepState.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
		
		// affichage des ventes par code postal
		rq.VentesParCp();
	}

}
