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
	@OneToOne(fetch = FetchType.EAGER)
	private GeographicalArea geographicalArea;

	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Event> events;

	@OneToMany(mappedBy = "location", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
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
	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getNameLocation() {
		return nameLocation;
	}

	public void setNameLocation(String nameLocation) {
		this.nameLocation = nameLocation;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}

	public GeographicalArea getGeographicalArea() {
		return geographicalArea;
	}

	public void setGeographicalArea(GeographicalArea geographicalArea) {
		this.geographicalArea = geographicalArea;
	}

}
