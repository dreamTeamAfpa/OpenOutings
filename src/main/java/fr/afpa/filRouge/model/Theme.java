package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
	@Id
	@Column(name="name_theme")
	private String nameTheme;
	@OneToMany
	private Set<Interest> interests;

	
	public String getNameTheme() {
		return nameTheme;
	}

	public void setNameTheme(String nameTheme) {
		this.nameTheme = nameTheme;
	}

	
	public Set<Interest> getInterests() {
		return interests;
	}

	public void setInterests(Set<Interest> interests) {
		this.interests = interests;
	}

}
