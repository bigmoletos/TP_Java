/**
 * 
 */
package societe;

/**
 * @author franck Desmedt
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Salari� sal = new Salari�("55555611", "desmedt", "franck");
		Salari� sal2 = new Commercial("55555611", "desmedt", "franck");
		Commercial sal3 = new Commercial("55555611", "desmedt", "franck");
		//Salari� sal4 = new Developpeur("55555611", "desmedt", "franck", "C#");
		Salari� sal5 = new Developpeur("55555611", "desmedt", "franck", Specialite2.Cpp);
		Developpeur sal6 = new Developpeur("55555611", "desmedt", "franck", Specialite2.Cpp);
		

		System.out.printf("Le salari�  %s, %s, ", sal.getNom(), sal.getPrenom());
		sal.travailler(25);
		System.out.printf("Le salari�  %s, %s, ", sal.getNom(), sal.getPrenom());
		sal2.travailler(25);
		System.out.printf("Le salari�  %s, %s, ", sal.getNom(), sal.getPrenom());
		sal3.travailler(25);
//		System.out.printf("Le salari�  %s, %s, ", sal.getNom(), sal.getPrenom());
//		sal4.travailler(25);
		System.out.printf("Le salari�  %s, %s, %s :\n", sal.getNom(), sal.getPrenom(), Specialite2.Csharp);
		
		sal5.travailler(25);
		System.out.println("specialite :"+ sal6.getSpecialite());
	}

}
