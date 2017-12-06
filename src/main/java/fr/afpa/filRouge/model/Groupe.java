package fr.afpa.filRouge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Groupe")
public class Groupe {
	private int idGroup;
	private String nameGroup;
	private String descriptionGroup;
	private Boolean permanent;
	private Administrator administrator;
	private Set<Event> events;
	private Set<User> users;

	public Groupe(int idGroup, String nameGroup, String descriptionGroup, Boolean permanent) {
		// TODO Auto-generated constructor stub
		this.idGroup = idGroup;
		this.nameGroup = nameGroup;
		this.descriptionGroup = descriptionGroup;
		this.permanent = permanent;
		
	}

	public Groupe() {
	}

	@Override
	public String toString() {
		return "Groupe [idGroup=" + idGroup + ", nameGroup=" + nameGroup + ", descriptionGroup=" + descriptionGroup
				+ ", permanent=" + permanent + ", administrator=" + administrator + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public Boolean getPermanent() {
		return permanent;
	}

	public void setPermanent(Boolean permanent) {
		this.permanent = permanent;
	}

	public String getDescriptionGroup() {
		return descriptionGroup;
	}

	public void setDescriptionGroup(String descriptionGroup) {
		this.descriptionGroup = descriptionGroup;
	}

	@OneToOne(mappedBy = "Administrator")
	@JoinTable(name = "administrator", joinColumns = @JoinColumn(name = "id_Group"), inverseJoinColumns = @JoinColumn(name = "id_person"))
	public Administrator getAdministratorByGroup(int idGroup) {
		return administrator;
	}

	public void setAdministratorByGroup(Administrator administrator) {
		this.administrator = administrator;
	}

	@OneToMany(mappedBy = "Event")
	@JoinTable(name = "event", joinColumns = @JoinColumn(name = "id_Groupe"), inverseJoinColumns = @JoinColumn(name = "id_event"))
	public Set<Event> getEventByGroup() {
		return events;
	}

	public void setEventByGroup(Set<Event> events) {
		this.events = events;
	}

	@ManyToMany(mappedBy = "User")
	@JoinTable(name = "participate", joinColumns = @JoinColumn(name = "id_Group"), inverseJoinColumns = @JoinColumn(name = "user_id_person"))
	public Set<User> getAllUserByGroup() {
		return users;
	}

	public void setUserByGroup(Set<User> users) {
		this.users = users;
	}

	@ManyToMany
	public Set<Interest> interests = new HashSet<Interest>();

	@ManyToOne
	private GeographicalArea geographicalArea;

	@Override
	public boolean equals(Object obj) {

		Groupe groupe = (Groupe) obj;

		return this.idGroup == groupe.getIdGroup();
	}

}
