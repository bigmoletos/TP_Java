/**
 * 
 */
package humain;

import interfaces.IUniteFactory;
import warCraft2.TypePersonnage;

/**
 * @author franck Desmedt
 *
 */
public class Soldat implements IUniteFactory{

	@Override
	public void frapper() {
		System.out.println("le soldat frappe");

	}

	

	
}
