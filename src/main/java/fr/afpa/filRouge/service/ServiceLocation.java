/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Locations;
import fr.afpa.filRouge.repository.LocationRepository;

/**
 * @author FR DESCOMBES
 *
 */
@Service
public class ServiceLocation implements IserviceLocation {
	
	@Autowired
	private LocationRepository locationRepository;

	public ServiceLocation(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

		// pgu 14/12/17 - implementation of the method getAll() for display listLocation on editProfilMemnbre
	@Override
	public ArrayList<Locations> getAll() {
		ArrayList<Locations> listLocation =(ArrayList<Locations>) locationRepository.findAll();
		
		return listLocation; 
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
