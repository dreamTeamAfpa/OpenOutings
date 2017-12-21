package fr.afpa.filRouge.model;


import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_role")
	private Integer id;
	@Column(name="role")
	private String role;
	@ManyToMany
	@JoinTable(name="user_participate_in_groupe",joinColumns={@JoinColumn(name="role_person")},
	inverseJoinColumns={@JoinColumn(name="id_Groupe")})
	@MapKeyJoinColumn(name="person_id_person")
	private Map<Person,Groupe> roleperson;
	
	
	//GETTERS & SETTERS
	/**
	 * @return the roleperson
	 */
	public Map<Person, Groupe> getRoleperson() {
		return roleperson;
	}

	
	/**
	 * @param roleperson the roleperson to set
	 */
	public void setRoleperson(Map<Person, Groupe> roleperson) {
		this.roleperson = roleperson;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", roleperson=" + roleperson + "]";
	}


	
	
}
