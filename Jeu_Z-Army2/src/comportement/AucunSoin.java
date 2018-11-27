package comportement;

import interfaces.Soin;

public class AucunSoin implements Soin {

	@Override
	public void soigner() {
		System.out.println("je ne pratique aucun soin");

	}

}
