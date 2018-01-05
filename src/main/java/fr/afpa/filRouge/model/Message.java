package fr.afpa.filRouge.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * Class Log
	 * 
	 */
	@Id
	@Column(name="id_message")
	private int idmessage;
	@Column(name="id_groupe")
	private int idGroup;
	@Column(name = "message_groupe")
	private String messagetxt;
	@Column(name = "time_message")
	private String localdatetime;
	
	// CONSTRUCTEUR
	public Message(){}
	
	public Message(int idmessage, String messagetxt, String localdatetime) {
		this.idmessage = idmessage;
		this.messagetxt = messagetxt;
		this.localdatetime = localdatetime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return localdatetime + " : " + messagetxt ;
	}
	// GETTERS & SETTERS

	/**
	 * @return the id_message
	 */
	public int getId_message() {
		return idmessage;
	}

	/**
	 * @param id_message the id_message to set
	 */
	public void setId_message(int id_message) {
		this.idmessage = id_message;
	}

	/**
	 * @return the idGroupe
	 */
	public int getIdGroupe() {
		return idGroup;
	}

	/**
	 * @param idGroupe the idGroupe to set
	 */
	public void setIdGroupe(int idGroup) {
		this.idGroup = idGroup;
	}

	/**
	 * @return the messagetxt
	 */
	public String getMessagetxt() {
		return messagetxt;
	}

	/**
	 * @param messagetxt the messagetxt to set
	 */
	public void setMessagetxt(String messagetxt) {
		this.messagetxt = messagetxt;
	}

	/**
	 * @return the localdatetime
	 */
	public String getLocaldatetime() {
		return localdatetime;
	}

	/**
	 * @param localdatetime the localdatetime to set
	 */
	public void setLocaldatetime(String localdatetime) {
		this.localdatetime = localdatetime;
	}


}
