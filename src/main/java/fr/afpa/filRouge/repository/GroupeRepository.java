/**
 * 
 */
package fr.afpa.filRouge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Groupe;

/**
 * @author 34011-79-09
 *
 */
@Repository
public interface GroupeRepository extends CrudRepository<Groupe, Integer> {

}
