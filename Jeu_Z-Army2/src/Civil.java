import comportement.*;
import interfaces.Attitude;
import interfaces.Deplacement;
import interfaces.EspritCombatif;
import interfaces.Soin;

public class Civil extends Personnage{
  public Civil() {}

  public Civil(EspritCombatif esprit, Soin soin, Deplacement dep, Attitude attitude) {
	    super(esprit, soin, dep,attitude);
  }	
}