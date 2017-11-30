/**
 * 
 */
package fr.afpa.filRouge.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author 34011-79-08
 *
 */
@Entity 
@Table(name="event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEvent;
	private String titleEvent;
	private String resumeEvent;
	private String detailsEvent;
	private Administrator administrator;
	private Theme theme;
	private Location location;
	//private Groupe groupe; //voir methode ManyToOne GeetGroup() , a tester
	private int maxParticipants;
	private int rateEvent;
	
	
	
	
	
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
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	@ManyToOne
	private Groupe groupe;
	// a Tester les methodes  ManyToOne mirroir dans 2 classes
	//public Groupe getGroupe() {
		//return groupe;
	//}

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
	private Calendar dateEvent;
	

}
/*
`id_event` INT(11) NOT NULL AUTO_INCREMENT,
  `title_event` VARCHAR(50) NULL DEFAULT NULL,
  `description_event` VARCHAR(240) NULL DEFAULT NULL,
  `details_event` VARCHAR(240) NULL DEFAULT NULL,
  `date_event` DATE NULL DEFAULT NULL,
  `rate_event` DECIMAL(15,3) NULL DEFAULT NULL,
  `maxParticipants` INT(11) NOT NULL,
  `postal_code` INT(11) NOT NULL,
  `id_Groupe` INT(11) NOT NULL,
  `administrator_id_person` INT(11) NOT NULL,
*/