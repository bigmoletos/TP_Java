package designPattern.Abstract;

import humain.Caserne;
import interfaces.IUniteFactory;

import orc.Barraks;
import warCraft2.Race;

public class FactoryParty {

	// public FactoryParty(Race race, TypePersonnage personnage) {
	// // TODO Auto-generated constructor stub
	// }

	public static IUniteFactory demarrerPartie(Race race) {
		if (race == Race.orc)
			return new Barraks();
		else
			return new Caserne();

	}

}
