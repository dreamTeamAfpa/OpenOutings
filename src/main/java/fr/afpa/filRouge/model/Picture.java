package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * picture class
 */
@Entity
@Table(name = "picture")
public class Picture implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_picture")
	private int idpicture;
	@Column(name="person_id_person")
	private int idperson;
	@Column(name = "picture")
	private Blob picture;
	@Column(name="profil_picture")
	private boolean isprofil;
	
	
	//CONSTRUCTEUR
	public Picture() {}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Picture [idpicture=" + idpicture + ", idperson=" + idperson + ", "
				+ (picture != null ? "picture=" + picture + ", " : "") + "isprofil=" + isprofil + "]";
	}

	//GETTERS & SETTERS
	/**
	 * @return the idpicture
	 */
	public int getIdpicture() {
		return idpicture;
	}

	/**
	 * @param idpicture the idpicture to set
	 */
	public void setIdpicture(int idpicture) {
		this.idpicture = idpicture;
	}

	/**
	 * @return the idperson
	 */
	public int getIdperson() {
		return idperson;
	}

	/**
	 * @param idperson the idperson to set
	 */
	public void setIdperson(int idperson) {
		this.idperson = idperson;
	}

	/**
	 * @return the picture
	 */
	public Blob getPicture() {
		return picture;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	/**
	 * @return the isprofil
	 */
	public boolean isIsprofil() {
		return isprofil;
	}

	/**
	 * @param isprofil the isprofil to set
	 */
	public void setIsprofil(boolean isprofil) {
		this.isprofil = isprofil;
	}
	
	
}
