/**
 * 
 */
package fr.afpa.filRouge.service;
import java.util.List;
import fr.afpa.filRouge.model.Administrator;
import fr.afpa.filRouge.repository.AdministratorRepository;

/**
 * @author RTI
 *
 */
public class ServiceAdministrator implements IserviceAdministrator {
	
	private AdministratorRepository administratorRepository;

	public ServiceAdministrator(AdministratorRepository administratorRepository) {
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
