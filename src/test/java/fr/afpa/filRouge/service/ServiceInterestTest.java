/**
 * 
 */
package fr.afpa.filRouge.service;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.GetMapping;

import fr.afpa.filRouge.app.OpenOutingsSpringBootApplication;
import fr.afpa.filRouge.controller.UserProfilController;
import fr.afpa.filRouge.model.Interest;

/**
 * @author PH GUIGUE
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OpenOutingsSpringBootApplication.class)
public class ServiceInterestTest {
	private MockMvc mockMvc;
	private Interest interest;

	@MockBean
	private ServiceInterest serviceInterest;
	@Autowired
	private UserProfilController userProfilController;

	@Before
	public void setUp() {
		interest = new Interest();
		interest.setNameInterest("foot");
		interest.setDescriptionInterest("en salle");
		
		this.mockMvc = MockMvcBuilders.standaloneSetup(userProfilController).build();
		Mockito.when(serviceInterest.getOne("foot")).thenReturn(interest);
	}
	
	 @Test
	 public void testGetOne() {
	 String nameInterest = "foot";
	 Interest i = new Interest("foot", "en salle");
	
	 assertEquals(i, serviceInterest.getOne(nameInterest));
	 }
	
	
	 @Test
	 @GetMapping("/profiluser")
	 public void testGetAll()throws Exception {
		 mockMvc.perform(get("/interest/{nameInterest}", interest))
         .andExpect(status().isOk())
         .andExpect(model().attribute("interest", hasProperty("name_interest", is("foot"))))
         .andExpect(model().attribute("interest", hasProperty("description_interest", is("en salle"))))
        
         .andExpect(view().name("profiluser"));
 }
}
