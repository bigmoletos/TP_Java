package moteur;

import enumerations.TypeMoteur;

public class MoteurHybride extends Moteur {

	private String string;
	private double prix;

	public MoteurHybride(String puissance, double prix) {
		this.string = puissance;
		this.prix = prix;
	}

	@Override
	public TypeMoteur geTypeMoteur() {
		// TODO Auto-generated method stub
		return null;
	}
}
