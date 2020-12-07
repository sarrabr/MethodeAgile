package userStories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tutoClasses.Agence;
import tutoClasses.Immobilier;

class ImmobilierTest {
	
	Immobilier appartement, pavillon;
	Agence agence;

	@BeforeEach
	void setUp() throws Exception {
		appartement = new Immobilier(1200,"Gris", null,"Appartement"); 
		pavillon = new Immobilier(1200,"Blanc", null,"Pavillon"); 
		agence = new Agence("Dauphine","Paris",new ArrayList<Immobilier>(), null);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBaisserPrix() {  
		appartement.baisserPrix(300); 
		assertEquals(900, appartement.getPrix()); 
	}
	
	@Test
	void testAugmenterPrix() {
		pavillon.augmenterPrix(300); 
		assertEquals(900, pavillon.getPrix()); 
	}
	
	@Test
	void testChangerPeinture() { 
		appartement.changerPeinture("Blanc");
		assertEquals("Blanc", appartement.getPeinture());
	}
	
	@Test
	void testAddAgence() {
				
		appartement.addAgence(agence);
		assertEquals(agence,appartement.getAgence());
	}
		
}




