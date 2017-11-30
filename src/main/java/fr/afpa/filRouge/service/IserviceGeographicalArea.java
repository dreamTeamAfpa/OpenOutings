/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;
import java.util.Set;

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

	    public void modifiedOne(String nameArea, String descriptionArea);

	    public void addGeographicalArea(GeographicalArea geographicalArea);

	    public void delGeographicalArea(String nameArea);

	    public Set<GeographicalArea> findGeographicalArea();

	    public  GeographicalArea getOne(String nameArea, String descriptionArea);
	}
