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
		Salarié sal = new Salarié("55555611", "desmedt", "franck");
		Salarié sal2 = new Commercial("55555611", "desmedt", "franck");
		Commercial sal3 = new Commercial("55555611", "desmedt", "franck");
		//Salarié sal4 = new Developpeur("55555611", "desmedt", "franck", "C#");
		Salarié sal5 = new Developpeur("55555611", "desmedt", "franck", Specialite2.Cpp);
		Developpeur sal6 = new Developpeur("55555611", "desmedt", "franck", Specialite2.Cpp);
		

		System.out.printf("Le salarié  %s, %s, ", sal.getNom(), sal.getPrenom());
		sal.travailler(25);
		System.out.printf("Le salarié  %s, %s, ", sal.getNom(), sal.getPrenom());
		sal2.travailler(25);
		System.out.printf("Le salarié  %s, %s, ", sal.getNom(), sal.getPrenom());
		sal3.travailler(25);
//		System.out.printf("Le salarié  %s, %s, ", sal.getNom(), sal.getPrenom());
//		sal4.travailler(25);
		System.out.printf("Le salarié  %s, %s, %s :\n", sal.getNom(), sal.getPrenom(), Specialite2.Csharp);
		
		sal5.travailler(25);
		System.out.println("specialite :"+ sal6.getSpecialite());
	}

}
