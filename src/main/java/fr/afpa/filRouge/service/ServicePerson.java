/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.repository.PersonRepository;

@Service
public class ServicePerson implements IservicePerson {

	private Person person;

	@Autowired
	private HttpSession httpSession;
	@Autowired
	private PersonRepository personRepository;

	public ServicePerson(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public Person findByPseudoUserAndPasswordUser(String username, String password) {
		person = personRepository.findByPseudoUserAndPasswordUser(username, password);
		return person;
	}

	@Override
	public List<Person> getAll() {
		return (List<Person>) personRepository.findAll();
	}

	@Override
	public Person getOne(int idUser) {
		return personRepository.findOne(idUser);
	}

	@Override
	public void modifiedPerson(Person person) {
		personRepository.save(person);

	}

	@Override
	public void addPerson(Person person) {
		personRepository.save(person);
	}

	@Override
	public void delPerson(Person person) {
		personRepository.delete(person);

	}

	@Override
	public Person findByPseudoUser(String username) {
		return personRepository.findByPseudoUser(username);
	}

	/**
	 * @return the httpSession
	 */
	public HttpSession getHttpSession() {
		return httpSession;
	}

	/**
	 * @param httpSession the httpSession to set
	 */
	public void setHttpSession(HttpSession httpSession) {
		this.httpSession = httpSession;
	}

	@Override
	public Person findByEmailUser(String email) {
		return personRepository.findByEmailUser(email);
	}

}
