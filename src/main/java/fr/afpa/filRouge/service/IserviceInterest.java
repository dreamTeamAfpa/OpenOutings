package fr.afpa.filRouge.service;

import java.util.List;

import fr.afpa.filRouge.model.Interest;

public interface IserviceInterest {

	 public List<Interest> getAll();

	    public Interest getOne(String nameArea);

	    public void modifiedOne(Interest interest);

	    public void addInterest(Interest interest);

	    public void delInterest(Interest interest);
}
