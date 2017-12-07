package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author FR DESCOMBES
 *
 */
@Entity
@Table(name = "theme")
public class Theme implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nameTheme;
	private Set<Interest> interests;

	@Id
	public String getNameTheme() {
		return nameTheme;
	}

	public void setNameTheme(String nameTheme) {
		this.nameTheme = nameTheme;
	}

	@ManyToMany
	@JoinTable(name = "interest", joinColumns = @JoinColumn(name = "name_theme"), inverseJoinColumns = @JoinColumn(name = "name_theme"))
	public Set<Interest> getInterests() {
		return interests;
	}

	public void setInterests(Set<Interest> interests) {
		this.interests = interests;
	}

}
