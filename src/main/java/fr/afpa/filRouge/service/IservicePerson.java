package fr.afpa.filRouge.service;

import java.util.List;

import fr.afpa.filRouge.model.Person;

/**
 * @author FR DESCOMBES
 *
 */
public interface IservicePerson {

	public List<Person> getAll();

	public Person getOne(int idUser);

	public void modifiedPerson(Person person);

	public void addPerson(Person person);

	public void delPerson(Person person);
}
