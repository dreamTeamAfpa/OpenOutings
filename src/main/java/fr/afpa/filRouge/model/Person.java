package fr.afpa.filRouge.model;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.tools.DocumentationTool.Location;

@Entity
@Table(name = "Person")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

	private int idUser;
	private String pseudoUser;
	private String passwordUser;
	private String firstNameUser;
	private String lastNameUser;
	private Calendar dobUser;
	private char genderUser;
	private String emailUser;
	private int phoneUser;
	private String descriptionPerson;

	private Location location;
	//private Set<Interest> interests;

	// GETTERS & SETTERS

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIdUser() {
		return idUser;
	}

	@OneToOne(mappedBy = "Location")
	@JoinTable(name = "location", joinColumns = @JoinColumn(name = "postal_code"))
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	@ManyToMany //(mappedBy = "Interest")
//	@JoinTable(name = "interest", joinColumns = @JoinColumn(name = "name_interest"), inverseJoinColumns = @JoinColumn(name = "id_person"))
	public Set<Interest> interests; // getInterests() {
		//return interests;
	//}

	/**
	 * @param interests
	 *            the interests to set
	 */
	public void setInterests(Set<Interest> interests) {
		this.interests = interests;
	}

	/**
	 * @param idUser
	 *            the idUser to set
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
	 * @param pseudoUser
	 *            the pseudoUser to set
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
	 * @param passwordUser
	 *            the passwordUser to set
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
	 * @param firstNameUser
	 *            the firstNameUser to set
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
	 * @param lastNameUser
	 *            the lastNameUser to set
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
	 * @param dobUser
	 *            the dobUser to set
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
	 * @param genderUser
	 *            the genderUser to set
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
	 * @param emailUser
	 *            the emailUser to set
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
	 * @param phoneUser
	 *            the phoneUser to set
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
	 * @param descriptionPerson
	 *            the descriptionPerson to set
	 */
	public void setDescriptionPerson(String descriptionPerson) {
		this.descriptionPerson = descriptionPerson;
	}
}