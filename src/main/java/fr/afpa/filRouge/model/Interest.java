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
@Table (name="interest")
public class Interest {

	private String nameInterest ;
	private String descriptionInterest;
	private Set<Groups> groups;
	
	
	@Id
	public String getNameInterest() {
		return nameInterest;
	}
	public void setNameInterest(String nameInterest) {
		this.nameInterest = nameInterest;
	}
	public String getDescriptionInterest() {
		return descriptionInterest;
	}
	public void setDescriptionInterest(String descriptionInterest) {
		this.descriptionInterest = descriptionInterest;
	}
	
	@ManyToMany
	@JoinTable(name="groups", joinColumns = @JoinColumn(name = "name_interest"),inverseJoinColumns = @JoinColumn(name = "id_group"))
	public Set<Groups> getGroups(){
		return groups;
	}
	public void setGroups(Set<Groups> groups) {
        this.groups = groups;
}
