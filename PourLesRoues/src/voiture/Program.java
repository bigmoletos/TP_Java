/**
 * 
 */
package voiture;

/**
 * @author franck Desmedt
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Roue roue1= new Roue("12468");
		Roue roue2= new Roue("453287");
		
		Voiture voiture=new Voiture();
	boolean montageEffectué=voiture.MonterRoue(positionRoue.ArrD, roue1);
	if (montageEffectué) {
		montageEffectué=voiture.MonterRoue(positionRoue.ArrD, roue2);
		System.out.println(montageEffectué);
	}
		
	if (montageEffectué) {
		System.out.println("les 2 roues sont montées");
	}	
		
	Roue roueDemonte=voiture.DemonterRoue(positionRoue.ArrD);
	int i=0;
	
	}

}
