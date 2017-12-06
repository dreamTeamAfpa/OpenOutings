package fr.afpa.filRouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.afpa.filRouge.model.Groupe;

public interface IGroupRepository extends JpaRepository<Groupe, Integer> {

}
