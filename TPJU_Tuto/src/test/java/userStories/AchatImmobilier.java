package userStories;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tutoClasses.Agence;
import tutoClasses.Immobilier;

public class AchatImmobilier {
	
	private Agence monAgence;
	private Immobilier nouveauImmobilier;
	
	@Given("Immobilier disponible")
	public void immobilier_disponible() {
		
		monAgence = new Agence("Dauphine","Paris",new ArrayList<Immobilier>(), new ArrayList<Immobilier>());
		nouveauImmobilier = new Immobilier(5000, "Gris", null, "Pavillon");  
		
	}

	@When("Je décide d'acheter un immobilier")
	public void je_décide_d_acheter_un_immobilier() {

		monAgence.addImmobilier(nouveauImmobilier);
	}

	@Then("Je reçois une confirmation de l'achat du bien")
	public void je_reçois_une_confirmation_de_l_achat_du_bien() {
	    
		assertEquals(true, monAgence.getImmobiliers().contains(nouveauImmobilier));
	}

}











