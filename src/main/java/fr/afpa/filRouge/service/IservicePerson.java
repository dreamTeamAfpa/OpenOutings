package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Person;

/**
 * @author FR DESCOMBES
 *
 */
@Service
public interface IservicePerson {

	public Person findByPseudoUserAndPasswordUser(String username,String password);

	public List<Person> getAll();

	public Person getOne(int idUser);

	public void modifiedPerson(Person person);

	public void addPerson(Person person);

	public void delPerson(Person person);
}
