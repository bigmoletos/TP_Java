/**
 * 
 */
package voiture;

import java.util.HashMap;


/**
 * @author franck Desmedt
 *
 */
public class Voiture {
	
	HashMap<positionRoue, Roue> rouesDeRoulage=new HashMap<>();

	public Roue DemonterRoue(positionRoue pos) {
		Roue roueDemontee= rouesDeRoulage.remove(pos);
	
		return roueDemontee;
	}
	
	public boolean MonterRoue(positionRoue pos, Roue r) {
		
		if (!rouesDeRoulage.containsKey(pos)) {
			//c'est bon y a pas d eroue
			rouesDeRoulage.put(pos, r);
			return true;
		} else {
//je peux pas monter  il y a deja une roue montée
		}
		return false;
	}
	
}
