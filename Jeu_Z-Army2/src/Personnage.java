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
	
  //Constructeur par défaut
  public Personnage(){}
	
  //Constructeur avec paramètres
  public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement, Attitude attitude) {
    this.espritCombatif = espritCombatif;
    this.soin = soin;
    this.deplacement = deplacement;
    this.attitude = attitude;
  }
	
  //Méthode de déplacement de personnage
  public void seDeplacer(){
    //On utilise les objets de déplacement de façon polymorphe
    deplacement.deplacer();
  }

  // Méthode que les combattants utilisent
  public void combattre(){
    //On utilise les objets de déplacement de façon polymorphe
    espritCombatif.combat();
  }
	
  //Méthode de soin
  public void soigner(){
    //On utilise les objets de déplacement de façon polymorphe
    soin.soigner();
  }

  //Méthode attitude
  public void attitude() {
	attitude.attitude();
}
  
  //Redéfinit le comportement au combat
  public void setEspritCombatif(EspritCombatif espritCombatif) {
    this.espritCombatif = espritCombatif;
  }

  //Redéfinit le comportement de Soin
  public void setSoin(Soin soin) {
    this.soin = soin;
  }

  //Redéfinit le comportement de déplacement
  public void setDeplacement(Deplacement deplacement) {
    this.deplacement = deplacement;
  }	

//Redéfinit le comportement d'attitude
public void setAttitude(Attitude attitude) {
	this.attitude = attitude;
}	
}
