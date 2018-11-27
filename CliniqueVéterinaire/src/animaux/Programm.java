package animaux;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat shafou = null;// = new Chat("Shafou", 7,"Franck");

		//serialisation(shafou);//pour serialiser
		shafou=deserialisation();//pour deserialiser
		
			
		
		Iguane iguane=new Iguane();
		iguane.setName("godzilla");
		iguane.setAge(5);
		iguane.setProprio("franck");
		
		
		
		Crocodile croco=new Crocodile();
		
		
		CliniqueVeterinaire clinique=new CliniqueVeterinaire();
		//clinique.acceuillirAnimal(shafou);
		clinique.acceuillirAnimal(shafou);
		clinique.acceuillirAnimal(iguane);
		//clinique.acceuillirAnimal(croco);//ne marche ce qui normal car n'implemente pas l'interface IAnimalDomestique
		
	//	System.out.printf("%s",clinique.(shafou));
	}

	private static void serialisation(Chat chat) {
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\HB\\Desktop\\sauveShafou.bin");
			ObjectOutputStream oss117= new ObjectOutputStream(fos);
			oss117.writeObject(chat);
			oss117.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		
		private static Chat deserialisation() {
			try {
				FileInputStream fos2=new FileInputStream("C:\\Users\\HB\\Desktop\\sauveShafou.bin");
				ObjectInputStream oss118= new ObjectInputStream(fos2);
				return (Chat)oss118.readObject();
				//oss118.writeObject(shafou);
			//	oss118.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				// classe avec laquelle l'objet sérialisé a ete crée 
				e.printStackTrace();
			}
			return null;//pas d'objet crée
	}

}
