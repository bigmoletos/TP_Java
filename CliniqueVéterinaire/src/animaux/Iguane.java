package animaux;

import clinique.IAnimalDomestique;

public class Iguane extends Reptile implements IAnimalDomestique {

	private int age;
	private String proprio;
	private String name;

	// constructeur
	// public Iguane(String name, int age, String proprio) {
	// this.age = age;
	// this.proprio = proprio;
	// this.name = name;
	// }
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
