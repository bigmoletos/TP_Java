import java.util.Scanner;

/**
 * Exercice 3.9

Un commer�ant accorde une remise de 5 % pour tout achat d�un montant
 compris entre 100 et 500 � et 8 % au-del�. �crire une fonction de calcul du montant de la remise
 sur un achat donn� et qui retourne cette valeur.
 */

/**
 * @author franck Desmedt
 *
 */
public class Remise3_9 {

	public float remise(Float value) {
		Scanner scanner = null;
		if (value >= 10 && value <= 500) {
			return (float) (value * 0.95);
		} else if (value > 500) {
			// il faut forcement caste le resullat en float (float) (value*0.92);
			return (float) (value * 0.92);
		}
		return value;
	}

}
