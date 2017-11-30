package fr.afpa.filRouge.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;

import fr.apfa.filrouge.model.Person;

@Entity
@Table(name = "user")
public class User extends Person {

	public User(int idUser, String pseudoUser, String passwordUser, String firstNameUser, String lastNameUser,
			Calendar dobUser, char genderUser, String emailUser, int phoneUser) {
		super(idUser, pseudoUser, passwordUser, firstNameUser, lastNameUser, dobUser, genderUser, emailUser, phoneUser);
	}

}
