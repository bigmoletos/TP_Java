package Formation;

public class Message {

	//methode donnant le nom de la classe en cours
	public void nomClasse() {
		System.out.println(" message avec getClass seul :\n"+getClass()+"  \nautre message avec getClass et getName :\n"+getClass().getName());
	}
}
