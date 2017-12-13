package fr.afpa.filRouge.service;


import java.util.ArrayList;

import org.springframework.stereotype.Component;

import fr.afpa.filRouge.model.Interest;

@Component
public interface IserviceInterest {
	
	public Interest findByNameInterestAllIgnoreCase(String nameInterest);

	public ArrayList<Interest> getAll();

	public Interest getOne(String nameArea);

	public void modifiedOne(Interest interest);

	public void addInterest(Interest interest);

	public void delInterest(Interest interest);
}
