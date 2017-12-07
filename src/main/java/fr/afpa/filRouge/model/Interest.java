package fr.afpa.filRouge.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author PH GUIGUE
 *
 **         Cette classe est un bean: . attributs privés . contructeur sans
 *         argument . getters/setters pour tous les attributs (sous la forme
 *         get... et set...)
 */

@Entity
@Table(name = "interest")
public class Interest {
	@Column(name = "name_interest")
	private String nameInterest;
	@Column(name = "description_interest")
	private String descriptionInterest;
	
	
	//private Set<Groupe> groupes;


	public Interest(String name) {
		this.nameInterest= name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Interest [nameInterest=" + nameInterest + ", descriptionInterest=" + descriptionInterest + "]";
	}

	@Id
	public String getNameInterest() {
		return nameInterest;
	}

	public void setNameInterest(String nameInterest) {
		this.nameInterest = nameInterest;
	}

	public String getDescriptionInterest() {
		return descriptionInterest;
	}

	public void setDescriptionInterest(String descriptionInterest) {
		this.descriptionInterest = descriptionInterest;
	}

	@ManyToMany(mappedBy = "interest")
//	@JoinTable(name ="person", joinColumns = @JoinColumn(name ="id_person"), inverseJoinColumns = @JoinColumn(name="name_interest"))
	private Set<Person> persons;
//	@ManyToMany
//	@JoinTable(name = "groupe", joinColumns = @JoinColumn(name = "name_interest"), inverseJoinColumns = @JoinColumn(name = "id_group"))
//	public Set<Groupe> getGroups() {
//		return groupes;
//	}
//
//	public void setGroups(Set<Groupe> groups) {
//		this.groupes = groups;
//	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
//	@Override
//	public boolean equals(Object obj) {
//
//		if (obj == null)
//			return false;
//
//		Interest i = (Interest) obj;
//
//		boolean sameNameInterest = this.nameInterest == i.getNameInterest();
//		boolean sameDescriptionInterest;
//
//		if (this.descriptionInterest == null && i.getDescriptionInterest() != null)
//			return false;
//		if (this.descriptionInterest != null && i.getDescriptionInterest() == null)
//			return false;
//		if (this.descriptionInterest == null && i.getDescriptionInterest() == null)
//			sameDescriptionInterest = true;
//		else
//			sameDescriptionInterest = this.descriptionInterest.equals(i.getDescriptionInterest());
//		return sameDescriptionInterest && sameNameInterest;
//	}

	}


