package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the produit database table.
 * 
 */
@Entity
@Table(name = "produit")
@NamedQuery(name="Produit.findAll", query="SELECT p FROM Produit p")
public class Produit implements Serializable {
//	private static final long serialVersionUID = 1L;
//	@Id
//	@Column(name="id_produit")
//	private int idProduit;
//
//	private String nom;
//
//	private float prix;
//
//	//bi-directional many-to-one association to Categorie
//	@ManyToOne
//	@JoinColumn(name="id_categorie", referencedColumnName="id_categorie")
//	private Categorie categorie;
//
//	public Produit() {
//	}
//
//	public int getIdProduit() {
//		return this.idProduit;
//	}
//
//	public void setIdProduit(int idProduit) {
//		this.idProduit = idProduit;
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
//	public float getPrix() {
//		return this.prix;
//	}
//
//	public void setPrix(float prix) {
//		this.prix = prix;
//	}
//
//	public Categorie getCategorie() {
//		return this.categorie;
//	}
//
//	public void setCategorie(Categorie categorie) {
//		this.categorie = categorie;
//	}
	   private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "id_produit")
	    private Integer idProduit;
	    @Basic(optional = false)
	    @Column(name = "nom")
	    private String nom;
	    @Basic(optional = false)
	    @Column(name = "prix")
	    private float prix;
	    @JoinColumn(name = "id_categorie", referencedColumnName = "id_categorie")
	    @ManyToOne(optional = false, fetch = FetchType.LAZY)
	    private Categorie idCategorie;

	    public Produit() {
	    }

	    public Produit(Integer idProduit) {
	        this.idProduit = idProduit;
	    }

	    public Produit(Integer idProduit, String nom, float prix) {
	        this.idProduit = idProduit;
	        this.nom = nom;
	        this.prix = prix;
	    }

	    public Integer getIdProduit() {
	        return idProduit;
	    }

	    public void setIdProduit(Integer idProduit) {
	        this.idProduit = idProduit;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public float getPrix() {
	        return prix;
	    }

	    public void setPrix(float prix) {
	        this.prix = prix;
	    }

	    public Categorie getIdCategorie() {
	        return idCategorie;
	    }

	    public void setIdCategorie(Categorie idCategorie) {
	        this.idCategorie = idCategorie;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 0;
	        hash += (idProduit != null ? idProduit.hashCode() : 0);
	        return hash;
	    }

	    @Override
	    public boolean equals(Object object) {
	        // TODO: Warning - this method won't work in the case the id fields are not set
	        if (!(object instanceof Produit)) {
	            return false;
	        }
	        Produit other = (Produit) object;
	        if ((this.idProduit == null && other.idProduit != null) || (this.idProduit != null && !this.idProduit.equals(other.idProduit))) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "fr.humanbooster.gestionproduit_entities.Produit[ idProduit=" + idProduit + " ]";
	    }
}