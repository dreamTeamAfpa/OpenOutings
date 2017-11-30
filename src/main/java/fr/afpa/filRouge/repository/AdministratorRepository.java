/**
 * 
 */
package fr.afpa.filRouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Administrator;

/**
 * @author 34011-79-09
 *
 */
@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Integer>{

}
