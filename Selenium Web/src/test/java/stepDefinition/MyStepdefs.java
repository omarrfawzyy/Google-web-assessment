package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.googleHelper;

public class MyStepdefs {

    @Given("User opens Google")
    public void user_opens_google() {
    }
    @Then("User fill the search")
    public void user_fill_the_search() {
        googleHelper.fillSearch();
    }
    @Then("User clicks on search")
    public void user_clicks_on_search() {
        googleHelper.clickOnSearch();
    }
    @And("User clicks on next page")
    public void userClicksOnNextPage() throws InterruptedException {
        googleHelper.clickOnNextPage();
    }
    @Then("User validate on Horse power")
    public void user_validate_on_horse_power() {
        googleHelper.validateOnHorsePower();
    }

}