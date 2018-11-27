import comportement.*;
import interfaces.Attitude;
import interfaces.Deplacement;
import interfaces.EspritCombatif;
import interfaces.Soin;

public class Medecin extends Personnage{
  public Medecin() {
    this.soin = new PremierSoin();
  }
  public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep, Attitude attitude) {
    super(esprit, soin, dep,attitude);
  }	
}