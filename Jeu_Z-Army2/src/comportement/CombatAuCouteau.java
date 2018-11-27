package comportement;

import interfaces.EspritCombatif;

public class CombatAuCouteau implements EspritCombatif {
	@Override
	public void combat() {
	    System.out.println("Je me bats au couteau !");
	  }
}
