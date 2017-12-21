/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.GeographicalArea;
import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.model.Interest;

/**
 * @author Y LE BIHAN
 *
 */
@Service
public interface IserviceGroupe {
	
	public ArrayList<Groupe> getGroup() ;
	
	public void addGroup(Groupe groupe);
	
	public Groupe getOneGroup(int idGroup);
	
	public ArrayList<Groupe>getAllGroup();
	
	public void editGroup(Groupe groupe) ;
	
	public void deleteGroup(Groupe group) ;
	
	public List<Groupe> getGroupByGeographicalArea(GeographicalArea geographicalArea) ;
	
	public ArrayList<Groupe> getGroupByInterests(Interest interest);
	
	 public ArrayList<Groupe> getAllGroupe(int personId);
	 
	 public Groupe findGroupeByName(String name);
	
	
}
