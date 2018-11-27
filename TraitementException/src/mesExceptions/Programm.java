package mesExceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class Programm {

	public static void main(String[] args) throws IOException {
		//ouverture du fichier en lecture
		FileInputStream fichierEntree = 
				new FileInputStream("/home/administrateur/Bureau/testcopie.jpg");
		
		FileOutputStream fichierSortie =
				new FileOutputStream("/home/administrateur/Bureau/copie.jpeg");
		
		byte [] buffer = new byte[4096*1024];//buffer de 4ko
		/*
		//tente de remplir le buffer dans son int�gralit�.l
		int octetsLus = fichierEntree.read(buffer, 0, buffer.length);
		while (octetsLus != -1){
			//attention, on n'�crit que ce qui a �t� lu !!!
			fichierSortie.write(buffer,0,octetsLus);
			//puis je relis les donn�es
			octetsLus = fichierEntree.read(buffer, 0, buffer.length);
		}*/
		int octetsLus;
		while((octetsLus = fichierEntree.read(buffer, 0, buffer.length)) != -1) {
			//attention, on n'�crit que ce qui a �t� lu !!!
			fichierSortie.write(buffer,0,octetsLus);
			//puis je relis les donn�es
		}
		
		//une fois la lecture finie, je ferme mes fichiers !
		fichierEntree.close();
		fichierSortie.close();
		try {
			Programm.copyTextFile();
		} catch (MesException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}
	
	public static void copyTextFile() throws MesException  {
		
		String fileName = "/home/administrateur/Bureau/ccou.txt";
			try{
				//d'abord je v�rifie que le fichier d'entr�e existe
				//et que je peux �crire dans le r�pertoire de sortie
				File fichierALire = new File(fileName);
				File dossierSortie = new File("/home/administrateur/Bureau");
				if (fichierALire.exists() && dossierSortie.canWrite())
				{
					FileInputStream fichierEntree = 
							new FileInputStream(fileName);
					FileOutputStream fichierSortie =
							new FileOutputStream("/home/administrateur/Bureau/copie.txt");
				
					PrintWriter pw = new PrintWriter(fichierSortie,true);		
					BufferedReader br = new BufferedReader(new InputStreamReader(fichierEntree));
					String contenuLigne;
					while ((contenuLigne = br.readLine())!=null)
					{
						pw.println(contenuLigne);
						pw.flush();
					}		
					pw.close();//ferme en m�me temp l'OutputStream
					br.close();//pareil mais avec son InputStream
				}
				else {
					if (!fichierALire.exists())
					{
						throw new MesException("Le fichier d'entr�e n'existe pas");
					}
					if (!dossierSortie.canWrite())
					{
						throw new MesException("Vous ne pouvez pas �crire dans le dossier de sortie !");
						
					}
				}
			}
			catch (MesException e){ //sp�cialisation de IOException 
				//Si je suis ici c'est que le probl�me vient de 
				//l'ouverture des fichiers
			}
			catch(IOException e) { //sp�cialisation de Exception
				//Si je suis l�, c'est un souci lors de la lecture ou de
				//l'�criture dans un des fichiers lors de ma copie
				throw new MesException("erreur lors de la phase de copie des fichiers");
				//Translation d'exception
			}
			/*catch(Exception e){
				//pertinent UNIQUEMENT si mon appli est une appli CONSOLE !!!
				e.printStackTrace();
				System.err.println(e.getMessage());
				/////////////////////////////////////////////////////////////
				//le probl�me ne doit probablement pas venir
				//de la manipulation des fichiers.
			}*/
			

	}


}
