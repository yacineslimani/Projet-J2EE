package fr.uvsq.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adresse {
	@Id
	@GeneratedValue
	Long idAdresse;
	String rue;
	String ville;
	int codePostal;
	
	protected Adresse(String rue, String ville, int codePostal) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	public Long getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(Long idAdresse) {
		this.idAdresse = idAdresse;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	
	

}
