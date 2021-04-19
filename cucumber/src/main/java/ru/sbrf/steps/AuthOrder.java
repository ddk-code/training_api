package ru.sbrf.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthOrder {
    @Given("User sends a request to / auth (POST)")
    public void userSendsPOSTtoAuth() {

    }

    @When("User sends a request to / auth (POST) with the first request")
    public void userSendsPOSTtoAuthFirst() {

    }

    @Then("the server replies that the user is successfully authorized")
    public void successfullyServerReplyAuth() {

    }

    @Given("User sends a request to / auth (POST)")
    public void userSendsPOSTtoAuthNotFirst() {

    }

    @When("User sends a request to / auth (POST) with the first request")
    public void userSendsPOSTtoAuthNotFirstTime() {

    }

    @Then("the server replies that the operation is incorrect and you need to choose another one")
    public void unsuccessfullyServerReplyAuth() {

    }
}
