package fr.afpa.filRouge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
 * @Author RTI
 * 
 */

import fr.afpa.filRouge.model.Message;
import fr.afpa.filRouge.repository.MessageRepository;
@Service
public class ServiceMessage implements IserviceMessage{
	
	@Autowired
	private MessageRepository messageRepositrory;
	
	public ServiceMessage(MessageRepository messageRepository) {
		this.messageRepositrory = messageRepository;
	}
	
	@Override
	public List<Message> getMessagegByGroupe(int idgroupe) {
		List<Message> messages = messageRepositrory.findMessageByIdGroupOrderByIdmessageDesc(idgroupe);
		return messages;
	}

	@Override
	public void addMessage(Message message) {
		messageRepositrory.save(message);
		
	}



}
