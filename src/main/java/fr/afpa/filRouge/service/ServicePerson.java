/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.repository.IPersonRepository;

/**
 * @author FR DESCOMBES
 *
 */
public class ServicePerson implements IservicePerson {

	private IPersonRepository personRepository;

	public ServicePerson(IPersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> getAll() {
		return personRepository.findAll();
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

}
