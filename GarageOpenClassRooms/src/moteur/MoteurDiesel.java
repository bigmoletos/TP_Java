package moteur;

import enumerations.TypeMoteur;

public  class MoteurDiesel extends  Moteur{

	private double prix;
	private String string;
	
	
	public MoteurDiesel(String puissance, double prix) {
		this.string=puissance;
		this.prix=prix;
	}
	
	@Override
	public TypeMoteur geTypeMoteur() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
