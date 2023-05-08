package org.spraystore.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.spraystore.utility.Core;

public class HomePage {

    private WebDriver webDriver;
    private Core core;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.core = new Core(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = "boxhny13")
    private WebElement bagCategory;

    public void navigateToHomePage(){
        webDriver.navigate().to("https://sprystore.s3.amazonaws.com/index.html");
    }

    public void goToBagCategory(){
       core.scrollDown();
       core.click(bagCategory);
    }

}
