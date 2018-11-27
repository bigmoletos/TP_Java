/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.humanbooster.controller;

import fr.humanbooster.entities.Produit;
import fr.humanboosterservice.ProduitServiceLocal;
import javax.ejb.EJB;
import java.util.List;
/**
 *
 * @author HB
 */
public class ProduitMBean {
   
	
/*	 private List<String> listP;*/
	
    private List <Produit> listP;
/*    private String nomProduit;
    private BigDecimal prixProduit;
*/    
    @EJB
    private ProduitServiceLocal service;
    
    /**
     * Creates a new instance of produitMBean
     */
    public ProduitMBean() {
    }
 
    public List<Produit> getListP() {
        return listP;
    }
   
    public void setListP(List<Produit> listP) {
        this.listP = listP;
    }
   
    
/*   
    public List<Produit> getListP() {
        return listP;
    }

    
    public void setListP(List<Produit> listP) {
        this.listP = listP;
    }

    
    public String getNomProduit() {
        return nomProduit;
    }

    
    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }
 
    
    public BigDecimal getPrixProduit() {
        return prixProduit;
    }

    
    public void setPrixProduit(BigDecimal prixProduit) {
        this.prixProduit = prixProduit;
    }
*/
    
    public String listProduit(){
        
        this.listP = service.getAllProduit();
        return "produit";
    }
    
    
    public String returnAccueil(){
        return "index";
    }
    
     
    public String addProduit(){
      //listP.add(this.nomProduit);
      return "produit";
    }


}
