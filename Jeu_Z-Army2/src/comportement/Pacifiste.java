package comportement;

import interfaces.EspritCombatif;

public class Pacifiste implements EspritCombatif {

	@Override
	public void combat() {
		System.out.println("ne combat pas");

	}

}
