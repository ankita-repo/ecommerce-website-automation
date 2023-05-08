package org.spraystore.steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.spraystore.pages.SearchPage;
import org.spraystore.utility.BrowserUtility;

public class SearchPageSteps {

    private WebDriver webDriver;
    private BrowserUtility browserUtility;
    private SearchPage searchPage;

    public SearchPageSteps() {
        this.webDriver = BrowserUtility.getDriver("chrome");
        this.searchPage = new SearchPage(webDriver);
    }

    @Then("User adds two item")
    public void userAddTwoElements(){
        searchPage.addToCart();
    }

    @Then("User click on checkout")
    public void checkOut(){
        searchPage.doCheckout();
    }
}
