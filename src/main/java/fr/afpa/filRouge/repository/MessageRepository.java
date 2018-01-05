package fr.afpa.filRouge.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import fr.afpa.filRouge.model.Message;
/**
 *  @author RTI
 * 
 */
@Component
public interface MessageRepository extends CrudRepository<Message, Integer> {

	List<Message> findMessageByIdGroupOrderByIdmessageDesc(int idgroupe) ;



}
