package comportement;

import interfaces.Deplacement;

public class Courir implements Deplacement {
	@Override
	public void deplacer() {
    System.out.println("Je me d�place en courant.");
  }
}