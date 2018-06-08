package interfaces;

import warCraft2.TypePersonnage;

public interface IUniteFactory {
	void demarrePartie(TypePersonnage race);
	void creationUniteLegere();
	void creationUniteLourde();
	void creationUniteVolante();
	void frapper();
	//IUniteLeger createUlegere();
}
