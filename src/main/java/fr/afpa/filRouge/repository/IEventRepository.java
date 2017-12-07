/**
 * 
 */
package fr.afpa.filRouge.repository;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 34011-79-09
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Event;
import fr.afpa.filRouge.model.Locations;
import fr.afpa.filRouge.model.Theme;

@Repository
public interface IEventRepository extends JpaRepository<Event,Integer>{
	public ArrayList<Event> findByTheme(Theme theme);

	public List<Event> findByLocation(Locations location);
}
