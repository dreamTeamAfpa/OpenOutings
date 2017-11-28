package fr.afpa.filRouge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Groups")
public class Groups {
	int idGroup;
	String nameGroup;
	String descriptionGroup;

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

	public String getDescriptionGroup() {
		return descriptionGroup;
	}

	public void setDescriptionGroup(String descriptionGroup) {
		this.descriptionGroup = descriptionGroup;
	}

	@OneToOne(mappedBy = "Administrator")
	@JoinTable(name = "User", joinColumns = @JoinColumn(name = "id_person"))
	public Set<Administrator> getAdministrator() {
		return administator;
	}
}
