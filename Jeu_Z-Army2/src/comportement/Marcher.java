package comportement;

import interfaces.Deplacement;

public class Marcher implements Deplacement {

	@Override
	public void deplacer() {
		System.out.println("je marche uniquement");

	}

}
