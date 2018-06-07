
package ReadText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadTextFile {

	// code Pascal
	// utilisation de la methode PrintWriter
	public static void readTextFile() {
		String fileName = "C:\\Users\\HB\\Desktop\\lancement2.txt";
		String cheminDossier = "C:\\Users\\HB\\Desktop\\lancementNew2.txt";

		try {

			java.io.File verifCheminFichier = new File(fileName);// la classe File represente les chemins sur le disque
																	// dur, des fichiers et des dossiers
			// on verifie que le fichier existe, inutile de gerer une exception pour ca.
			// et que on peut ecrire dans le dossier
			java.io.File verifEcritureDossier = new File(fileName);
			if (verifCheminFichier.exists() && verifEcritureDossier.canWrite()) {
				FileInputStream fichierEntree = new FileInputStream(fileName);

				FileOutputStream fichierSortie = new FileOutputStream(cheminDossier);

				PrintWriter pw = new PrintWriter(fichierSortie, true);

				BufferedReader br = new BufferedReader(new InputStreamReader(fichierEntree));

				String contenuLigne;
				while ((contenuLigne = br.readLine()) != null) {

					pw.println(contenuLigne);
					pw.flush();// permet de vider le buffer
				}

				pw.close();// ferme en mm tps le outputStream
				br.close();// idem avec le fileputStream
			}
			// on peut empiler les catch mais par ordre de specialisation des exceptions, du
			// plus specialisé au plus generique
		} catch (FileNotFoundException e) {// specialiasation de IOexception
			// ici on traite l'erreur d'ouverture du fichier
			System.err.println(e.getMessage());

		} catch (IOException e) {
			// ici on traite un pb d'ecriture dans un fichier lors d ela copie
			System.err.println(e.getMessage());
			// attention sur une appli web nous n'avons pas la console il faudra donc faire
			// un fichier log pour recenser l'exception
			// ou trouver un autre moyen pour traiter l'exception

		} catch (Exception e) {// specialisation de Exception
			// ici on a un autre probleme qui ne vient pas de la manipulation des fichiers
			
			Logger logger = Logger.getLogger("org.progx");
			logger.info("Démarrage");
			logger.log(Level.INFO, "Démarrage");
			
			
			Logger log = Logger.getLogger("monProg.java");
			//PatternLayout layout = new PatternLayout("%d %-5p %c - %F:%L - %m%n");
			//ConsoleAppender stdout = new ConsoleAppender(layout);
			//log.addAppender(stdout);
			System.err.println(e.getMessage());

		}
	}
}
