package userStories;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tutoClasses.Agence;
import tutoClasses.Immobilier; 

public class BaisseDuPrixDesStudios {
	
	private Agence monAgence;
	private Immobilier studioNanterre;
	
	@Given("Les studios rattachés à mon agence")
	public void les_studios_rattachés_à_mon_agence() {

		monAgence = new Agence("Dauphine","Paris",new ArrayList<Immobilier>(), new ArrayList<Immobilier>());
		studioNanterre = new Immobilier(5000, "Gris", null, "Studio");  
		monAgence.addImmobilier(studioNanterre);
	}

	@When("Je baisse les prix de ces biens")
	public void je_baisse_les_prix_de_ces_biens() {

		monAgence.promotion("Studio");
	}

	@Then("Ces studios sont donc disponibles en promotion")
	public void ces_studios_sont_donc_disponibles_en_promotion() {

		assertEquals(true, monAgence.getPromotions().contains(studioNanterre));
	}

}




