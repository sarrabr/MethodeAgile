package userStories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList; 

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tutoClasses.Agence;
import tutoClasses.Immobilier;

class AgenceTest {
	
	Agence agence;

	@BeforeEach
	void setUp() throws Exception {
		agence = new Agence("Dauphine","Paris",new ArrayList<Immobilier>(), null);
	}

	@AfterEach
	void tearDown() throws Exception {
	} 
	
	@Test
	void testAddImmobilier() {
		Immobilier maison = new Immobilier(1500, "Blanc", null, null);
		agence.addImmobilier(maison);
		assertTrue(agence.getImmobiliers().contains(maison)); 
	} 
	
	@Test
	void testPromotion() {
		
		Immobilier maison = new Immobilier(6000,"Bleu",null,"Pavillon");
		agence.addImmobilier(maison);
		agence.promotion("Pavillon");
		assertTrue(agence.getPromotions().contains(maison));
		
	}
}





