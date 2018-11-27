import comportement.*;
import interfaces.*;

public class Sniper extends Personnage {	
 
  
public Sniper(){
    this.espritCombatif = new CombatFusil();
   
    this.attitude=new Concentre();
  }
  public Sniper(EspritCombatif esprit, Soin soin, Deplacement dep, Attitude attitude) {
    super(esprit, soin, dep, attitude);
    
  }
  

}