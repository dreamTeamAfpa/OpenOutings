/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.repository.PersonRepository;

/**
 * @author FR DESCOMBES
 *
 */
@Service
public class ServicePerson implements IservicePerson {

	private Person person;
	
	@Autowired
	private PersonRepository personRepository;

	public ServicePerson(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public Person findByPseudoUserAndPasswordUser(String username,String password) {
		person = personRepository.findByPseudoUserAndPasswordUser(username,password);
		return person;
	}
	@Override
	public List<Person> getAll() {
		return (List<Person>) personRepository.findAll();
	}

	@Override
	public Person getOne(int idUser) {
		return personRepository.findOneByIdUser(idUser);
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



}
