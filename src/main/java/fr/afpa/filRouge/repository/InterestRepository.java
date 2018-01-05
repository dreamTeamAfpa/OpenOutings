package fr.afpa.filRouge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import fr.afpa.filRouge.model.Interest;


@Component
public interface InterestRepository extends CrudRepository<Interest, Integer> {

	 Interest findByNameInterestAllIgnoreCase(String nameInterest);
}
