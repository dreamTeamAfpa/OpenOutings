package fr.apfa.filrouge.model;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.tools.DocumentationTool.Location;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	@Column(name = "email_person")
	private String emailUser;
	@Column(name = "phone_person")
	private int phoneUser;
	@ManyToOne
	@JoinTable(name = "locations", joinColumns = @JoinColumn(name = "id_person"), inverseJoinColumns = @JoinColumn(name = "postal_code"))
	private Set<Location> location;

	// CONSTRUCTOR USING ALL FIELDS
	public Person(int idUser, String pseudoUser, String passwordUser, String firstNameUser, String lastNameUser,
			Calendar dobUser, char genderUser, String emailUser, int phoneUser) {
		this.idUser = idUser;
		this.pseudoUser = pseudoUser;
		this.firstNameUser = firstNameUser;
		this.lastNameUser = lastNameUser;
		this.dobUser = dobUser;
		this.genderUser = genderUser;
		this.emailUser = emailUser;
		this.phoneUser = phoneUser;
	}

	// GETTERS & SETTERS
	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
	}

	/**
	 * @return the location
	 */
	public Set<Location> getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(Set<Location> location) {
		this.location = location;
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
}