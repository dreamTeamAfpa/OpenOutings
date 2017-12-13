/**
 * 
 */
package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author L. CASTAGNEDOLI
 *
 */
@Entity
@Table(name = "event")
public class Event implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_event")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEvent;
	
	@Column(name="title_event")
	private String titleEvent;
	
	@Column(name="description_event")
	private String resumeEvent;
	
	@Column(name="details_event")
	private String detailsEvent;
	
	@Column(name="date_event")
	private Calendar dateEvent;
	@ManyToMany
	@JoinTable(name="user_participate_in_event", joinColumns={@JoinColumn(name="id_person")},
    inverseJoinColumns={@JoinColumn(name="event_id_event")})
	private Set<Role> eventRoles;
	@OneToOne
	private Theme theme;
	@OneToOne
	@JoinColumn(name = "postal_code")
	private Locations location;
	
	@Column(name="maxParticipants")
	private int maxParticipants;
	
	@Column(name="rate_event")
	private int rateEvent ;
	@OneToOne
	@JoinColumn(name="id_Groupe")
	private Groupe groupe;
	
	
	//GETTERS & SETTERS
	
	/**
	 * @return the idEvent
	 */
	public int getIdEvent() {
		return idEvent;
	}
	/**
	 * @return the adminEvent
	 */
	/**
	 * @return the groupe
	 */
	public Groupe getGroupe() {
		return groupe;
	}
	/**
	 * @param groupe the groupe to set
	 */
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	/**
	 * @param idEvent the idEvent to set
	 */
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	/**
	 * @return the titleEvent
	 */
	public String getTitleEvent() {
		return titleEvent;
	}
	/**
	 * @param titleEvent the titleEvent to set
	 */
	public void setTitleEvent(String titleEvent) {
		this.titleEvent = titleEvent;
	}
	/**
	 * @return the resumeEvent
	 */
	public String getResumeEvent() {
		return resumeEvent;
	}
	/**
	 * @param resumeEvent the resumeEvent to set
	 */
	public void setResumeEvent(String resumeEvent) {
		this.resumeEvent = resumeEvent;
	}
	/**
	 * @return the detailsEvent
	 */
	public String getDetailsEvent() {
		return detailsEvent;
	}
	/**
	 * @param detailsEvent the detailsEvent to set
	 */
	public void setDetailsEvent(String detailsEvent) {
		this.detailsEvent = detailsEvent;
	}
	/**
	 * @return the dateEvent
	 */
	public Calendar getDateEvent() {
		return dateEvent;
	}
	/**
	 * @param dateEvent the dateEvent to set
	 */
	public void setDateEvent(Calendar dateEvent) {
		this.dateEvent = dateEvent;
	}
	/**
	 * @return the person
	 */
//	public Person getPerson() {
//		return adminEvent;
//	}
//	/**
//	 * @param person the person to set
//	 */
//	public void setPerson(Person person) {
//		this.adminEvent = person;
//	}
	/**
	 * @return the theme
	 */
	public Theme getTheme() {
		return theme;
	}
	/**
	 * @param theme the theme to set
	 */
	public void setTheme(Theme theme) {
		this.theme = theme;
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
	 * @return the maxParticipants
	 */
	public int getMaxParticipants() {
		return maxParticipants;
	}
	/**
	 * @param maxParticipants the maxParticipants to set
	 */
	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}
	/**
	 * @return the rateEvent
	 */
	public int getRateEvent() {
		return rateEvent;
	}
	/**
	 * @param rateEvent the rateEvent to set
	 */
	public void setRateEvent(int rateEvent) {
		this.rateEvent = rateEvent;
	}
	public Set<Role> getEventRoles() {
		return eventRoles;
	}
	public void setEventRoles(Set<Role> eventRoles) {
		this.eventRoles = eventRoles;
	}

	
}
