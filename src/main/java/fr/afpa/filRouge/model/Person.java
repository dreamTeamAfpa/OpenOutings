package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@MappedSuperclass
@Table(name = "person")
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_person")
	private int idUser;
	@Column(name = "pseudo_person")
	private String pseudoUser;
	@Column(name = "password_person")
	private String passwordUser;
	@Column(name = "firstName_person")
	private String firstNameUser;
	@Column(name = "lastName_person")
	private String lastNameUser;
	@Column(name = "birthDate_person")
	private Calendar dobUser;
	@Column(name = "gender_person")
	private char genderUser;
	@Column(name = "eMail_person")
	private String emailUser;
	@Column(name = "phone_person")
	private int phoneUser;
	@Column(name = "description_person")
	private String descriptionPerson;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name="user_roles",
	joinColumns={@JoinColumn(name="user_id", referencedColumnName="id")},
	inverseJoinColumns={@JoinColumn(name="role_id", referencedColumnName="id")})
	private Role role;
	@OneToMany(mappedBy="persons")
	@JoinColumn(name="postal_code")
	private Locations location;
	@ManyToMany
	@JoinTable(name="person_have_interests", joinColumns={@JoinColumn(name="person_id_person")},
    inverseJoinColumns={@JoinColumn(name="name_interest")})
	private Set<Interest> interests;

	// GETTERS & SETTERS
	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
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