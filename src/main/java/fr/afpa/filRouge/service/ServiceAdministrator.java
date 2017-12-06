/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.afpa.filRouge.model.Administrator;
import fr.afpa.filRouge.repository.IAdministratorRepository;

/**
 * @author RTI
 *
 */
@Service
public class ServiceAdministrator implements IserviceAdministrator {

	@Autowired
	private IAdministratorRepository administratorRepository;

	public ServiceAdministrator(IAdministratorRepository administratorRepository) {
		this.administratorRepository = administratorRepository;
	}

	@Override
	public List<Administrator> getAll() {
		return administratorRepository.findAll();
	}

	@Override
	public Administrator getOne(int id) {
		return administratorRepository.findOne(id);
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
