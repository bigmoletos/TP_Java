import comportement.*;
import interfaces.Attitude;
import interfaces.Deplacement;
import interfaces.EspritCombatif;
import interfaces.Soin;

public class Guerrier extends Personnage {	
  public Guerrier(){
    this.espritCombatif = new CombatPistolet();
    this.deplacement = new Courir();
  }
  public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep, Attitude attitude) {
	    super(esprit, soin, dep,attitude);
  }
}