package training.sapient.steps;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


class MyExample{
	public boolean callMyMethod() {
		return true; 
	}
	
}
public class ProductListStep {

	@Given("^retailer site is up and running$")
	public void retailer_site_is_up_and_running() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("retailer site is up and running>>>>>>");
		
		Assert.assertEquals(true, new MyExample().callMyMethod());
		
		
	}

	@When("^the products are available$")
	public void the_products_are_available() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("the products are available>>>>>>");
	}

	@Then("^show (\\d+) products to retailer$")
	public void show_products_to_retailer(int arg1) throws Throwable {
		System.out.println("show "+arg1+" products to retailer>>>>>>>");
	}

}
