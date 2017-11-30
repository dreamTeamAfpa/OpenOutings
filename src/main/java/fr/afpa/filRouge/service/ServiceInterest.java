/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Interest;
import fr.afpa.filRouge.repository.InterestRepository;

/**
 * @author PH GUIGUE
 *
 */
@Service
public class ServiceInterest implements IserviceInterest {
	
	private InterestRepository interestRepository;
	public ServiceInterest(InterestRepository interestRepository) {
		this.interestRepository= interestRepository;
		}

	@Override
	public List<Interest> getAll() {
		// TODO Auto-generated method stub
		return interestRepository.findAll();
	}

	@Override
	public Interest getOne(String nameInterest) {
		// TODO Auto-generated method stub
		return interestRepository.findByNameInterestAllIgnoreCase(nameInterest);
	}

	@Override
	public void modifiedOne(Interest interest) {
		interestRepository.save(interest);
		
	}

	@Override
	public void addInterest(Interest interest) {
		interestRepository.save(interest);
		
	}

	@Override
	public void delInterest(Interest interest) {
		interestRepository.delete(interest);
		
	}

}
