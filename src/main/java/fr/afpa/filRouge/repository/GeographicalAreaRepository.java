/**
 * 
 */
package fr.afpa.filRouge.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.GeographicalArea;

/**
 * @author 34011-79-09
 *
 */
@Repository
public interface GeographicalAreaRepository extends JpaRepository<GeographicalArea, Integer> {

	
		public List<GeographicalArea> findAll();

	    public GeographicalArea findOne(String nameArea);

	    public void modifiedOne(String nameArea, String descriptionArea);

	    public void addGeographicalArea(GeographicalArea geographicalArea);

	    public void delGeographicalArea(String nameArea);

	    public Set<GeographicalArea> findGeographicalArea();

	    public  GeographicalArea findOne(String nameArea, String descriptionArea);
}
