package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("user types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("user should see apple - Google Search is in the google title")
    public void user_should_see_apple_google_search_is_in_the_google_title() {
        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification is failed", expectedTitle, actualTitle);
    }
    @When("user types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);

    }
    @Then("user should see {string} is in the google title")
    public void user_should_see_is_in_the_google_title(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
/*
TC#51: Etsy Title Verification
1. User is on https://www.etsy.com
2. User sees title is as expected.

Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

Note: Follow POM

TC#52: Etsy Search Functionality Title Verification (without parameterization)
1. User is on https://www.etsy.com
2. User types Wooden Spoon in the search box
3. User clicks search button
4. User sees Wooden Spoon is in the title

Note: Follow POM
TC#53: Etsy Search Functionality Title Verification (with parameterization)
1. User is on https://www.etsy.com
2. User types Wooden Spoon in the search box
3. User clicks search button
4. User sees Wooden Spoon is in the title

Note: Follow POM

 */