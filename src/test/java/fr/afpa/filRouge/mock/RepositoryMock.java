package fr.afpa.filRouge.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.repository.IGroupRepository;

public class RepositoryMock implements IGroupRepository {

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInBatch(Iterable<Groupe> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Groupe> findAll() {
		// TODO Auto-generated method stub
		ArrayList<Groupe> groupes= new ArrayList<Groupe>();

		 int  idGroup =5;
		 String nameGroup =" bowling";
		 String descriptionGroup = "ras";
		 Boolean permanent=true;
		 Groupe g = new Groupe(idGroup,nameGroup,descriptionGroup,permanent);
		 int  idGroup2 =6;
		 String nameGroup2 ="foot";
		 String descriptionGroup2 = "ras";
		 Boolean permanent2=true;
		 Groupe g2 = new Groupe(idGroup2,nameGroup2,descriptionGroup2,permanent2);
		 groupes.add(g);
		 groupes.add(g2);
		 for (Groupe a : groupes) {
			 System.out.println(a.getNameGroup()+" "+a.getDescriptionGroup()+ " "+a.getIdGroup());
		 }
		
		return groupes;
	}

	@Override
	public List<Groupe> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Groupe> findAll(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Groupe> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Groupe> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public Groupe getOne(Integer id) {
		// TODO Auto-generated method stub
		return new Groupe(5,"bowling","ras",true);
	}

	@Override
	public <S extends Groupe> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Groupe> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Groupe> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Groupe g = new Groupe(5,"bowling","ras",true);
		if(id == 5) {
			g.setIdGroup(0);
			g.setNameGroup("");
			g.setDescriptionGroup("");
			
		
		}

	}

	@Override
	public void delete(Groupe arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Groupe> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Groupe findOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Groupe> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Groupe> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Groupe> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Groupe> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Groupe> S findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
