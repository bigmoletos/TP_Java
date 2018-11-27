/**
 * 
 */
package fr.humanBooster.controller;

import java.util.List;

import javax.ejb.EJB;

import fr.humanBooster.service.ServiceLocal;

/**
 * @author HB
 *
 */
public class PmanagerBean {
	private List<String> liste;
	
	
	//getter et setter de service
	
	/**
	 * @return the liste
	 */
	public List<String> getListe() {
		return this.liste;
	}

	/**
	 * @param liste the liste to set
	 */
	public void setListe(List<String> liste) {
		this.liste = liste;
	}

	/**
	 * @return the service
	 */
	public ServiceLocal getService() {
		return this.service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(ServiceLocal service) {
		this.service = service;
	}

	
	//appel EJB
	@EJB
	public ServiceLocal service;
	
	
public List<String> listeP(){
	
	liste=service.bonjour();
			
	return liste;
}
}
