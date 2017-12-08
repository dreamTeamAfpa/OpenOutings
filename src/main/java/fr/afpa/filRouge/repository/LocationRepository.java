/**
 * 
 */
package fr.afpa.filRouge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Locations;

/**
 * @author 34011-79-09
 *
 */
@Repository
public interface LocationRepository extends CrudRepository<Locations, Integer> {
	
	Locations findByNameLocation(String nameLocation);
}
