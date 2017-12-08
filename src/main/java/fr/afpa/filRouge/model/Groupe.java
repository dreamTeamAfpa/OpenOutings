package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Column(name="id_group")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGroup;
	@Column(name="name_Groupe")
	private String nameGroup;
	@Column(name="description_Groupe")
	private String descriptionGroup;
	@Column(name="permanent")
	private Boolean permanent;
	@ManyToOne
	private Person adminGroupe;
	@OneToOne
	private Event event;	
	@OneToMany
	private Set<Person> usersGroupe;
	@ManyToMany
	public Set<Interest> interests = new HashSet<Interest>();
	@OneToOne
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
	 * @return the permanent
	 */
	public Boolean getPermanent() {
		return permanent;
	}
	/**
	 * @param permanent the permanent to set
	 */
	public void setPermanent(Boolean permanent) {
		this.permanent = permanent;
	}
	/**
	 * @return the adminGroupe
	 */
	public Person getAdminGroupe() {
		return adminGroupe;
	}
	/**
	 * @param adminGroupe the adminGroupe to set
	 */
	public void setAdminGroupe(Person adminGroupe) {
		this.adminGroupe = adminGroupe;
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
