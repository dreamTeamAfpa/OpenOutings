/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.ArrayList;

import fr.afpa.filRouge.model.Event;
import fr.afpa.filRouge.repository.EventRepository;

/**
 * @author L. CASTAGNEDOLI
 *
 */
public class ServiceEvent implements IserviceEvent {
	
	private EventRepository eventRepository;
	
	public ServiceEvent(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	public void addEvent(Event event) {
		eventRepository.create(event);
		
	}

	public Event getOneEvent(int idEvent) {
		return eventRepository.getOne(idEvent);
	}

	public ArrayList<Event> getAllEvent() {
		return (ArrayList<Event>) eventRepository.findAll();
	}

	public void updateEvent(Event event) {
		eventRepository.update(event);
	}

	public void deleteEvent(Event event) {
		eventRepository.delete(event.getIdEvent());
	}

}
