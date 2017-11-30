/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;
import java.util.Set;


import fr.afpa.filRouge.model.GeographicalArea;
import fr.afpa.filRouge.repository.GeographicalAreaRepository;

/**
 * @author PH GUIGUE
 *
 */
public class ServiceGeographicalArea implements IserviceGeographicalArea {
	private GeographicalAreaRepository geographicalAreaRepository;
	public ServiceGeographicalArea(GeographicalAreaRepository geographicalAreaRepository) {
		this.geographicalAreaRepository= geographicalAreaRepository;
		}

	@Override
	public List<GeographicalArea> getAll() {
		
		return geographicalAreaRepository.findAll();
	}

	@Override
	public GeographicalArea getOne(String nameArea) {
		// TODO Auto-generated method stub
		return geographicalAreaRepository.findOne(nameArea);
	}

	@Override
	public void modifiedOne(String nameArea, String descriptionArea) {
		geographicalAreaRepository.modifiedOne(nameArea, descriptionArea);
		
	}

	@Override
	public void addGeographicalArea(GeographicalArea geographicalArea) {
		geographicalAreaRepository.addGeographicalArea(geographicalArea);		
	}

	@Override
	public void delGeographicalArea(String nameArea) {
		geographicalAreaRepository.delGeographicalArea(nameArea);
		
	}

	@Override
	public Set<GeographicalArea> findGeographicalArea() {
		// TODO Auto-generated method stub
		return geographicalAreaRepository.findGeographicalArea();
	}

	@Override
	public GeographicalArea getOne(String nameArea, String descriptionArea) {
		// TODO Auto-generated method stub
		return geographicalAreaRepository.findOne(nameArea, descriptionArea);
	}

}
