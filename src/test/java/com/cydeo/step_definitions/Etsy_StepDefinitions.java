package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class Etsy_StepDefinitions {
    EtsySearchPage etsySearchPage = new EtsySearchPage();
    @When("user on Etsy page")
    public void user_on_etsy_page() {

        Driver.getDriver().get("https://www.etsy.com");

    }
    @Then("user should see Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone title")
    public void user_should_see_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone_title() {
String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Given("user on a home page")
    public void user_on_a_home_page() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @When("user types Wooden Spoon in the search box and clicks search button")
    public void user_types_wooden_spoon_in_the_search_box_and_clicks_search_button() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon" + Keys.ENTER);
    }
    @Then("user sees Wooden Spoon is in the Title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @When("user types {string} in the search box and clicks search button")
    public void user_types_in_the_search_box_and_clicks_search_button(String searchKeyword) {
        etsySearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }
    @Then("user sees {string} is in the Title")
    public void user_sees_is_in_the_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }
}
