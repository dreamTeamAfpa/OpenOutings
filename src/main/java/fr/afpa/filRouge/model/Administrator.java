package fr.afpa.filRouge.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="administrator")
public class Administrator extends Person{
	

	public Administrator(int idUser, String pseudoUser, String passwordUser, String firstNameUser, String lastNameUser,
			Calendar dobUser, char genderUser, String emailUser, int phoneUser) {
		super(idUser, pseudoUser, passwordUser, firstNameUser, lastNameUser, dobUser, genderUser, emailUser, phoneUser);
		// TODO Auto-generated constructor stub
	}

	public Administrator() {
		
	}

}
