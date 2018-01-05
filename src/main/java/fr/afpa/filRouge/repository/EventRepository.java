package fr.afpa.filRouge.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import fr.afpa.filRouge.model.Event;
import fr.afpa.filRouge.model.Locations;
import fr.afpa.filRouge.model.Theme;

@Component
public interface EventRepository extends CrudRepository<Event,Integer>{

	List<Event> findByLocation(Locations location);
	ArrayList<Event> findByTheme(Theme theme);
}
