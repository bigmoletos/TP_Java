import warCraft2.Race;
import warCraft2.TypePersonnage;
import designPattern.Abstract.FactoryParty;
import  interfaces.*;

/**
 * 
 */

/**
 * @author franck Desmedt
 *
 */
public class Programm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryParty soldat = new FactoryParty();

		IUniteFactory uniteFactory=FactoryParty.demarrerPartie(Race.humain);
		IUniteLeger u1=uniteFactory.creationUniteLegere();
		u1.frapper();
		IUniteLourde u2=uniteFactory.creationUniteLourde();
		u2.frapperFort();
		IUniteVolant u3=uniteFactory.creationUniteVolante();
		u3.attaqueEnVolant();
		//IUniteVolant.attaqueEnVolant();
		//IUniteKafi u4=unitekiTu.vendreUniteEnfer(TypePersonnage.griffon);
		// todo
		// afficher message
		// "le soldat frappe"
		// "le chevalier frappe fort"
		// "le griffon attaque en volant"
	}

}
