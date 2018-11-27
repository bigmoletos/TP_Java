/**
 * 
 */
package garage;

import java.util.HashSet;
import java.util.Set;

import vehicules.Vehicule;

/**
 * @author franck Desmedt
 *
 */
public  class Garage {

	private Set<Vehicule> listeVoitures=new HashSet<>();//liste unique des véhicules en concession
	
	public void addVoiture(Vehicule vehicule) {
		// TODO Auto-generated method stub
		listeVoitures.add(vehicule);
	}

	@Override
	public String toString() {
		
		if (listeVoitures.size()==0)
		{
			return "Aucune voiture sauvegardée";
		}
		StringBuilder strBuilder = new StringBuilder();//stringBuilder permet de concatener des Strings, il est preferable au +
		for (Vehicule v : listeVoitures)
		{
			strBuilder.append(v.toString());//append va rajouter la chaine entre ()
			strBuilder.append('\n');
		}
		return strBuilder.toString();//on renvoie la chaine toString compléte
	}
		
	
	
}
