package fr.afpa.filRouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.afpa.filRouge.model.Event;

public interface EventRepository extends JpaRepository<Event,Integer>{
}
