/**
 * 
 */
package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author L. CASTAGNEDOLI
 *
 */
@Entity 
@Table(name="event")
public class Event implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_event")
	private int idEvent;
	@Column(name="title_event")
	private String titleEvent;
	@Column(name="description_event")
	private String resumeEvent;
	@Column(name="details_event")
	private String detailsEvent;
	@Column(name="date_event")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dateEvent;
	@OneToOne(mappedBy="administrator")
	private Administrator administrator;
	@ManyToOne
	private Groupe groupe;
	
	private Theme theme;
	@OneToOne(mappedBy="location")
	private Locations location;
	//private Groupe groupe; //voir methode ManyToOne GeetGroup() , a tester
	@Column(name="maxParticipants")
	private int maxParticipants;
	@Column(name="rate_event")
	private int rateEvent;
	
	
	
	public Event() {
	}
	
	/**
	 * @param idEvent
	 * @param titleEvent
	 * @param resumeEvent
	 * @param detailsEvent
	 * @param maxParticipants
	 * @param rateEvent
	 * @param dateEvent
	 */
	public Event(int idEvent, String titleEvent, String resumeEvent, String detailsEvent, int maxParticipants,
			int rateEvent, Calendar dateEvent) {
		setIdEvent(idEvent);
		setTitleEvent(titleEvent);
		setResumeEvent(resumeEvent);
		setDetailsEvent(detailsEvent);
		setMaxParticipants(maxParticipants);
		setRateEvent(rateEvent);
		setDateEvent(dateEvent);
	}
	
	/**
	 * @param titleEvent
	 * @param resumeEvent
	 * @param rateEvent
	 * @param dateEvent
	 */
	public Event(String titleEvent, String resumeEvent, Administrator administrator,
			int rateEvent, Calendar dateEvent) {
		setTitleEvent(titleEvent);
		setResumeEvent(resumeEvent);
		setAdministrator(administrator);
		setRateEvent(rateEvent);
		setDateEvent(dateEvent);
	}
	
	
	public int getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	public String getTitleEvent() {
		return titleEvent;
	}
	public void setTitleEvent(String titleEvent) {
		this.titleEvent = titleEvent;
	}
	public String getResumeEvent() {
		return resumeEvent;
	}
	public void setResumeEvent(String resumeEvent) {
		this.resumeEvent = resumeEvent;
	}
	public String getDetailsEvent() {
		return detailsEvent;
	}
	public void setDetailsEvent(String detailsEvent) {
		this.detailsEvent = detailsEvent;
	}
	
@OneToMany(mappedBy = "Administrator")
@JoinTable(name = "administrator", joinColumns = @JoinColumn(name = "id_person"), inverseJoinColumns = @JoinColumn(name = "id_event"))
	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator creator) {
		this.administrator = creator;
	}

@OneToMany(mappedBy = "Theme")
@JoinTable(name = "theme", joinColumns = @JoinColumn(name = "name_theme"), inverseJoinColumns = @JoinColumn(name="id_event"))
	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

@OneToMany(mappedBy = "Location")
@JoinTable(name = "location", joinColumns = @JoinColumn(name = "id_location"), inverseJoinColumns = @JoinColumn(name="id_event"))
	public Locations getLocation() {
		return location;
	}

	public void setLocation(Locations location) {
		this.location = location;
	}
	
	// a Tester les methodes  ManyToOne mirroir dans 2 classes
	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public Calendar getDateEvent() {
		return dateEvent;
	}
	public void setDateEvent(Calendar dateEvent) {
		this.dateEvent = dateEvent;
	}
	public int getMaxParticipants() {
		return maxParticipants;
	}
	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}
	public int getRateEvent() {
		return rateEvent;
	}
	public void setRateEvent(int rateEvent) {
		this.rateEvent = rateEvent;
	}
	
	

}
