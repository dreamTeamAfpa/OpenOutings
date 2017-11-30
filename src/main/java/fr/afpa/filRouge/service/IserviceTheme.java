/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import fr.afpa.filRouge.model.Theme;

/**
 * @author RTI
 *
 */
public interface IserviceTheme {

	public List<Theme> getAll();
	
	public Theme getOne(String nameTheme);
	
	public void addTheme(Theme theme);
	
	public void delTheme(Theme theme);
	
	public void modifiedOne(Theme theme);
	
}
