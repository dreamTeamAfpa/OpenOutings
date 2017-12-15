/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Event;
import fr.afpa.filRouge.repository.EventRepository;

/**
 * @author L. CASTAGNEDOLI
 *
 */
@Service
public class ServiceEvent implements IserviceEvent {
	@Autowired
	private EventRepository eventRepository;
	
	public ServiceEvent(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	public void addEvent(Event event) {
		eventRepository.save(event);
	}

	public Event getOneEvent(int idEvent) {
		return eventRepository.findOne(idEvent);
	}

	public ArrayList<Event> getAllEvent() {
		return (ArrayList<Event>) eventRepository.findAll();
	}

	public void updateEvent(Event event) {
		eventRepository.save(event);
	}

	public void deleteEvent(Event event) {
		eventRepository.delete(event.getIdEvent());
	}

}
