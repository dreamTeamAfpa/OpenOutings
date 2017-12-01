package fr.afpa.filRouge.service;

import java.util.ArrayList;

import fr.afpa.filRouge.model.Event;

/**
 * @author L. CASTAGNEDOLI
 *
 */
public interface IserviceEvent {

	public void addEvent(Event event);
	
	public Event getOneEvent(int idEvent);
	
	public ArrayList<Event> getAllEvent();
	
	public void updateEvent(Event event);
	
	public void deleteEvent(int idEvent);
}
