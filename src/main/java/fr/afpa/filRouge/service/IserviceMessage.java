package fr.afpa.filRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.afpa.filRouge.model.Message;

/**
 * @author RTI
 * 
 */

@Service
public interface IserviceMessage {

	public List<Message> getMessagegByGroupe(int idgroupe);

	public void addMessage(Message message);

}
