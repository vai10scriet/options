package stepDefinitions;



import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinition {

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions

	   System.out.println("hello");

	}

	    @When("User Navigate to LogIn Page with \"([^\"]*)\" and password \"([^\"]*)\"")
	    public void user_navigate_to_login_page_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	       
	    	System.out.println("strArg1"+" "+ "strArg2");
	    	
	    }

	    @Then("Message displayed Login Successfully")
	    public void message_displayed_login_successfully() throws Throwable {
	 
	    }

	
}
