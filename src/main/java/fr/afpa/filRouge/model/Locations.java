package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Locations implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "postal_code")
	private int postalCode;
	@Column(name = "name_location")
	private String nameLocation;
	@OneToOne
	private GeographicalArea geographicalArea;
	@OneToMany(mappedBy="location")
	private Set<Event> events;
	@OneToMany(mappedBy="location")
	private Set<Person> persons;


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
