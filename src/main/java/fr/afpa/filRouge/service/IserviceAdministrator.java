/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Administrator;

/**
 * @author RTI
 *
 */
@Service
public interface IserviceAdministrator {

	public List<Administrator> getAll();

	public Administrator getOne(int id);

	public void addAdministrator(Administrator administrator);

	public void delAdministrator(Administrator administrator);

	public void modifiedOne(Administrator administrator);

}
