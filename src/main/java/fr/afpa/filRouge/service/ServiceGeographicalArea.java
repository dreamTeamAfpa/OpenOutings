/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;
import fr.afpa.filRouge.model.GeographicalArea;
import fr.afpa.filRouge.repository.IGeographicalAreaRepository;

/**
 * @author PH GUIGUE
 *
 */
public class ServiceGeographicalArea implements IserviceGeographicalArea {
	private IGeographicalAreaRepository geographicalAreaRepository;
	public ServiceGeographicalArea(IGeographicalAreaRepository geographicalAreaRepository) {
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
