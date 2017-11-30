package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Interest;

@Service
public interface IserviceInterest {

	public List<Interest> getAll();

	public Interest getOne(String nameArea);

	public void modifiedOne(Interest interest);

	public void addInterest(Interest interest);

	public void delInterest(Interest interest);
}
