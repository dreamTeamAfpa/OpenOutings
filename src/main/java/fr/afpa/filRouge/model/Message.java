package fr.afpa.filRouge.model;

import java.awt.TrayIcon.MessageType;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	@Column(name = "message")
	private String messagetxt;
	@Column(name = "time_message")
	private String localdatetime;
	@ManyToOne
	private Person person;
	@Column(name="type")
	private MessageType type;
	
	
	public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
	
	// CONSTRUCTEUR
	public Message(){}
	
	public Message(int idmessage, String messagetxt, String localdatetime) {
		this.idmessage = idmessage;
		this.messagetxt = messagetxt;
		this.localdatetime = localdatetime;
	}

	public Message(String messagetxt) {
		this.messagetxt = messagetxt;
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
	 * @return the idmessage
	 */
	public int getIdmessage() {
		return idmessage;
	}

	/**
	 * @param idmessage the idmessage to set
	 */
	public void setIdmessage(int idmessage) {
		this.idmessage = idmessage;
	}

	/**
	 * @return the idGroup
	 */
	public int getIdGroup() {
		return idGroup;
	}

	/**
	 * @param idGroup the idGroup to set
	 */
	public void setIdGroup(int idGroup) {
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

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * @return the type
	 */
	public MessageType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(MessageType type) {
		this.type = type;
	}


}
