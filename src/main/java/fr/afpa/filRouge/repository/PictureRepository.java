package fr.afpa.filRouge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import fr.afpa.filRouge.model.Picture;

/**
 * 
 * @author RTI
 *
 */
@Component
public interface PictureRepository extends CrudRepository<Picture,Integer>{

}
