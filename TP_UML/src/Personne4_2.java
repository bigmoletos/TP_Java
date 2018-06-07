/**
 *exo 4.2
 * Exercice 1.6 (Héritage)

Un élève et un formateur ont tous les deux des choses en commun, 
des connaissances en POO ou non, un prénom, un nom et un âge, ils rentrent le soir chez eux.
 *
 *ici on va juste avoir un emethode differente sur rentre le soir et connaisnce POO
 */

/**
 * @author franck Desmedt
 *
 */
public class Personne4_2 {
private String nom;
private String prenom;
private int age;
private boolean connaissancePOO;


//getter et setter
/**
 * @return the nom
 */
public String getNom() {
	return this.nom;
}
/**
 * @param nom the nom to set
 */
public void setNom(String nom) {
	this.nom = nom;
}
/**
 * @return the prenom
 */
public String getPrenom() {
	return this.prenom;
}
/**
 * @param prenom the prenom to set
 */
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
/**
 * @return the age
 */
public int getAge() {
	return this.age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}


/**
 * @return the connaissancePOO
 */
public boolean isConnaissancePOO() {
	return this.connaissancePOO;
}
/**
 * @param connaissancePOO the connaissancePOO to set
 */
public void setConnaissancePOO(boolean connaissancePOO) {
	this.connaissancePOO = connaissancePOO;
}



//autres methodes
public void rentreLeSoir() {
	System.out.println("je rentre le soir A ");
}

public void connaissncePoo() {
	
}

}
