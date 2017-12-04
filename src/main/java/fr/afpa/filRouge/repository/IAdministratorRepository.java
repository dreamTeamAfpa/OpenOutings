/**
 * 
 */
package fr.afpa.filRouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Administrator;

/**
 * @author RTI
 *
 */
@Repository
public interface IAdministratorRepository extends JpaRepository<Administrator, Integer>{

	
}
