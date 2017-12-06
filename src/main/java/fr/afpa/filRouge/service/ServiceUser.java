/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.User;
import fr.afpa.filRouge.repository.IUserRepository;

/**
 * @author FR DESCOMBES
 *
 */
@Service
public class ServiceUser implements IserviceUser {
	@Autowired
	private IUserRepository userRepository;
	@Autowired
	public ServiceUser(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

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

	public User findOneByUsername(String username) {
		User users = ((ServiceUser) userRepository).findOneByUsername(username);
		return users;
	}

	@Override
	public void addUser(User user) {
		user.setPasswordUser(bCryptPasswordEncoder.encode(user.getPasswordUser()));
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
