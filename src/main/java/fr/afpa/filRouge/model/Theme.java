package fr.afpa.filRouge.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Theme")
public class Theme {

	private Set<Interest> interests;

	/**
	 * @return the interests
	 */
	public Set<Interest> getInterests() {
		return interests;
	}

	/**
	 * @param interests
	 *            the interests to set
	 */
	public void setInterests(Set<Interest> interests) {
		this.interests = interests;
	}

}
