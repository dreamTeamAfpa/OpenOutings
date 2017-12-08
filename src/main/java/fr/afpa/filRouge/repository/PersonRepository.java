/**
 * 
 */
package fr.afpa.filRouge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Person;

/**
 * @author 34011-79-09
 *
 */
@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

	Person findByPseudoUserAndPasswordUser(String username, String password);

}
