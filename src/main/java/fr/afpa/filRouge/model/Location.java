package fr.afpa.filRouge.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location {

	private String postalCode;
	private String nameLocation;

	private Set<Event> events;
	private Set<Person> persons;
	private GeographicalArea geographicalArea;

	@Id
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getNameLocation() {
		return nameLocation;
	}

	public void setNameLocation(String nameLocation) {
		this.nameLocation = nameLocation;
	}

	@ManyToMany
	@JoinTable(name = "event", joinColumns = @JoinColumn(name = "postal_code"), inverseJoinColumns = @JoinColumn(name = "id_event"))
	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}

	@ManyToMany
	@JoinTable(name = "person", joinColumns = @JoinColumn(name = "postal_code"), inverseJoinColumns = @JoinColumn(name = "id_person"))
	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}

	@OneToOne
	@JoinTable(name = "geographical_area", joinColumns = @JoinColumn(name = "postal_code"), inverseJoinColumns = @JoinColumn(name = "name_area"))
	public GeographicalArea getGeographicalArea() {
		return geographicalArea;
	}

	public void setGeographicalArea(GeographicalArea geographicalArea) {
		this.geographicalArea = geographicalArea;
	}

}
