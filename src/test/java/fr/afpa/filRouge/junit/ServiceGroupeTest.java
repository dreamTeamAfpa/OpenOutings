package fr.afpa.filRouge.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import fr.afpa.filRouge.mock.RepositoryMock;
import fr.afpa.filRouge.model.Groupe;
import fr.afpa.filRouge.repository.IGroupRepository;
import fr.afpa.filRouge.service.ServiceGroupe;

public class ServiceGroupeTest {
	ServiceGroupe s;
	
	@Before
	public void setUpBeforeClass() {
		
		// TODO Instancier un objet du mock
		IGroupRepository mock = new RepositoryMock();
		
		s = new ServiceGroupe(mock);
	}

//	@Test
//	public void testServiceGroupe() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testAddGroup() { 
	}

	@Test
	public void testGetOneGroup() {
        int  idGroup =5;
		 String nameGroup =" bowling";
		 String descriptionGroup = "ras";
		 Boolean permanent=true;
		 Groupe g = new Groupe(idGroup,nameGroup,descriptionGroup,permanent);
			System.out.println(g.toString());
		
		assertEquals("groupe = bowling",g, s.getOneGroup(idGroup));
	
	}

	@Test
	public void testGetAllGroup() {
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
		 assertEquals(groupes, s.getAllGroup());
		 
	}

//	@Test
//	public void testEditGroup() {
//	}

	@Test
	public void testDeleteGroup() {
		 int idGroup =5;
		 Groupe g = null;
		 s.deleteGroup(idGroup);
		assertNull(g);
		 
	}

}
