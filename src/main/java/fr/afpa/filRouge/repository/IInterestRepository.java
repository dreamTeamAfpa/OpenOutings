package fr.afpa.filRouge.repository;

import java.util.ArrayList;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Interest;

/**
 * @author 34011-79-09
 *
 */
@Repository
public interface IInterestRepository extends JpaRepository<Interest, String> {

	 Interest findByNameInterestAllIgnoreCase(String nameInterest);
//	 @Cacheable("interest")
//	    ArrayList<Interest> findAll() throws DataAccessException;
}
