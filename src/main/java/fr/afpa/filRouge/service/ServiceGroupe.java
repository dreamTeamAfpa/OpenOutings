/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.GeographicalArea;
import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.model.Interest;
import fr.afpa.filRouge.model.Message;
import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.repository.GroupeRepository;

/**
 * @author Y LE BIHAN
 *
 */
@Service
public class ServiceGroupe implements IserviceGroupe {

  @Autowired
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
	public void deleteGroup(Groupe groupe) {
		groupeRepository.delete(groupe);
	}

	public ArrayList<Groupe> getGroupByInterests(Interest interest) {
		return groupeRepository.findGroupByInterests(interest);
	}

	public List<Groupe> getGroupByGeographicalArea(GeographicalArea geographicalArea) {
		return groupeRepository.findGroupByGeographicalArea(geographicalArea);
	}

	public ArrayList<Groupe> getGroup() {
		return (ArrayList<Groupe>) groupeRepository.findAll();
	}

	 public ArrayList<Groupe> getAllGroupe(int personId) {
	        ArrayList<Groupe> groups = groupeRepository.findGroupeByPerson(personId);
	        return groups;
	 }
	 public Groupe findGroupeByName(String name) {
		 return groupeRepository.findGroupeByNameGroup(name);
	 }

	public List<Groupe> getGroupeByPerson(Person person) {
		List<Groupe> groups = groupeRepository.findPersonByPersonRoles(person);
		return groups;
	}

	public Groupe getGroupeByName(String nomgroupe) {
		 return groupeRepository.findGroupeByNameGroup(nomgroupe);
	}

}
