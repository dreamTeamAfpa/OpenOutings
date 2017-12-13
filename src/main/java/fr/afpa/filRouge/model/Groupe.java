package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "groupe")
public class Groupe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_groupe")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGroup;
	@Column(name="name_Groupe")
	private String nameGroup;
	@Column(name="description_Groupe")
	private String descriptionGroup;
	@OneToOne(mappedBy="groupe")
	private Event event;
	@ManyToMany
	private Set<Person> usersGroupe;
	@ManyToMany
	@JoinTable(name="groupe_corresponds_in_interests", joinColumns={@JoinColumn(name="groupe_id_Groupe")},
    inverseJoinColumns={@JoinColumn(name="interest_name_interest")})
	public Set<Interest> interests = new HashSet<Interest>();
	@OneToOne
	@JoinColumn(name = "name_area")
	private GeographicalArea geographicalArea;
	
	//GETTERS & SETTERS
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
	 * @return the nameGroup
	 */
	public String getNameGroup() {
		return nameGroup;
	}
	/**
	 * @param nameGroup the nameGroup to set
	 */
	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}
	/**
	 * @return the descriptionGroup
	 */
	public String getDescriptionGroup() {
		return descriptionGroup;
	}
	/**
	 * @param descriptionGroup the descriptionGroup to set
	 */
	public void setDescriptionGroup(String descriptionGroup) {
		this.descriptionGroup = descriptionGroup;
	}
	/**
	 * @return the event
	 */
	public Event getEvent() {
		return event;
	}
	/**
	 * @param event the event to set
	 */
	public void setEvent(Event event) {
		this.event = event;
	}
	/**
	 * @return the usersGroupe
	 */
	public Set<Person> getUsersGroupe() {
		return usersGroupe;
	}
	/**
	 * @param usersGroupe the usersGroupe to set
	 */
	public void setUsersGroupe(Set<Person> usersGroupe) {
		this.usersGroupe = usersGroupe;
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
	/**
	 * @return the geographicalArea
	 */
	public GeographicalArea getGeographicalArea() {
		return geographicalArea;
	}
	/**
	 * @param geographicalArea the geographicalArea to set
	 */
	public void setGeographicalArea(GeographicalArea geographicalArea) {
		this.geographicalArea = geographicalArea;
	}
	
	

	

	
}
