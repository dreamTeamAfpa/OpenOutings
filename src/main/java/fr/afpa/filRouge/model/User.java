
package fr.afpa.filRouge.model;

import java.util.Calendar;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends Person {

	private Set<Groupe> group;

	public User(int idUser, String pseudoUser, String passwordUser, String firstNameUser, String lastNameUser,
			Calendar dobUser, char genderUser, String emailUser, int phoneUser) {
		super(idUser, pseudoUser, passwordUser, firstNameUser, lastNameUser, dobUser, genderUser, emailUser, phoneUser);
	}

	@ManyToMany
	@JoinTable(name = "group", joinColumns = @JoinColumn(name = "id_person"), inverseJoinColumns = @JoinColumn(name = "id_group))"))
	public Set<Groupe> getGroup() {
		return group;
	}

	public void setGroup(Set<Groupe> group) {
		this.group = group;
	}

}
