/**
 * 
 */
package designPattern.strategy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidAlgorithmParameterException;

/**
 * @author franck Desmedt
 *
 */
public class FichierLogStrategy implements ILoggerStrategy {

	private String path;

	/*
	 * (non-Javadoc)
	 * 
	 * @see designPattern.strategy.ILoggerStrategy#performLog(java.lang.String)
	 */
	@Override
	public void performLog(String s) {
		try {

			// FileOutputStream fichierlog = new
			// FileOutputStream("C:\\Users\\HB\\Desktop\\fichierLog.txt");
			FileOutputStream fichierlog2 = new FileOutputStream(this.path, true);// avec le chemin courant de main //le true place en début de flux, mode append
			//on aurait pu remplacer this.path directement par logFile.getCanonicalPath()
			PrintWriter pw = new PrintWriter(fichierlog2, true);
			pw.println(s);//on ecrit ce qui est passé en argument String s
			pw.close();// ferme en mm tps le outputStream
		} catch (IOException e) {
			e.printStackTrace();
			// throw new InvalidAlgorithmParameterException();
		}
	}

	// constructeur de notre strategy
	// il faut lui passer le nom du fichier de log
	public FichierLogStrategy(String filename) throws InvalidAlgorithmParameterException {
		// String path =new File(".").getCanonicalPath();//donne le chemin en cours
		// createFolder
		try {
			File logFile = new File(filename);// donne le chemin de l'executable en cours et
																		// concatene avec le nom du fichier
			// new File(".") pour le repertoire en cours
			// new File("..") pour le repertoire racine

			if (logFile.exists())
				logFile.createNewFile();// on crée le fichier avec le chemin et nom prévu dans File
			path = logFile.getCanonicalPath(); // on attribut à l'attribut path le fichier en prenant en compte le
												// repertoire racine
			// createFolder
			// FileOutputStream fichierlog = new
			// FileOutputStream("C:\\Users\\HB\\Desktop\\fichierLog.txt");

		} catch (IOException e) {
			// si on ne peut créeer le fichier, on ne peut donc pas appliquer la stratégie
			// donc on arrete
			throw new InvalidAlgorithmParameterException();
			// e.printStackTrace();
		}
	}
	public FichierLogStrategy() throws InvalidAlgorithmParameterException, IOException {
		this( new File(new File("."), "fichierLog.txt").getCanonicalPath());
	}
	
	

	// enregistrement fichier

	// public static void enregistrementFichierLog() {
	// try {
	// String path =new File(".").getCanonicalPath();//donne le chemin de
	// l'executable en cours
	// //createFolder
	// //FileOutputStream fichierlog = new
	// FileOutputStream("C:\\Users\\HB\\Desktop\\fichierLog.txt");
	// FileOutputStream fichierlog2 = new
	// FileOutputStream(path+"fichierLog.txt");//avec le chemin courant de main
	// PrintWriter pw = new PrintWriter(fichierlog2, true);
	// pw.close();// ferme en mm tps le outputStream
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	//
	// }
}
