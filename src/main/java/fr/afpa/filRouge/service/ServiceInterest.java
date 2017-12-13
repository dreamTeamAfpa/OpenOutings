/**
 * 
 */
package fr.afpa.filRouge.service;




import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Interest;
import fr.afpa.filRouge.repository.InterestRepository;

/**
 * @author PH GUIGUE
 *
 */
@Service
public class ServiceInterest implements IserviceInterest {
	private Interest interest;
	@Autowired
	private InterestRepository interestRepository;
	
	public ServiceInterest(InterestRepository interestRepository) {
		this.interestRepository= interestRepository;
		}

	@Override
	public synchronized ArrayList<Interest> getAll() {
		ArrayList<Interest> listInterest = (ArrayList<Interest>) interestRepository.findAll();
	
		return listInterest;
	}

	@Override
	public synchronized Interest getOne(String nameInterest) {
		// TODO Auto-generated method stub
		return interestRepository.findByNameInterestAllIgnoreCase(nameInterest);
	}

	@Override
	public synchronized void modifiedOne(Interest interest) {
		interestRepository.save(interest);
		
	}

	@Override
	public synchronized void addInterest(Interest interest) {
		interestRepository.save(interest);
		
	}

	@Override
	public synchronized void delInterest(Interest interest) {
		interestRepository.delete(interest);
		
	}

	@Override
	public synchronized Interest findByNameInterestAllIgnoreCase(String nameInterest) {
		interest = interestRepository.findByNameInterestAllIgnoreCase(nameInterest);
		return interest;
	}

}
