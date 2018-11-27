package societe;

//enumeration avec des caracteres speciaux
public enum Specialite2 {
	Cpp("C++"), Php("PHP7"), Csharp("C #"), Java("Java JEE");

	private final String libelle;

	private Specialite2(String libelle) {
		this.libelle = libelle;

	}

	public String getlibelle() {
		return this.libelle;
	}

}
