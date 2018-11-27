package CreationFichierBinaire;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// ouverturez du fichier en lecture
		FileInputStream fichierEntree = new FileInputStream("C:\\Users\\HB\\Documents\\images\\image1.jpg");
		FileInputStream fichierEntree2 = new FileInputStream("C:\\Users\\HB\\Desktop\\lancement1.txt");

		// creation fichier
		FileOutputStream fichierSortie = new FileOutputStream("C:\\Users\\HB\\Desktop\\lancement2.txt");

		// écriture d'un buffer de 4 koctet
		byte[] buffer = new byte[4096];
		// //lecture du buffer
		// int OctetsLus=fichierEntree2.read(buffer, 0, buffer.length);
		//
		// //!!on ecrit QUE ce que l'on a lus d'où le buffer.length
		// while (OctetsLus!=-1) {
		// fichierSortie.write(buffer, 0, OctetsLus);
		// //relecture des donnes
		// OctetsLus=fichierEntree.read(buffer, 0, buffer.length);
		// }
		// autre solution on intégre directement dans le while le
		// (OctetsLus=fichierEntree2.read(buffer, 0, buffer.length)
		// while ((OctetsLus=fichierEntree2.read(buffer, 0, buffer.length)) !=-1)
		int OctetsLus;
		//
		// //!!on ecrit QUE ce que l'on a lus d'où le buffer.length
		while ((OctetsLus = fichierEntree2.read(buffer, 0, buffer.length)) != -1) {
			fichierSortie.write(buffer, 0, OctetsLus);
			// relecture des donnes
			// OctetsLus=fichierEntree.read(buffer, 0, buffer.length);
		}

		// quand on a fini la lecture , on ferme les fichiers
		fichierEntree.close();
		fichierEntree2.close();
		fichierSortie.close();

	}

	// code Pascal
	// utilisation de la methode PrintWriter
	public static void readTextFile() throws IOException {

		FileInputStream fichierEntree3 = new FileInputStream("C:\\Users\\HB\\Desktop\\lancement1.txt");

		FileOutputStream fichierSortie2 = new FileOutputStream("C:\\Users\\HB\\Desktop\\lancement5.txt");
		PrintWriter pw = new PrintWriter(fichierSortie2, true);
		BufferedReader br = new BufferedReader(new InputStreamReader(fichierEntree3));
		String contenuLigne;
		while ((contenuLigne = br.readLine()) != null) {

			pw.println(contenuLigne);
			pw.flush();// permet de vider le buffer
		}

		pw.close();// ferme en mm tps le outputStream
		br.close();// idem avec le fileputStream
	}

}
