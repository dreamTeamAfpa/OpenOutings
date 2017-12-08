package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author PH GUIGUE
 *
 */

@Entity
@Table(name = "interest")
public class Interest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="name_interest")
	private String nameInterest;
	@Column(name="description_interest")
	private String descriptionInterest;
	@ManyToMany
	private Set<Groupe> groupes;
	@ManyToMany(mappedBy = "interests")
	private Set<Person> persons;
	
	//GETTERS & SETTERS	
	/**
	 * @return the nameInterest
	 */
	public String getNameInterest() {
		return nameInterest;
	}
	/**
	 * @param nameInterest the nameInterest to set
	 */
	public void setNameInterest(String nameInterest) {
		this.nameInterest = nameInterest;
	}
	/**
	 * @return the descriptionInterest
	 */
	public String getDescriptionInterest() {
		return descriptionInterest;
	}
	/**
	 * @param descriptionInterest the descriptionInterest to set
	 */
	public void setDescriptionInterest(String descriptionInterest) {
		this.descriptionInterest = descriptionInterest;
	}
	/**
	 * @return the groupes
	 */
	public Set<Groupe> getGroupes() {
		return groupes;
	}
	/**
	 * @param groupes the groupes to set
	 */
	public void setGroupes(Set<Groupe> groupes) {
		this.groupes = groupes;
	}
	/**
	 * @return the persons
	 */
	public Set<Person> getPersons() {
		return persons;
	}
	/**
	 * @param persons the persons to set
	 */
	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
	
	
	
}
