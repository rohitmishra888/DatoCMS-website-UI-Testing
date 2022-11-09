package stepdefinations;

import static org.testng.Assert.assertEquals;

import com.capstone.browserfactory.BrowserFactory;
import com.capstone.homepage.Homepage;
import com.capstone.loginpage.Loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageStep extends BrowserFactory {
	
	Homepage homepage;
	Loginpage page;
	
	@Given("user is on login page of datocms")
	public void user_is_on_login_page_of_datocms() {
		Browsersetup();
	    initialize();
	    homepage = new Homepage();
	    homepage.clicklogin();
	    page = new Loginpage();
	}

	@When("user enters email and clicks login")
	public void user_enters_email_and_clicks_login() {
	    page.enteremail("sanjib@chakroborty.com");
	    page.clickloginbutton();
	}

	@Then("field is required error should appear")
	public void field_is_required_error_should_appear() {
	    String expectedMsg = page.getmsg();
	    String actualMsg = "Field is required";
	    assertEquals(expectedMsg,actualMsg);
	    page.close();
	}

	@When("user enters only password and clicks login")
	public void user_enters_only_password_and_clicks_login() {
	    page.enterpassword("99sfsdf");
	    page.clickloginbutton();
	    
	}

	@Then("field is reruired under email should appear")
	public void field_is_reruired_under_email_should_appear() {
		String expectedMsg = page.getmsg();
	    String actualMsg = "Field is required";
	    assertEquals(expectedMsg,actualMsg);
	    page.close();
	}

	@When("user clicks on reset password")
	public void user_clicks_on_reset_password() {
	    page.clickResetPassword();
	}

	@Then("reset password frame should appear")
	public void reset_password_frame_should_appear() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on signup page link")
	public void user_clicks_on_signup_page_link() {
	    page.clickSignuplink();
	}

	@Then("user should redirected to signup page")
	public void user_should_redirected_to_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("When user clicks on datocms logo")
	public void user_clicks_on_datocms_logo() {
	    page.clicklogo();
	}

	@Then("user should redirected to homepage")
	public void user_should_redirected_to_homepage() {
	    String expectedTitle = page.getTitle();
	    String actualTitle = "The headless CMS that your team will love - DatoCMS";
	    assertEquals(expectedTitle,actualTitle);
	    page.close();
	}


}
