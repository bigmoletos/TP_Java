package comportement;

import interfaces.Soin;

public class Operation implements Soin {
 
	@Override
	public void soigner() {
    System.out.println("Je pratique des op�rations !");
  }
}

