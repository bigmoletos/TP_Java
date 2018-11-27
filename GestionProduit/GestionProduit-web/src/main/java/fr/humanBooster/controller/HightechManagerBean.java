/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.humanBooster.controller;

import java.util.List;

import javax.ejb.EJB;

import fr.humanBooster.service.ServiceLocal;

/**
 *
 * @author HB
 */
public class HightechManagerBean {
private List<String> message;
private List<String> liste;


	//getter et setter
    /**
 * @return the message
 */
public List<String> getMessage() {
	return this.message;
}


/**
 * @param message the message to set
 */
public void setMessage(List<String> message) {
	this.message = message;
}

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


///**
// * @return the bon
// */
//public ServiceLocal getBon() {
//	return this.bon;
//}
//
//
///**
// * @param bon the bon to set
// */
//public void setBon(ServiceLocal bon) {
//	this.bon = bon;
//}




	/**
     * Creates a new instance of HihgtechManagedBean
     * Constructeur 
     */
    public HightechManagerBean() {
    }
    
    //autres methodes
    @EJB
    private ServiceLocal bon;
    
    
    public List<String> appelBonjour() {
   
    	message=bon.bonjour();
    	System.out.println("--------hightech-------"+message.listIterator()
    	);
    	return message;
    }
}
