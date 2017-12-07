package fr.afpa.filRouge.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
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
@Table(name = "groupe")
public class Groupe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_group")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idGroup;
	@Column(name="name_Groupe")
	private String nameGroup;
	@Column(name="description_Groupe")
	private String descriptionGroup;
	
	private Boolean permanent;
	@ManyToOne
	private Administrator administrator;
	@OneToOne
	private Event event;
	private Set<Event> events;
	@OneToMany
	private Set<User> users;
	@ManyToMany
	public Set<Interest> interests = new HashSet<Interest>();
	@ManyToOne
	private GeographicalArea geographicalArea;

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

	public Administrator getAdministratorByGroup(int idGroup) {
		return administrator;
	}
	public void setAdministratorByGroup(Administrator administrator) {
		this.administrator = administrator;
	}
		public Set<Event> getEventByGroup(){
		return events;
	}
	public void setEventByGroup( Set<Event> events) {
		this.events = events;
	}

	public Set<User> getAllUserByGroup(){
		return users;
	}
	public void setUserByGroup(Set<User> users) {
		this.users= users;
	}
}
