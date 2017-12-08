package fr.afpa.filRouge.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "administrator")
public class Administrator extends Person {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@OneToOne(mappedBy="person")
	private Person person;
	
	@OneToMany(mappedBy="administrator")
	private List<Groupe> groupes;
	
	@ManyToMany(mappedBy="persons")
	@JoinTable(name = "person_have_interests", joinColumns = @JoinColumn(name = "name_interest"), inverseJoinColumns = @JoinColumn(name = "person_id_person"))
	private Set<Interest> interests;

	/**
	 * @return the groupes
	 */
	public List<Groupe> getGroupes() {
		return groupes;
	}

	/**
	 * @param groupes
	 *            the groupes to set
	 */
	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

}
