package moteur;

import enumerations.TypeMoteur;

public class MoteurElectrique extends Moteur {

	private String string;
	private double prix;

	public MoteurElectrique(String puissance, double prix) {
		this.string = puissance;
		this.prix = prix;
	}

	@Override
	public TypeMoteur geTypeMoteur() {
		// TODO Auto-generated method stub
		return null;
	}

}
