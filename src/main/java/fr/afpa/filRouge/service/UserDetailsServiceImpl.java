package fr.afpa.filRouge.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Person;
import fr.afpa.filRouge.repository.PersonRepository;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	@Transactional
	public final UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Person person = personRepository.findByPseudoUser(username);
		
		if (person == null) {
			throw new UsernameNotFoundException("User " + username + " est inconnu dans la base");
		} 
		
		UserDetails userdetails = new UserDetails(person);
		return null;
	}
//http://www.logicbig.com/tutorials/spring-framework/spring-security/user-details-service/
	//TODO
}
