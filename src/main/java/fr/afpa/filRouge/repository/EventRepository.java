package fr.afpa.filRouge.repository;
import java.util.ArrayList;
import java.util.List;
import fr.afpa.filRouge.model.Event;
import fr.afpa.filRouge.model.Locations;
import fr.afpa.filRouge.model.Theme;

public class EventRepository {

	IEventRepository eventRepo;
	
	public ArrayList<Event> findByTheme(Theme theme) {
		return eventRepo.findByTheme(theme);
	}
	
	public List<Event> findByLocation(Locations location) {
		return eventRepo.findByLocation(location);
	}
	
	public List<Event> findAll() {
		return eventRepo.findAll();
	}
	
	public Event getOne(int idEvent) {
		return eventRepo.getOne(idEvent);
	}
	
	public void delete(int idEvent) {
		eventRepo.delete(idEvent);
	}
	
	public void update(Event event) {
		eventRepo.save(event);
	}
	
	public void create(Event event) {
		eventRepo.save(event);
	}
/*	
	

	@Override
	public List<Event> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Event> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Event> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Event> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	

	@Override
	public <S extends Event> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Event> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Event> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Event> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public void delete(Event entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Event> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Event> S findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Event> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Event> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Event> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
*/
}
