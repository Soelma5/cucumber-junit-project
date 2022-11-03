package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {

    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("It is from Given");

    }
    @When("he eats some cucumbers")
    public void he_eats_some_cucumbers() {
        System.out.println("It is from When");

    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");

    }
}
/*
TC#50: Create a new feature file and new scenarios
1. Create a new feature file named Login.feature
2. Create 3 new scenarios from the below provided user story.
3. User Story:
As a user, I should be able to login with correct credentials to different accounts.
And dashboard should be displayed.
Accounts are: librarian, student, admin
4. Create a new step definition class under step_definitions package
named: LoginStepDefs
5. Run the code. Get the step definitions from the console
6. No Java-selenium code implementation needed. Just add printing line in the
implementation regarding what should be happening when the code is ran.
Ex: “User is on the login page”
 */