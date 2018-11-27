import comportement.*;
import interfaces.Attitude;
import interfaces.Deplacement;
import interfaces.EspritCombatif;
import interfaces.Soin;

public abstract class Personnage {

  //Nos instances de comportement
  protected EspritCombatif espritCombatif = new Pacifiste();
  protected Soin soin = new AucunSoin();
  protected Deplacement deplacement = new Marcher();	
  protected Attitude attitude = new Concentre();	
	
  //Constructeur par d�faut
  public Personnage(){}
	
  //Constructeur avec param�tres
  public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement, Attitude attitude) {
    this.espritCombatif = espritCombatif;
    this.soin = soin;
    this.deplacement = deplacement;
    this.attitude = attitude;
  }
	
  //M�thode de d�placement de personnage
  public void seDeplacer(){
    //On utilise les objets de d�placement de fa�on polymorphe
    deplacement.deplacer();
  }

  // M�thode que les combattants utilisent
  public void combattre(){
    //On utilise les objets de d�placement de fa�on polymorphe
    espritCombatif.combat();
  }
	
  //M�thode de soin
  public void soigner(){
    //On utilise les objets de d�placement de fa�on polymorphe
    soin.soigner();
  }

  //M�thode attitude
  public void attitude() {
	attitude.attitude();
}
  
  //Red�finit le comportement au combat
  public void setEspritCombatif(EspritCombatif espritCombatif) {
    this.espritCombatif = espritCombatif;
  }

  //Red�finit le comportement de Soin
  public void setSoin(Soin soin) {
    this.soin = soin;
  }

  //Red�finit le comportement de d�placement
  public void setDeplacement(Deplacement deplacement) {
    this.deplacement = deplacement;
  }	

//Red�finit le comportement d'attitude
public void setAttitude(Attitude attitude) {
	this.attitude = attitude;
}	
}
