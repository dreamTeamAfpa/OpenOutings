package fr.afpa.filRouge.model;

import java.util.Set;

import javax.persistence.Entity;
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
	
	@OneToMany(mappedBy="administrator")
	private Set<Groupe> groupes;

	/**
	 * @return the groupes
	 */
	public Set<Groupe> getGroupes() {
		return groupes;
	}

	/**
	 * @param groupes
	 *            the groupes to set
	 */
	public void setGroupes(Set<Groupe> groupes) {
		this.groupes = groupes;
	}

}
