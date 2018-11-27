package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the categorie database table.
 * 
 */
@Entity
@Table(name = "categorie")
@NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c")
public class Categorie implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "id_categorie")
	    private Integer idCategorie;/*nom des colonnes*/
	    @Basic(optional = false)
	    @Column(name = "nom")
	    private String nom;/*nom des colonnes*/
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCategorie", fetch = FetchType.LAZY)
	    private List<Produit> produitList;

	    public Categorie() {
	    }

	    public Categorie(Integer idCategorie) {
	        this.idCategorie = idCategorie;
	    }

	    public Categorie(Integer idCategorie, String nom) {
	        this.idCategorie = idCategorie;
	        this.nom = nom;
	    }

	    public Integer getIdCategorie() {
	        return idCategorie;
	    }

	    public void setIdCategorie(Integer idCategorie) {
	        this.idCategorie = idCategorie;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

//	    @XmlTransient
	    public List<Produit> getProduitList() {
	        return produitList;
	    }

	    public void setProduitList(List<Produit> produitList) {
	        this.produitList = produitList;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (idCategorie != null ? idCategorie.hashCode() : 0);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object object) {
	        // TODO: Warning - this method won't work in the case the id fields are not set
	        if (!(object instanceof Categorie)) {
	            return false;
	        }
	        Categorie other = (Categorie) object;
	        if ((this.idCategorie == null && other.idCategorie != null) || (this.idCategorie != null && !this.idCategorie.equals(other.idCategorie))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "fr.humanbooster.gestionproduit_entities.Categorie[ idCategorie=" + idCategorie + " ]";
	    }
	
//	private static final long serialVersionUID = 1L;
//
//	private String nom;
//
//	// bi-directional many-to-one association to Produit
//	@OneToMany(mappedBy = "categorie")
//	private List<Produit> produits;
//
//	@Id
//	@Column(name = "id_categorie")
//	private int id_categorie;
//
//	// getter et setter
//	/**
//	 * @return the id_categorie
//	 */
//	public int getId_categorie() {
//		return this.id_categorie;
//	}
//
//	/**
//	 * @param id_categorie
//	 *            the id_categorie to set
//	 */
//	public void setId_categorie(int id_categorie) {
//		this.id_categorie = id_categorie;
//	}
//
//	public Categorie() {
//	}
//
//	public String getNom() {
//		return this.nom;
//	}
//
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//
//	public List<Produit> getProduits() {
//		return this.produits;
//	}
//
//	public void setProduits(List<Produit> produits) {
//		this.produits = produits;
//	}
//
//	// autres méthodes
//	// ajouter produit
//	public Produit addProduit(Produit produit) {
//		getProduits().add(produit);
//		produit.setCategorie(this);
//
//		return produit;
//	}
//
//	// delete produit
//	public Produit removeProduit(Produit produit) {
//		getProduits().remove(produit);
//		produit.setCategorie(null);
//
//		return produit;
//	}

}