/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.GeographicalArea;

/**
 * @author PH GUIGUE
 *
 */
@Service
public interface IserviceGeographicalArea {


	    public List<GeographicalArea> getAll();

	    public GeographicalArea getOne(String nameArea);

	    public void modifiedOne(GeographicalArea geographicalArea);

	    public void addGeographicalArea(GeographicalArea geographicalArea);

	    public void delGeographicalArea(GeographicalArea geographicalArea);

	

	}
