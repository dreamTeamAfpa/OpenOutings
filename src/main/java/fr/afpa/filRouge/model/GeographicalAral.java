/**
 * 
 */
package fr.afpa.filRouge.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author PH GUIGUE
 *
 */
@Entity
@Table(name = "geographicalArea")
public class GeographicalAral {

	private String nameArea;
	private String descriptionArea;
	private Set<Location> locations;
	private Set<Groupe> groupes;
	
	@Id
	public String getNameArea() {
		return nameArea;
	}
	public void setNameArea(String nameArea) {
		this.nameArea = nameArea;
	}
	public String getDescriptionArea() {
		return descriptionArea;
	}
	public void setDescriptionArea(String descriptionArea) {
		this.descriptionArea = descriptionArea;
	}
	@ManyToMany
	@JoinTable(name = "location", joinColumns = @JoinColumn(name = "name_area"), inverseJoinColumns = @JoinColumn(name = "postal_code"))
	public Set<Location> getLocations() {
		return locations;
	}
	public void setLocations(Set<Location> locations) {
		this.locations = locations;
	}
	
	@ManyToMany
	@JoinTable(name = "groupe", joinColumns = @JoinColumn(name = "name_area"), inverseJoinColumns = @JoinColumn(name = "id_group"))
	public Set<Groupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(Set<Groupe> groupes) {
		this.groupes = groupes;
	}
	
	
	
}
