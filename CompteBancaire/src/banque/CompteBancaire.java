/**
 * 
 */
package banque;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;

/**
 * @author franck Desmedt
 *
 */
public class CompteBancaire /*extends Objet*/ implements Comparable<CompteBancaire>{

	private ArrayList<OperationBancaire> listeOperations = new ArrayList<OperationBancaire>();// conteneur qui accepte
																								// tous, donc des objets
	private String titulaire;
	private String numCompte;

	// champ statique car le numero de copte doit etre unique � la classe et pas �
	// chaque instance
	private static int prochainNumeroCpte = 1;
	private static float tauxRemunueration = 0.03f;// moins bien mais on peut aussi faire :(float)0.03
	private static HashSet<CompteBancaire> tousLesComptes = new HashSet<>();// liste de tous les comptes bancaires

	// getter et setter

	/**
	 * @return the titulaire
	 */
	public String getTitulaire() {
		return titulaire;
	}

	/**
	 * @param titulaire
	 *            the titulaire to set
	 */
	public void setTitulaire(String titulaire) {
		this.titulaire = titulaire;
	}

	/**
	 * @return the solde
	 */

	// constructeur
	// surcharge du construteur
	// surcharge constructeur obligeant � entrer un titulaire

	/**
	 * @param titulaire
	 * @throws BankAccountException
	 * 
	 */
	public CompteBancaire(String titulaire) throws BankAccountException {
		// generation de numero de compte avec un numero de compte incremental
		// String
		// numCompteStr=Integer.toString(CompteBancaire.prochainNumeroCpte);//parse en
		// integer car le prochainNumeroCpte est int alors que numCompte est string
		// numCompteStr=String.format("%08d", prochainNumeroCpte);//on va mettre 8 zero
		// en d�but afin de garantir qu'un numero fera toujours au moins 8 chiffres
		// CompteBancaire.prochainNumeroCpte++;

		if (titulaire == null || titulaire.equals("")) {
			throw new BankAccountException("il faut rentrer le titulaire");
		}
		this.numCompte = CompteBancaire.generationProchainNumCpte();
		CompteBancaire.tousLesComptes.add(this);// ici on garde en memoire tous les comptes que l'on cr�e.
		// this.numCompte=this.generationProchainNumCpte();//JAMAIS car nous sommes en
		// statique
		////////////
		this.titulaire = titulaire;

	}
	//if (titulaire==null||titulaire.equals(""))
	//	throw new BankAccountException("le titulaire doit �tre renseign� !");
	// surcharge constructeur obligeant � entrer un titulaire et un solde �
	// l'ouverture
	/**
	 * 
	 * @param titulaire
	 * @param soldeOuverture
	 */
	public CompteBancaire(String titulaire, double soldeOuverture)throws BankAccountException {
		// appel � la surcharge de constructeur avec un seul argument de type chaine
		this(titulaire);// !!!!doit forcement etre la premiere instruction dans une surcharge de
						// constructeur
		////////////////////////
		this.deposerArgent(soldeOuverture);

	}

	// autres methodes

	// methode statique generationProchainNumCpte
	private static String generationProchainNumCpte() {

		String numCompteStr = Integer.toString(CompteBancaire.prochainNumeroCpte);// parse en integer car le
																					// prochainNumeroCpte est int alors
																					// que numCompte est string
		numCompteStr = String.format("%08d", prochainNumeroCpte);// on va mettre 8 zero en d�but afin de garantir qu'un
																	// numero fera toujours au moins 8 chiffres
		CompteBancaire.prochainNumeroCpte++;
		return numCompteStr;
	}

	// methode calcul de la remuneration en priver
	/**
	 * @throws BankAccountException 
	 * 
	 */
	private void remunerer() throws BankAccountException {
		try {
			if (this.getSolde() > 0) {
				this.deposerArgent(this.getSolde() * CompteBancaire.tauxRemunueration);
			}
		} catch (BankAccountException e) {
			// vu que le r�sultat sera toujours positif, je ne tomberai jamais dans
			// ce cas, donc, je fais rien dans le catch
		}

		double valeurR�mun�ration = 0;
		valeurR�mun�ration = this.getSolde() * CompteBancaire.tauxRemunueration;
		// this.getSolde()+=valeurR�mun�ration;
		this.deposerArgent(valeurR�mun�ration);// id�alement on devrait passer par par une autre methode public
		// autre version en 1 ligne
		// this.deposerArgent(this.getSolde() *
		// CompteBancaire.tauxRemunueration);//id�alement on devrait passer par par une
		// autre methode public

	}

	// methode remunerer tous les comptes en meme temps
	public static void remunererTousLesComptes() throws BankAccountException {
		for (CompteBancaire compteBancaire : tousLesComptes) {
			compteBancaire.remunerer();
		}
	}

	/**
	 * @return the numCompte
	 */
	public double getSolde() {

		double soldeCalcul� = 0;
		// calcul
		// for (int i = 0; i < listeOperations.size(); i++) {
		// OperationBancaire op = (OperationBancaire) this.listeOperations.get(i); //
		// (OperationBancaire)=cast en
		// OperationBancaire
		// avec le parametrage en <OperationBancaire> on peut chagner le code
		// cela permet de ne rentrer rien d'autre qu'une "OperationBancaire" et pas
		// n'importe quel objet comme une date
		// OperationBancaire op = this.listeOperations.get(i);
		// soldeCalcul� += op.getValeur();
		// }
		// autre methode avec un foreach
		// foreach
		for (OperationBancaire op : this.listeOperations) {
			soldeCalcul� += op.getValeur();

		}
		return soldeCalcul�;

	}

	public String getNumCompte() {

		return this.numCompte;
	}

	/**
	 * @return the tauxRemunueration
	 */
	public static float getTauxRemunueration() {
		return tauxRemunueration;
	}

	/**
	 * @param tauxRemunueration
	 *            the tauxRemunueration to set
	 */
	public static void setTauxRemunueration(float tauxRemunueration) {
		CompteBancaire.tauxRemunueration = tauxRemunueration;
	}

	/**
	 * @return the tousLesComptes
	 */
	public static HashSet<CompteBancaire> getTousLesComptes() {
		return tousLesComptes;
	}

	/**
	 * @param tousLesComptes
	 *            the tousLesComptes to set
	 */
	public static void setTousLesComptes(HashSet<CompteBancaire> tousLesComptes) {
		CompteBancaire.tousLesComptes = tousLesComptes;
	}

	// autres methodes
	public void deposerArgent(double montant) throws BankAccountException{

		// OperationBancaire newOp = new OperationBancaire(new Date(),
		// SensOperation.credit, montant);// ici donne la date
		// // actuelle
		// this.listeOperations.add(newOp);
		creerNouvelleOperation(SensOperation.credit, montant);
	}

	// surcharge de deposerArgent permettant de rentrer
	// un string au lieu d'un double du moins de faire les 2
	public void deposerArgent(String montant) throws BankAccountException {

		// plutot que de dupliquer l'implementation en convertissant le string
		// en double, onprefere d'appuyer directement sur le surcharge "double", ce
		// n'est pas un r�cursif car on
		// appel bien la methode double et non elle meme string

		double montantDouble = Double.parseDouble(montant);// parse en Double
		this.deposerArgent(montantDouble);

	}

	public void retirerArgent(double montant) throws BankAccountException{
		// OperationBancaire newOp = new OperationBancaire(new Date(),
		// SensOperation.debit, montant);// ici donne la date
		// // actuelle
		// this.listeOperations.add(newOp);
		creerNouvelleOperation(SensOperation.debit, montant);

	}

	// creer une methode qui cr�era une nouvelle operation pour evitre la
	// duplication de code
	// on a mutualise la fonction qui etait repet�e dans retirerArgent et
	// deposerArgent
	private void creerNouvelleOperation(SensOperation sens, double montant) throws BankAccountException{
if (montant<=0) 
	throw new BankAccountException("le montant d'une operation sur le compte ne peut etre negative");

		OperationBancaire newOp = new OperationBancaire(new Date(), sens, montant);// ici donne la date
																					// actuelle
		this.listeOperations.add(newOp);
	}

	// redefinition equals pour verifier les num de cptes bancaire
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// if (obj.getClass()==CompteBancaire.class) {//autre possibilite
		// si obj est bien une instance de CompteBancaire (ou
		// je dois d'abord caster l'argument pour acceder � l'API de compteBancaire
		if (obj instanceof CompteBancaire) {// instanceof renvoie vrai si l'instance de gauche est identique � celle de
											// droite
			// on d�clare un pointeur vers un objet de type compteBancaire
			CompteBancaire comptePasseEnArgument = (CompteBancaire) obj;// cast en type obj
			// vu que le numCompte est ID l'�galit� d�pend de lui!
			return this.numCompte.equals(comptePasseEnArgument.numCompte);

		}
		return false;
		// return super.equals(obj);
	}
//compare 2 comptes bancaires
	//on a pas de red�finition  de compareTo, le @override facultatif mais conseill�
	@Override
	public int compareTo(CompteBancaire autreCompte) {
		if (this.getSolde()>autreCompte.getSolde())
		{
		return -1;	
	}else if (this.getSolde()==autreCompte.getSolde()) {
		return 0;
	}
	else {
		return 1;
	}
		}
	
	
	// redefinition du hascode obligatoire car on a fait une redefinition de equals
	@Override
	public int hashCode() {
		int hashCode = -786;// valeur arbitraire
		hashCode += this.numCompte.hashCode() / 24;/// 24 valeur arbitraire
		hashCode += this.titulaire.hashCode() >> 12;// >>12 d�cale binaire vers la droite
		hashCode += Double.valueOf(this.getSolde()).hashCode() << 8;// on parse en double du fait du typage de getSolde
		hashCode *= this.listeOperations.hashCode() + 32;
		return hashCode();
	}

}
