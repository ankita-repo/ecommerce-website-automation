package org.spraystore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(how = How.ID, using = "exampleInputEmail1")
    private WebElement emailInput;

    @FindBy(how = How.ID, using = "exampleInputPassword1")
    private WebElement passwordInput;

    @FindBy(how = How.CLASS_NAME, using = "submit-login")
    private WebElement submitLogin;

    public void goToLoginPage() {
        try{
            Thread.sleep(2000);
            webDriver.navigate().to("https://sprystore.s3.amazonaws.com/index.html");
            webDriver.findElement(By.className("btn-open")).click();
        }catch (Exception exception){
            System.out.println("Error navigating to login page");
        }

    }

    public void doLogin(String username, String password){
        try{
            emailInput.sendKeys(username);
            passwordInput.sendKeys(password);
            submitLogin.click();
            Thread.sleep(1000);
        }catch (Exception exception){
            System.out.println("Exception in login step");
            exception.printStackTrace();
        }

    }

    public void validateLogin(){

    }
}
