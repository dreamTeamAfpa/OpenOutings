package fr.afpa.filRouge.service;

import java.util.List;
import org.springframework.stereotype.Service;
import fr.afpa.filRouge.model.Location;

/**
 * @author FR DESCOMBES
 *
 */
@Service
public interface IserviceLocation {

	public List<Location> getAll();

	public Location getOne(int postalCode);

	public Location getOne(String nameLocation);

	public void modifiedOne(Location location);

	public void addLocation(Location location);

	public void delLocation(Location location);

}
