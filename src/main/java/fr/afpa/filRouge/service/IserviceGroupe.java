/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Groupe;

/**
 * @author Y LE BIHAN
 *
 */
@Service
public interface IserviceGroupe {
	
	
	public void addGroup(Groupe groupe);
	
	public Groupe getOneGroup(int idGroup);
	
	public ArrayList<Groupe>getAllGroup();
	
	public void editGroup(Groupe groupe) ;
	
	public void deleteGroup(Groupe group) ;
	
	/*
	public void setAdministratorByGroup(Administrator administrator);
	
	public Administrator getAdministratorByGroup(int idGroup);
	*/
}
