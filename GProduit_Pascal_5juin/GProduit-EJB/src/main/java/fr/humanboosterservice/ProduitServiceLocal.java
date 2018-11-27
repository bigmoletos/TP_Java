package fr.humanboosterservice;
import java.util.List;
import javax.ejb.Local;

import fr.humanbooster.entities.Produit;

@Local
public interface ProduitServiceLocal {
	public List<Produit> getAllProduit();
	// public void create(Produit p);
	// public void edit(Produit p);
	// public void destroy(Integer id);
	// public List<Produit> findProduitEntities(); 
    // public List<Produit> findProduitEntities(int maxResults, int firstResult);
    // private List<Produit> findProduitEntities(boolean all, int maxResults, int firstResult);
    // public Produit findProduit(Integer id); 
    // public int getProduitCount();
}
