/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Theme;

/**
 * @author RTI
 *
 */
@Service
public interface IserviceTheme {

	public List<Theme> getAll();
	
	public Theme getOne(String nameTheme);
	
	public void addTheme(Theme theme);
	
	public void delTheme(Theme theme);
	
	public void modifiedOne(Theme theme);
	
}
