/**
 * 
 */
package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author PH GUIGUE
 *
 */
@Entity
@Table(name = "geographical_area")
public class GeographicalArea implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "name_area")
	private String nameArea;
	@Column(name = "description_area")
	private String descriptionArea;
	@OneToMany
	private Set<Locations> locations;

	@OneToMany
	private Set<Groupe> groupes;
	
	//GETTERS & SETTERS
	/**
	 * @return the nameArea
	 */
	public String getNameArea() {
		return nameArea;
	}

	/**
	 * @param nameArea the nameArea to set
	 */
	public void setNameArea(String nameArea) {
		this.nameArea = nameArea;
	}

	/**
	 * @return the descriptionArea
	 */
	public String getDescriptionArea() {
		return descriptionArea;
	}

	/**
	 * @param descriptionArea the descriptionArea to set
	 */
	public void setDescriptionArea(String descriptionArea) {
		this.descriptionArea = descriptionArea;
	}

	/**
	 * @return the locations
	 */
	public Set<Locations> getLocations() {
		return locations;
	}

	/**
	 * @param locations the locations to set
	 */
	public void setLocations(Set<Locations> locations) {
		this.locations = locations;
	}

	/**
	 * @return the groupes
	 */
	public Set<Groupe> getGroupes() {
		return groupes;
	}

	/**
	 * @param groupes the groupes to set
	 */
	public void setGroupes(Set<Groupe> groupes) {
		this.groupes = groupes;
	}

	
	

}
