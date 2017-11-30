/**
 * 
 */
package fr.afpa.filRouge.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 34011-79-08
 *
 */
@Entity 
@Table
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEvent;
	private String titleEvent;
	private String resumeEvent;
	private String detailsEvent;
	/*
	private Administrator creator;
	private Theme theme;
	private Location location;
	private Group group;
	*/
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
		this.idEvent = idEvent;
		this.titleEvent = titleEvent;
		this.resumeEvent = resumeEvent;
		this.detailsEvent = detailsEvent;
		this.maxParticipants = maxParticipants;
		this.rateEvent = rateEvent;
		this.dateEvent = dateEvent;
	}
	
	/**
	 * @param titleEvent
	 * @param resumeEvent
	 * @param rateEvent
	 * @param dateEvent
	 */
	public Event(String titleEvent, String resumeEvent,
			int rateEvent, Calendar dateEvent) {
		this.titleEvent = titleEvent;
		this.resumeEvent = resumeEvent;
		this.rateEvent = rateEvent;
		this.dateEvent = dateEvent;
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