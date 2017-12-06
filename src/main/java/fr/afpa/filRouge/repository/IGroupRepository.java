package fr.afpa.filRouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.afpa.filRouge.model.Groupe;
@Repository
public interface IGroupRepository extends JpaRepository<Groupe, Integer> {

}
