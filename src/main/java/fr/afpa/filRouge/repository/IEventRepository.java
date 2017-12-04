/**
 * 
 */
package fr.afpa.filRouge.repository;
/**
 * @author 34011-79-09
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Event;

@Repository
public interface IEventRepository extends JpaRepository<Event,Integer>{
	
}
