/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Location;
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
	public List<Location> getAll() {
		return locationRepository.findAll();
	}

	@Override
	public Location getOne(int postalCode) {
		return locationRepository.findOne(postalCode);
	}

	@Override
	public Location getOne(String nameLocation) {
		return locationRepository.findOne(nameLocation);
	}

	@Override
	public void modifiedOne(Location location) {
		locationRepository.save(location);
	}

	@Override
	public void addLocation(Location location) {
		locationRepository.save(location);
	}

	@Override
	public void delLocation(Location location) {
		locationRepository.delete(location);
	}

}
