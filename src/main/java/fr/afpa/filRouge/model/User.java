package fr.afpa.filRouge.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends Person {

@ManyToMany
private Set<Groupe> groupes;

/**
 * @return the groupes
 */
public Set<Groupe> getGroupes() {
	return groupes;
}

/**
 * @param groupes the groupes to set
 */
public void setGroupes(Set<Groupe> groupes) {
	this.groupes = groupes;
}


}