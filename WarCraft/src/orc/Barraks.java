package orc;

import interfaces.IUniteFactory;
import warCraft2.TypePersonnage;

public abstract class Barraks implements IUniteFactory {

	

	@Override
	public void creationUniteLegere() {
		// TODO Auto-generated method stub
		return new Grunt();
	}

	@Override
	public void creationUniteLourde() {
		return new Ogre();

	}

	@Override
	public void creationUniteVolante() {
		return new Dragon();

	}



}
