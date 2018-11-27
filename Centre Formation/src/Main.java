import formations.Formation;
import participants.Personne;

/**
 * 
 */

/**
 * @author franck Desmedt
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// personne

		Personne p1;
		Personne p2;
		Personne p3;

		p1 = new Personne("stark", "tony");// etapeA
		p2 = new Personne("thor", "Vincent");// etapeB
		p3 = new Personne("Zeus", "stantor");// etapeB

		System.out.printf(" liste des stagiaires:\n %S %s ,\n %S %s, \n %S %s.\n", p1.getNom(), p1.getPrenom(),
				p2.getNom(), p2.getPrenom(), p3.getNom(), p3.getPrenom());
		p2 = p1;// etapeC
		// formateur

		Personne formateur = new Personne("boyer", "pascal");
		Personne formateur2 = new Personne("Zeus", "stantor");

		System.out.printf(" Le formateur est : %S %s\n", formateur.getNom(), formateur.getPrenom());
		System.out.printf(" Le formateur est : %S %s\n", formateur2.getNom(), formateur2.getPrenom());
		// intitule
		System.out.println("\n\n//////////////////////////////////intitule///////////////////////////////////////////////////////////\n");

		Formation intitule = new Formation();
		intitule.setFormateur(formateur2);//ne pas oublier initialiser le formateur de la formation
		System.out.println("intitule");
		intitule.setIntitule("D�veloppement Java JSE\n");
		///System.out.println(intitule.getIntitule().toString());
	//	System.out.println(intitule.getIntitule());
	//	System.out.println(intitule.toString());
		System.out.println(intitule);

		// inscription

		Formation inscrit1 = new Formation();
		Formation inscrit2 = new Formation();
		Formation inscrit3 = new Formation();
		Formation inscrit4 = new Formation();

		// nombre stagiaires

		// inscrit1.inscrire(p1);
		// System.out.println(inscrit1.inscrire(p3));
		// System.out.printf("Nom nouvel inscrit:%p", inscrit1.inscrire(p1));
		Formation nbStagiaires = new Formation();
		System.out.printf(" Le nombre de stagiaires est de : %d", nbStagiaires.getNbStagiaires());

		System.out.println("\n\n//////////////////////////////////TESTS MEMOIRE///////////////////////////////////////////////////////////\n");
		///////////////////
		// tests appels m�moire
		if (p1 == p2) {
			// toujours vrai car pointe vers le mm objet
		}

		String s1 = "toto";
		String s2 = "t";
		s2 += "oto";

		if (s1.equals(s2)) {
			System.out.println("\nle tableau de caract�res est identique\n");
		}
		if (s1 != s2) {
			System.out.println(
					"les valeurs ne sont pas �gales l'adresse, \ndes 2 blocs m�moire est diff�rente mais les valeurs sont identiques");
		}

		// Mauvaise gestion memoire due � la concat�nation de chaine de caracteres
		// ici il va traiter chaque nouvelle valeur avec une nouvelle adresse, donc
		// traitement par r�f�rence
		String maChaine = "a";
		for (int i = 0; i < 150; i++) {
			maChaine += "A";

		}
		System.out.println(maChaine + "\n");

		// gestion memoire pour une concat�nation de chaine de caracteres en utilisant
		// StringBuilder
		StringBuilder maChaine2 = new StringBuilder();
		for (int i = 0; i < 1500000; i++) {
			maChaine2.append("A");
		}
		String resul = maChaine2.toString();
	}
}
