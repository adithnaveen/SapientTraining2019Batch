package training.sapient.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DriveSteps {

	@Given("^the roads are free$")
	public void the_roads_are_free() throws Throwable {
		System.out.println("the roads are free**********");
	}

	@When("^car is available$")
	public void car_is_available() throws Throwable {
		System.out.println("car is available***********");
	}

	@Then("^should reach office in (\\d+) mins$")
	public void should_reach_office_in_mins(int arg1) throws Throwable {
		System.out.println("should reach office in " + arg1 + "mins");
	}

	@Then("^start working$")
	public void start_working() throws Throwable {
		System.out.println("Start working**** ");
	}

}
