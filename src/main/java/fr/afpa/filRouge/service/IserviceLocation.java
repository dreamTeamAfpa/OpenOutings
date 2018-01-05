package fr.afpa.filRouge.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Locations;

/**
 * @author FR DESCOMBES
 *
 */
@Service
public interface IserviceLocation {

	public ArrayList<Locations> getAll();

	public Locations getOne(int postalCode);

	public Locations getOne(String nameLocation);

	public Locations findByNameLocation(String nameLocation);

	public void modifiedOne(Locations location);

	public void addLocation(Locations location);

	public void delLocation(Locations location);

}
