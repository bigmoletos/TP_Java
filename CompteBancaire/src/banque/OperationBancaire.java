/**
 * 
 */
package banque;

import java.util.Date;

/**
 * @author franck Desmedt immutable
 */
public class OperationBancaire {

	// une op�ration bancaire n'est pas modifiable car il doit toujours y avoir une
	// trace
	// c'est donc un objet immuable sa valeur ne peut pas etre modifi� apres la
	// cr�ation de son instance

	public final Date date; // final signifie que la valeur devra �tre initialis� dans le constructeur et ne
							// pourra plus etre modifi�
	public final double montant; // final signifie que la valeur devra �tre initialis� dans le constructeur et ne
									// pourra plus etre modifi�
	public final SensOperation sens; // final signifie que la valeur devra �tre initialis� dans le constructeur et ne
										// pourra plus etre modifi�

	public OperationBancaire(Date dateOp, SensOperation sensOp, double montantOp) {
		this.date = dateOp;
		this.montant = montantOp;
		this.sens = sensOp;
	}

	public double getValeur() {
		if (this.sens == SensOperation.credit) {
			return this.montant;

		} else {
			return -this.montant;
		}
	}
	
	
}
