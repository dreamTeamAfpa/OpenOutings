package fr.afpa.filRouge.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
public class Location {
	@Column(name = "postal_code")
	private String postalCode;
	@Column(name = "name_location")
	private String nameLocation;
	@OneToMany(mappedBy = "location")
	private Set<Location> location;

	// CONSTRUCTOR USING ALL FIELDS
	public Location(String postalCode, String nameLocation, Set<Location> location) {
		super();
		this.postalCode = postalCode;
		this.nameLocation = nameLocation;
		this.location = location;
	}

	// GETTERS & SETTERS
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the nameLocation
	 */
	public String getNameLocation() {
		return nameLocation;
	}

	/**
	 * @param nameLocation
	 *            the nameLocation to set
	 */
	public void setNameLocation(String nameLocation) {
		this.nameLocation = nameLocation;

	}

	/**
	 * @return the location
	 */
	public Set<Location> getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(Set<Location> location) {
		this.location = location;
	}

}
