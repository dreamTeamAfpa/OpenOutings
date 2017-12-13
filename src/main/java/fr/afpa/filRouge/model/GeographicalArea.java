/**
 * 
 */
package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@OneToMany(mappedBy = "geographical_area", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Locations> locations;

	@OneToMany(mappedBy = "geographical_area", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Groupe> groupes;

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
	public Set<Locations> getLocations() {
		return locations;
	}

	public void setLocations(Set<Locations> locations) {
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
