/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Interest;
import fr.afpa.filRouge.repository.IInterestRepository;
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
	public ArrayList<Interest> getAll() {
		ArrayList<Interest> interests = interestRepository.findAll(); 
		return  interests;
	}

	@Override
	public Interest getOne(String nameInterest) {
		// TODO Auto-generated method stub
		return interestRepository.getOne(nameInterest);
	}
/*
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
*/
}
