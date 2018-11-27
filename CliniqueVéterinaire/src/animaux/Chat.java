package animaux;

import java.io.Serializable;

import clinique.IAnimalDomestique;

public class Chat extends Felide implements IAnimalDomestique, Serializable{

	/**
	 * crée pour la serialisation
	 * utilisé pour comparer la version serialisée de la classe et son implémentation actuelle
	 * Doit etre regenere si changement dans les getter et setter et ou les champs
	 */
	private static final long serialVersionUID = 6922274304552836155L;
	private int age;
	private String proprio;
	private String name;

	// constructeur
	public Chat() {
		
	}
	
	// surcharge constructeur
	public Chat(String name, int age, String proprio) {
		this.age = age;
		this.proprio = proprio;
		this.name = name;
	}

	@Override
	public int getAge() {
		return age;
	};

	@Override
	public void setAge(int age) {
		 this.age = age;
	};

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		 this.name = name;
	}

	@Override
	public String getProprio() {
		return proprio;
	}

	@Override
	public void setProprio(String proprio) {

		 this.proprio = proprio;
	}
}