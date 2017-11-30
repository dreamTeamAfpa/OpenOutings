/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Administrator;
import fr.afpa.filRouge.repository.AdministratorRepository;

/**
 * @author RTI
 *
 */
@Service
public class ServiceAdministrator implements IserviceAdministrator {
	
	private AdministratorRepository administratorRepository;
	
	public ServiceAdministrator(AdministratorRepository administratorRepository) {
		this.administratorRepository = administratorRepository;
	}

	@Override
	public List<Administrator> getAll() {
		List<Administrator> administrators = administratorRepository.findAll();
		return administrators;
	}

	@Override
	public Administrator getOne(int id) {
		Administrator administrator = administratorRepository.getOne(id);
		return administrator;
	}

	@Override
	public void addAdministrator(Administrator administrator) {
		administratorRepository.save(administrator);
	}

	@Override
	public void delAdministrator(Administrator administrator) {
		administratorRepository.delete(administrator);
	}

	@Override
	public void modifiedOne(Administrator administrator) {
		administratorRepository.save(administrator);
	}
	
	
	
	
	

}
