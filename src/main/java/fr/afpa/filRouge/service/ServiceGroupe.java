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
import fr.afpa.filRouge.repository.GroupeRepository;

/**
 * @author Y LE BIHAN
 *
 */
@Service
public class ServiceGroupe implements IserviceGroupe {
	private GroupeRepository groupeRepository;
	
	public ServiceGroupe(GroupeRepository groupeRepository) {
		this.groupeRepository = groupeRepository;
	}

	public void addGroup(Groupe groupe) {
		groupeRepository.save(groupe);
	}

	public Groupe getOneGroup(int idGroup) {
		return groupeRepository.findOne(idGroup);
	}

	public ArrayList<Groupe> getAllGroup() {
		return (ArrayList<Groupe>) groupeRepository.findAll();
	}

	public void editGroup(Groupe groupe) {
		groupeRepository.save(groupe);
	}
	public void deleteGroup(Groupe group) {
		groupeRepository.delete(group);
	}

	public ArrayList<Groupe> getGroupByInterests(Interest interest) {
		// TODO Auto-generated method stub
		return groupeRepository.findGroupByInterests(interest);
	}

	public List<Groupe> getGroupByGeographicalArea(GeographicalArea geographicalArea) {
		// TODO Auto-generated method stub
		return groupeRepository.findGroupByGeographicalArea(geographicalArea);
	}

	public ArrayList<Groupe> getGroup() {
		
		return (ArrayList<Groupe>) groupeRepository.findAll();
	}


}
