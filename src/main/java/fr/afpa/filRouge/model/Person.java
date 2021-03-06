
package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "person")
public class Person implements Serializable {
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_person")
	private int idUser;
	@Column(name = "pseudo_person")
	private String pseudoUser;
	@Column(name = "password_person")
	private String passwordUser;
	@Column(name = "first_name_person")
	private String firstNameUser;
	@Column(name = "last_name_person")
	private String lastNameUser;
	@Column(name = "birth_date_person")
	private Calendar dobUser;
	@Column(name = "gender_person")
	private char genderUser;
	@Column(name = "e_mail_person")
	private String emailUser;
	@Column(name = "phone_person")
	private int phoneUser;
	@Column(name = "description_person")
	private String descriptionPerson;
	@ManyToMany
	@JoinTable(name="user_participate_in_groupe", joinColumns={@JoinColumn(name="person_id_person")},
    inverseJoinColumns={@JoinColumn(name="id_Groupe")})
	@MapKeyJoinColumn(name="role_person")
	private Map<Role,Groupe> groupeRoles;
	@ManyToOne
	@JoinColumn(name = "postal_code")
	private Locations location;
	@ManyToMany
	@JoinTable(name="person_have_interests", joinColumns={@JoinColumn(name="person_id_person")},
    inverseJoinColumns={@JoinColumn(name="name_interest")})
	private Set<Interest> interests;
	@OneToMany(mappedBy="idperson")
	private Set<Picture> pictures;
	
	@OneToMany
	private List<Message> messages;
	
	
	//CONSTRUCTEUR 
	public Person(){}
	
	public Person(String pseudoUser, String passwordUser, String emailUser) {
		this.pseudoUser = pseudoUser;
		this.passwordUser = passwordUser;
		this.emailUser = emailUser;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.idUser + " " + this.pseudoUser + " " + this.passwordUser;
	}
	// GETTERS & SETTERS
	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
	}

	/**
	 * @return the pictures
	 */
	public Set<Picture> getPictures() {
		return pictures;
	}

	/**
	 * @param pictures the pictures to set
	 */
	public void setPictures(Set<Picture> pictures) {
		this.pictures = pictures;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the pseudoUser
	 */
	public String getPseudoUser() {
		return pseudoUser;
	}

	/**
	 * @param pseudoUser the pseudoUser to set
	 */
	public void setPseudoUser(String pseudoUser) {
		this.pseudoUser = pseudoUser;
	}

	/**
	 * @return the passwordUser
	 */
	public String getPasswordUser() {
		return passwordUser;
	}

	/**
	 * @param passwordUser the passwordUser to set
	 */
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	/**
	 * @return the firstNameUser
	 */
	public String getFirstNameUser() {
		return firstNameUser;
	}

	/**
	 * @param firstNameUser the firstNameUser to set
	 */
	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	/**
	 * @return the lastNameUser
	 */
	public String getLastNameUser() {
		return lastNameUser;
	}

	/**
	 * @param lastNameUser the lastNameUser to set
	 */
	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}

	/**
	 * @return the dobUser
	 */
	public Calendar getDobUser() {
		return dobUser;
	}

	/**
	 * @param dobUser the dobUser to set
	 */
	public void setDobUser(Calendar dobUser) {
		this.dobUser = dobUser;
	}

	/**
	 * @return the genderUser
	 */
	public char getGenderUser() {
		return genderUser;
	}

	/**
	 * @param genderUser the genderUser to set
	 */
	public void setGenderUser(char genderUser) {
		this.genderUser = genderUser;
	}

	/**
	 * @return the emailUser
	 */
	public String getEmailUser() {
		return emailUser;
	}

	/**
	 * @param emailUser the emailUser to set
	 */
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	/**
	 * @return the phoneUser
	 */
	public int getPhoneUser() {
		return phoneUser;
	}

	/**
	 * @param phoneUser the phoneUser to set
	 */
	public void setPhoneUser(int phoneUser) {
		this.phoneUser = phoneUser;
	}

	/**
	 * @return the descriptionPerson
	 */
	public String getDescriptionPerson() {
		return descriptionPerson;
	}

	/**
	 * @param descriptionPerson the descriptionPerson to set
	 */
	public void setDescriptionPerson(String descriptionPerson) {
		this.descriptionPerson = descriptionPerson;
	}

	/**
	 * @return the groupeRoles
	 */
	public Map<Role, Groupe> getGroupeRoles() {
		return groupeRoles;
	}

	/**
	 * @param groupeRoles the groupeRoles to set
	 */
	public void setGroupeRoles(Map<Role, Groupe> groupeRoles) {
		this.groupeRoles = groupeRoles;
	}

	/**
	 * @return the location
	 */
	public Locations getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Locations location) {
		this.location = location;
	}

	/**
	 * @return the interests
	 */
	public Set<Interest> getInterests() {
		return interests;
	}

	/**
	 * @param interests the interests to set
	 */
	public void setInterests(Set<Interest> interests) {
		this.interests = interests;
	}

}