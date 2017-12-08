/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.repository.GroupeRepository;
import fr.afpa.filRouge.repository.GroupeRepository;

/**
 * @author Y LE BIHAN
 *
 */
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

}
