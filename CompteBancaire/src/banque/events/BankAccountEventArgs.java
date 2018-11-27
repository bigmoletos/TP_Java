package banque.events;

import banque.CompteBancaire;

public class BankAccountEventArgs {
public final CompteBancaire source;
public final double montantOperation;


public void BankAccountEventArgs(CompteBancaire s, double montant) {
	
}


}
