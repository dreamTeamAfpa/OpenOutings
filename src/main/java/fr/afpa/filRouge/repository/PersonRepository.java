package fr.afpa.filRouge.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.model.Person;

/**
 * @author RTI
 *
 */
@Component
public interface PersonRepository extends CrudRepository<Person, Integer> {

	Person findByPseudoUserAndPasswordUser(String username, String password);

	Person findByPseudoUser(String username);

	Person findByEmailUser(String email);
	
	 List<Person> findPersonByGroupeRoles(Groupe groupe);

}
