/**
 * 
 */
package fr.afpa.filRouge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Theme;

/**
 * @author 34011-79-09
 *
 */
@Component
public interface ThemeRepository extends CrudRepository<Theme, Integer> {

	Theme findOneByNameTheme(String nameTheme);

}
