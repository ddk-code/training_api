package cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStep {
    @When("requests get to \\/users")
    public void requests_get_to_users() {
        System.out.println("GET TO /users");
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("response")
    public void response() {
        System.out.println("SUCCESS");
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
}
