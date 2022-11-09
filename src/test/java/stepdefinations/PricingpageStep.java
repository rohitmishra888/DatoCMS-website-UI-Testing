/*package stepdefinations;

import static org.testng.Assert.assertEquals;

import com.capstone.browserfactory.BrowserFactory;
import com.capstone.homepage.Homepage;
import com.capstone.pricingpage.Pricingpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PricingpageStep extends BrowserFactory {
	
	Homepage homepage;
	Pricingpage page;
	
	@Given("user is on the pricing page of Datocms")
	public void user_is_on_the_pricing_page_of_datocms() {
		Browsersetup();
	    initialize();
	    homepage = new Homepage();
	    homepage.clickpricingpage();
	    page = new Pricingpage();
	}

	@When("user clicks on datocms logo")
	public void user_clicks_on_datocms_logo() {
	    page.click_Logo();
	}

	@Then("user is redirected to the homepage of datocms")
	public void user_is_redirected_to_the_homepage_of_datocms() {
		String expectedTitle = page.getTitle();
	    String actualTitle = "The headless CMS that your team will love - DatoCMS";
	    assertEquals(expectedTitle,actualTitle);
	    page.close();
	}

	@When("user clicks on agency partner program link")
	public void user_clicks_on_agency_partner_program_link() {
		page.click_agency_partner_program_link();
	}

	@Then("you are on the partners page of datocms")
	public void you_are_on_the_partners_page_of_datocms() {
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on compare limits and feature details button")
	public void user_clicks_on_compare_limits_and_feature_details_button() {
		page.click_compare_limits_and_feature_Button();
	}

	@Then("user redirects to full comparison page")
	public void user_redirects_to_full_comparison_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user scroll down the pricing page")
	public void user_scroll_down_the_pricing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("image should be visible on the page")
	public void image_should_be_visible_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user scroll downs to the bottom of the page")
	public void user_scroll_downs_to_the_bottom_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on privacy policy link")
	public void user_clicks_on_privacy_policy_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is on privacy policy page")
	public void user_is_on_privacy_policy_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}*/
