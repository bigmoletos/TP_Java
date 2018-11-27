package moteur;

import enumerations.TypeMoteur;

public class MoteurEssence extends Moteur {

	private String string;
	private double prix;

	public MoteurEssence() {
		// TODO Auto-generated constructor stub
	}

	public MoteurEssence(String puissance, double prix) {
		this.string = puissance;
		this.prix = prix;
	}

	@Override
	public TypeMoteur geTypeMoteur() {
		// TODO Auto-generated method stub
		return null;
	}

}
