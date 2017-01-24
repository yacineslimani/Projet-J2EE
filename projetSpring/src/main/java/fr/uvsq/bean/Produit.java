package fr.uvsq.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit {
	@Id
	@GeneratedValue
	private Long idProduit;
	private String libelle;
	@ManyToOne 
	@JoinColumn (name="idCategorie")
	private Categorie categorie;
	private int stock;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public  Produit(String libelle, Categorie categorie, int stock) {
		super();
		this.libelle = libelle;
		this.categorie = categorie;
		this.stock = stock;
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}
