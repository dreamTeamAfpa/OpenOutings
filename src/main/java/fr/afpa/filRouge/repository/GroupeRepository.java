/**
 * 
 */
package fr.afpa.filRouge.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import fr.afpa.filRouge.model.GeographicalArea;
import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.model.Interest;

/**
 * @author 34011-79-09
 *
 */
@Component
public interface GroupeRepository extends CrudRepository<Groupe, Integer> {


	ArrayList<Groupe> findGroupByInterests(Interest interest);

	List<Groupe> findGroupByGeographicalArea(GeographicalArea geographicalArea);



}
