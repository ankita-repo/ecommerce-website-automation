package org.spraystore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.spraystore.utility.Core;

import java.util.List;

public class SearchPage {

    private WebDriver driver;
    private Core core;

    private SearchPage searchPage;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.core = new Core(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = "product-image2")
    private List<WebElement> productImg;

    @FindBy(how = How.CLASS_NAME, using = "add-to-cart")
    private List<WebElement> addToCart;

    @FindBy(how = How.CLASS_NAME, using = "sbmincart-submit")
    private WebElement checkoutBtn;

    public void addToCart() {
        core.scrollDown(productImg.get(0));
        core.hoverOverElement(productImg.get(0));
        WebElement element1 = addToCart.get(0);
        core.click(element1);

        core.scrollDown(productImg.get(1));
        core.hoverOverElement(productImg.get(1));
        WebElement element2 = addToCart.get(1);
        core.click(element2);
    }

    public void doCheckout() {
        core.click(checkoutBtn);
    }
}
