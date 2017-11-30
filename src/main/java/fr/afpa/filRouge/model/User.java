
package fr.afpa.filRouge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;

	/**
	 * @return the idUser
	 */
	public int getIdUser() {
		return idUser;
	}

	/**
	 * @param idUser
	 *            the idUser to set
	 */
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}

