package org.spraystore.steps;

import org.openqa.selenium.WebDriver;
import org.spraystore.pages.HomePage;
import org.spraystore.pages.LoginPage;
import org.spraystore.utility.BrowserUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;

public class LoginPageSteps {
    private WebDriver webDriver;
    private BrowserUtility browserUtility;
    private LoginPage loginPage;

    public LoginPageSteps() {
        this.webDriver = BrowserUtility.getDriver("chrome");
        this.loginPage = new LoginPage(this.webDriver);
    }

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() {
        loginPage.goToLoginPage();
    }

    @Then("User enter username and password")
    public void user_enter_username_and_password() {
        loginPage.doLogin("ankita@email.com", "password");
    }

    @Then("User is logged in")
    public void user_is_logged_in() {
        loginPage.validateLogin();
    }

}
