package com.cydeo.step_definitions;

import com.cydeo.pages.HiOscarPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class HiOscar_StepDef {

    HiOscarPage hiOscarPage = new HiOscarPage();

    @Given("User on HiOscar home page")
    public void user_on_hi_oscar_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
hiOscarPage.searchBtn.click();
    }
    @When("user selects Select {string} option from Coverage year dropdown")
    public void user_selects_select_option_from_coverage_year_dropdown(String string) {
       hiOscarPage.selectCoverageYear.click();
       hiOscarPage.select2023.click();

    }
    @When("user selects Select {string} option from Coverage access dropdown")
    public void user_selects_select_option_from_coverage_access_dropdown(String string) {
hiOscarPage.selectCoverageAccess.click();
hiOscarPage.selectEmployerProvided.click();
    }
    @When("user selects Select {string} option from Network partner dropdown")
    public void user_selects_select_option_from_network_partner_dropdown(String string) {
hiOscarPage.selectNetworkPartner.click();
hiOscarPage.selectOscar.click();
    }
    @When("user selects Select {string} option from Coverage area dropdown")
    public void user_selects_select_option_from_coverage_area_dropdown(String string) {
hiOscarPage.selectCoverageArea.click();
hiOscarPage.selectNewJersey.click();
    }
    @When("user clicks Continue button")
    public void user_clicks_continue_button() {
hiOscarPage.continueBtn.click();
    }
    @Then("user should see that title contains Oscar")
    public void user_should_see_that_title_contains_oscar() {
       String expectedTitle = "Oscar";
       Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }

}
