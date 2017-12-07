package fr.afpa.filRouge.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "administrator")
public class Administrator extends Person {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy="administrator")
	private List<Groupe> groupes;

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
