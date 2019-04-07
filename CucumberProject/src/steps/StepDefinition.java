package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition 
{
	@Given("^Application is up and running$")
	public void application_is_up_and_running() throws Throwable {
	    System.out.println("Application is fully up and runnig");
	}

	@When("^User enters valid credentials$")
	public void user_enters_valid_credentials() throws Throwable {
	    System.out.println("Entered username and password");
	}

	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
	   System.out.println("Hope page is displayed successfully");
	}
	
	
	/************************Feature 2************************/
	@And("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
		System.out.println(" login successfull");
	    
	}

	@When("^User clicks on compose option$")
	public void user_clicks_on_compose_option() throws Throwable {
	    System.out.println("Clicked on compose button");
	}

	@And("^User enters (.*?) and (.*)$")
	public void pradnya_method(String email, String subject) throws Throwable {
	    System.out.println(email+" "+subject);
	}

	@And("^User Clicks on send button$")
	public void user_Clicks_on_send_button() throws Throwable {
	    System.out.println("Clicked on send button");
	}

	@Then("^Compose window is closed$")
	public void compose_window_is_closed() throws Throwable {
	    System.out.println("Compose window is closed");
	}

	@And("^Message window pops up$")
	public void message_window_pops_up() throws Throwable {
	    System.out.println("message window pops up");
	}

}
