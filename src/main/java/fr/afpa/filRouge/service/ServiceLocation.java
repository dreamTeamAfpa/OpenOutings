/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;
import fr.afpa.filRouge.model.Locations;
import fr.afpa.filRouge.repository.ILocationRepository;

/**
 * @author FR DESCOMBES
 *
 */
public class ServiceLocation implements IserviceLocation {

	private ILocationRepository locationRepository;

	public ServiceLocation(ILocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	@Override
	public List<Locations> getAll() {
		return locationRepository.findAll();
	}

	@Override
	public Locations getOne(int postalCode) {
		return locationRepository.findOne(postalCode);
	}

	@Override
	public Locations getOne(String nameLocation) {
		return locationRepository.findOne(nameLocation);
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
