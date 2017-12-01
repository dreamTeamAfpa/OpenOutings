/**
 * 
 */
package fr.afpa.filRouge.repository;
/**
 * @author L. CASTAGNEDOLI
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event,Integer>{
}
