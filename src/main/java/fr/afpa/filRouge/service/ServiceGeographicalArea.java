/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.GeographicalArea;
import fr.afpa.filRouge.repository.GeographicalAreaRepository;

/**
 * @author PH GUIGUE
 *
 */
@Service
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
		return geographicalAreaRepository.findByNameAreaAllIgnoreCase(nameArea);
	}

	@Override
	public void modifiedOne(GeographicalArea geographicalArea) {
		geographicalAreaRepository.save(geographicalArea);
		
	}

	@Override
	public void addGeographicalArea(GeographicalArea geographicalArea) {
		geographicalAreaRepository.save(geographicalArea);		
	}

	@Override
	public void delGeographicalArea(GeographicalArea geographicalArea) {
		geographicalAreaRepository.delete(geographicalArea);
		
	}



}
