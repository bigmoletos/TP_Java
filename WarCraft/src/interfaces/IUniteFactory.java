package interfaces;

import warCraft2.TypePersonnage;

public interface IUniteFactory {
	void demarrePartie(TypePersonnage race);
	IUniteLeger creationUniteLegere();
	IUniteLourde creationUniteLourde();
	IUniteVolant creationUniteVolante();
	//void frapper();
	//IUniteLeger createUlegere();
	void frapper();
	void creationUniteLegere(TypePersonnage race);
	void creationUniteLourde(TypePersonnage race);
	void creationUniteVolante(TypePersonnage race);
}
