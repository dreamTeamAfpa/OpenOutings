package fr.afpa.filRouge.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Interest;

@Service

public interface IserviceInterest {

	public ArrayList<Interest> getAll();

	public Interest getOne(String nameInterest);
//
//	public void modifiedOne(Interest interest);
//
//	public void addInterest(Interest interest);
//
//	public void delInterest(Interest interest);
}
