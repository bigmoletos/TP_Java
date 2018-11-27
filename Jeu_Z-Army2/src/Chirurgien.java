import comportement.*;
import interfaces.Attitude;
import interfaces.Deplacement;
import interfaces.EspritCombatif;
import interfaces.Soin;

public class Chirurgien extends Personnage{

	
	public Chirurgien() {
		this.espritCombatif=new Pacifiste();
		this.deplacement=new Marcher();
		this.soin=new Operation();
	}
	
	public Chirurgien(EspritCombatif esprit, Soin soin, Deplacement dep, Attitude attitude) {
	    super(esprit, soin, dep,attitude);
	}
}
