package animaux;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import clinique.IAnimalDomestique;

public class CliniqueVeterinaire {
	private HashMap<IAnimalDomestique, FicheAnimal > ficheInternes= new  HashMap<>();
	private Set<IAnimalDomestique> patients= new HashSet<>();

	// classe dans une classe
	//nested classe destinée à l'usage interne car private
	private class FicheAnimal{
		private String contenuFiche;
		public FicheAnimal(IAnimalDomestique animal) {
			contenuFiche=String.format("%s est une %s de %d appartenant à %s", 
					animal.getName(),
					animal.getClass().getName(),//récuperation de la classe Object donne le nom de la classe
					animal.getAge(),
					animal.getProprio()
									);
					}
	}
	
	public void acceuillirAnimal(IAnimalDomestique animalASoigner) {
		//rédaction de la fiche
		FicheAnimal f=null;
		if (!ficheInternes.containsKey(animalASoigner)) {
			//j'ai pas encore rédigé la fiche
			ficheInternes.put(animalASoigner, new FicheAnimal(animalASoigner));
		}
		f=ficheInternes.get(animalASoigner);
		patients.add(animalASoigner);
	}
	
}
