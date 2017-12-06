/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.repository.IGroupRepository;

/**
 * @author Y LE BIHAN
 *
 */
@Service
public class ServiceGroupe implements IserviceGroupe {
	
	private IGroupRepository groupeRepository;
	
	public ServiceGroupe(IGroupRepository groupeRepository) {
		this.groupeRepository = groupeRepository;
	}
	public void addGroup(Groupe groupe) {
		groupeRepository.save(groupe);
	}
	public Groupe getOneGroup(int idGroup) {
		return  groupeRepository.getOne(idGroup);
	}
	public ArrayList<Groupe>getAllGroup(){
		return (ArrayList<Groupe>) groupeRepository.findAll();
	}
	
	public void editGroup(Groupe groupe) {
		groupeRepository.save(groupe);
	}
	
	public void deleteGroup(int idGroup) {
		 groupeRepository.delete(idGroup);
	}
	/*
	@Override
	public Administrator getAdministratorByGroup(int idGroup) {
		return groupeRepository.getAdministratorByGroup(idGroup);
	}
	@Override
	public void setAdministratorByGroup(Administrator administrator) {
		// TODO Auto-generated method stub
		
		this.setAdministratorByGroup(administrator);
	}
	*/
	//INUTILE ???

	/*
	public Administrator getAdministrator() {
		return administrator;
	}
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}
	*/
}
