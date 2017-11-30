/**
 * 
 */
package fr.afpa.filRouge.service;

import java.util.List;

import fr.afpa.filRouge.model.User;

/**
 * @author FR DESCOMBES
 *
 */
public interface IserviceUser {

	public List<User> getAll();

	public User getOne(int id);

	public void addUser(User user);

	public void delUser(User user);

	public void modifiedOne(User user);
}
