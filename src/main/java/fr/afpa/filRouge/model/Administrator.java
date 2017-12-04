package fr.afpa.filRouge.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="administrator")
public class Administrator extends Person{

@ManyToMany
private List<Groupe> groupes;




}
