package fr.humanBooster.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class ProduitsService implements ServiceLocal {

	List<String> prodList;
	List<String> salut;

	// getter et setter
	/**
	 * @return the prodList
	 */
	public List<String> getProdList() {
		return this.prodList;
	}

	/**
	 * @param prodList
	 *            the prodList to set
	 */
	public void setProdList(List<String> prodList) {
		this.prodList = prodList;
	}

	/**
	 * @return the salut
	 */
	public List<String> getSalut() {
		return this.salut;
	}

	/**
	 * @param salut the salut to set
	 */
	public void setSalut(List<String> salut) {
		this.salut = salut;
	}

	// override méthode serviceLocal
	@Override
	public List<String> lesProduits() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> bonjour() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> lProduits() {
		// System.out.println("liste de tous les produits");

		prodList = new ArrayList<String>();
		prodList.add("seidge");
		prodList.add("perdigone");
		prodList.add("nymphe");
		prodList.add("Cdc");
		prodList.add("canne");
		prodList.add("soie");
		prodList.add("pointe");
		return prodList;
	}

	
	@Override
	public  List<String> hello() {
		 salut=new ArrayList<String>();
		salut.add("seidge");
		salut.add("perdigone");
		salut.add("nymphe");
		salut.add("Cdc");
		salut.add("canne");
		salut.add("soie");
		salut.add("pointe");
		return salut;
	}
}
