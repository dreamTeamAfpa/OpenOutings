
package fr.afpa.filRouge.service;

import java.util.List;
import org.springframework.stereotype.Component;
import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.model.Person;

/**
 *
 */
@Component
public interface IservicePerson {

	public Person findByPseudoUserAndPasswordUser(String username,String password);

	public List<Person> getAll();

	public Person getOne(int idUser);

	public void modifiedPerson(Person person);

	public void addPerson(Person person);

	public void delPerson(Person person);

	public Person findByPseudoUser(String username);

	public Person findByEmailUser(String email);
	
	public List<Person> findPersonbyNameGroup(Groupe groupe);

	public List<Person> findPersonByGroupe(Groupe groupe);

}

