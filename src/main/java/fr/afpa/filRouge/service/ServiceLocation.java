/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Locations;
import fr.afpa.filRouge.repository.LocationRepository;

/**
 * @author FR DESCOMBES
 *
 */
@Service
public class ServiceLocation implements IserviceLocation {

	private LocationRepository locationRepository;

	public ServiceLocation(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public List<Locations> getAll() {
		return (List<Locations>) locationRepository.findAll();
	}

	@Override
	public Locations getOne(int postalCode) {
		return locationRepository.findOne(postalCode);
	}

	@Override
	public Locations getOne(String nameLocation) {
		return locationRepository.findByNameLocation(nameLocation);
	}
	
	@Override
	public Locations findByNameLocation(String nameLocation) {
		return locationRepository.findByNameLocation(nameLocation);
	}

	@Override
	public void modifiedOne(Locations location) {
		locationRepository.save(location);
	}

	@Override
	public void addLocation(Locations location) {
		locationRepository.save(location);
	}

	@Override
	public void delLocation(Locations location) {
		locationRepository.delete(location);
	}

}
