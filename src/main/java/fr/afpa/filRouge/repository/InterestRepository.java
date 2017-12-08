package fr.afpa.filRouge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Interest;


@Repository
public interface InterestRepository extends CrudRepository<Interest, Integer> {

	 Interest findByNameInterestAllIgnoreCase(String nameInterest);
}
