package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author FR DESCOMBES
 *
 */
@Entity
@Table(name = "location")
public class Locations implements Serializable {

	// LOCAL VARIABLES
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "postal_code")
	private int postalCode;
	@Column(name = "name_location")
	private String nameLocation;

	// RELATIONSHIPS
	@OneToOne
	private GeographicalArea geographicalArea;

	@OneToMany
	private Set<Event> events;

	@OneToMany
	private Set<Person> persons;

	// CONSTRUCTOR
	public Locations() {
	}

	public Locations(int postalCode) {
		this.postalCode = postalCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return postalCode + " " + nameLocation;
	}
	
	// GETTERS & SETTERS
	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the nameLocation
	 */
	public String getNameLocation() {
		return nameLocation;
	}

	/**
	 * @param nameLocation the nameLocation to set
	 */
	public void setNameLocation(String nameLocation) {
		this.nameLocation = nameLocation;
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

	/**
	 * @return the events
	 */
	public Set<Event> getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
	 */
	public void setEvents(Set<Event> events) {
		this.events = events;
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
