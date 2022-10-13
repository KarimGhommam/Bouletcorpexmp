package com.e2etests.automation.step_definitions;
import org.junit.Assert;

import com.e2etests.automation.page_objects.BouletcorpPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BouletcorpStepDefinition {
	private BouletcorpPage BouletcorpPage;
	private String titel;
	public BouletcorpStepDefinition() {
		this.BouletcorpPage = new BouletcorpPage();
	}

	@Given("je me connecte sur l application Bouletcorp")
	public void jeMeConnecteSurLApplicationBouletcorp() {
		BouletcorpPage.goToUrl();
		titel = Setup.getDriver().getPageSource();
	}

	@When("je clique sur le bouton Aléatoire")
	public void jeCliqueSurLeBoutonAléatoire() {
		BouletcorpPage.clickOnAléatoireLink();
	}

	@Then("je verifie que la page a change")
	public void jeVerifieQueLaPageAChange() {
		Assert.assertNotEquals(titel,Setup.getDriver().getPageSource());

	}

	@Then("je verifie que les widgets facebook, twitter et tumblr sont bien affichés")
	public void jeVerifieQueLesWidgetsFacebookTwitterEtTumblrSontBienAffichés() {
		Assert.assertTrue((BouletcorpPage.facebook.isDisplayed())&&(BouletcorpPage.shareOnTumblr.isDisplayed())&&(BouletcorpPage.twitter.isDisplayed()));

	}

}
