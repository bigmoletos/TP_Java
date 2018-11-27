



class Test{
  public static void main(String[] args) {
   Sniper sniper1=new Sniper();
//sniper1.setAttitude("très concentré");
	  
	  Personnage[] tPers = {sniper1,new Guerrier(), new Civil(), new Medecin(),new Chirurgien()};
		
    for(int i = 0; i < tPers.length; i++){
      System.out.println("\nInstance de " + tPers[i].getClass().getName());
      System.out.println("*****************************************");
      tPers[i].combattre();
      tPers[i].seDeplacer();
      tPers[i].soigner();
      tPers[i].attitude();
      
    }		
  }
}
