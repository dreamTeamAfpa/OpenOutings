/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import fr.afpa.filRouge.model.User;
import fr.afpa.filRouge.repository.UserRepository;

/**
 * @author FR DESCOMBES
 *
 */
public class ServiceUser implements IserviceUser {
	
	private UserRepository userRepository;
	
	public ServiceUser(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAll() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Override
	public User getOne(int id) {
		User users = userRepository.findOne(id);
		return users;
	}

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void delUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void modifiedOne(User user) {
		userRepository.save(user);
		
	}

}
