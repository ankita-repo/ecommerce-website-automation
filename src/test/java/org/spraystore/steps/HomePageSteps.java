package org.spraystore.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.spraystore.pages.HomePage;
import org.spraystore.utility.BrowserUtility;

public class HomePageSteps {
    private WebDriver webDriver;
    private BrowserUtility browserUtility;
    private HomePage homePage;

    public HomePageSteps() {
        this.webDriver = BrowserUtility.getDriver("chrome");
        homePage = new HomePage(webDriver);
    }

    @Given("User navigates to hand bag category")
    public void user_navigates_to_hand_bag_category() {
        homePage.goToBagCategory();
    }
}
