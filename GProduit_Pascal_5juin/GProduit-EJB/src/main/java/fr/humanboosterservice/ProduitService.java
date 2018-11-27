/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.humanboosterservice;

//import java.util.ArrayList;
import java.util.List;

//import fr.humanbooster.gestionprojets.entity.Produit;
//import fr.humanbooster.persistance.ProduitJpaController;
//import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import fr.humanbooster.entities.Produit;

/**
 *
 * @author HB
 */
@Stateless
public class ProduitService implements ProduitServiceLocal{
    @PersistenceContext private EntityManager em;

/*    @Override
    public List<Produit> getAllProduit() {
    	List<String> listP = new ArrayList <String>();
        
        for(int i = 0; i < 10; i++){
            listP.add("Produit "+i);
        }
         return listP;
    } */


    @Override
    public List<Produit> getAllProduit() {
      return findProduitEntities();
    } 

    
/*
    public void create(Produit p) throws RollbackFailureException, Exception{
        //EntityManager em = null;
        try {
              utx.begin();
              em = getEntityManager();
              Categorie idCategorie = produit.getIdCategorie();
              if (idCategorie != null) {
                idCategorie = em.getReference(idCategorie.getClass(), idCategorie.getIdCategorie());
                produit.setIdCategorie(idCategorie);
              }
              em.persist(produit);
              if (idCategorie != null) {
                idCategorie.getProduitList().add(produit);
                idCategorie = em.merge(idCategorie);
              }
              utx.commit();
          } catch (Exception ex) {
              try {
                utx.rollback();
              } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
              }
              throw ex;
          } finally {
            if (em != null) {
                em.close();
            }
          }
    }
*/    

/*    
    public void edit throws NonexistentEntityException, RollbackFailureException, Exception (Produit p){
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Produit persistentProduit = em.find(Produit.class, produit.getIdProduit());
            Categorie idCategorieOld = persistentProduit.getIdCategorie();
            Categorie idCategorieNew = produit.getIdCategorie();
            if (idCategorieNew != null) {
                idCategorieNew = em.getReference(idCategorieNew.getClass(), idCategorieNew.getIdCategorie());
                produit.setIdCategorie(idCategorieNew);
            }
            produit = em.merge(produit);
            if (idCategorieOld != null && !idCategorieOld.equals(idCategorieNew)) {
                idCategorieOld.getProduitList().remove(produit);
                idCategorieOld = em.merge(idCategorieOld);
            }
            if (idCategorieNew != null && !idCategorieNew.equals(idCategorieOld)) {
                idCategorieNew.getProduitList().add(produit);
                idCategorieNew = em.merge(idCategorieNew);
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = produit.getIdProduit();
                if (findProduit(id) == null) {
                    throw new NonexistentEntityException("The produit with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
*/
    
/*    
	public void destroy throws NonexistentEntityException, RollbackFailureException, Exception (Integer id){
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Produit produit;
            try {
                produit = em.getReference(Produit.class, id);
                produit.getIdProduit();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The produit with id " + id + " no longer exists.", enfe);
            }
            Categorie idCategorie = produit.getIdCategorie();
            if (idCategorie != null) {
                idCategorie.getProduitList().remove(produit);
                idCategorie = em.merge(idCategorie);
            }
            em.remove(produit);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }	
*/
    
    
	public List<Produit> findProduitEntities(){
        return findProduitEntities(true, -1, -1);
    }
 
    
    
    public List<Produit> findProduitEntities(int maxResults, int firstResult){
        return findProduitEntities(false, maxResults, firstResult);
    }


    
    private List<Produit> findProduitEntities(boolean all, int maxResults, int firstResult){
    //    EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Produit.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

   
/*    
    public Produit findProduit(Integer id){
        EntityManager em = getEntityManager();
        try {
            return em.find(Produit.class, id);
        } finally {
            em.close();
        }
    }
*/
    
/*    
    public int getProduitCount(){
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Produit> rt = cq.from(Produit.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
*/
    
}
