package org.spraystore.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.text.html.parser.Element;

public class Core {

    private WebDriver driver;
    private JavascriptExecutor js;

    public Core(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public void scrollDown() {
        try {
            js.executeScript("window.scrollBy(0,900)", "");
            Thread.sleep(2000);
        } catch (Exception exception) {
            System.out.println("Error scrolling down");
        }
    }

    public void scrollDown(WebElement targetElement) {
        try {
            int tryCount = 15;
            boolean elementFound = false;
            while (tryCount-->0 && !elementFound){
                js.executeScript("window.scrollBy(0,200)", "");
                elementFound = isElementPresent(targetElement);
            }
            Thread.sleep(1000);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw new RuntimeException("Target Element not found");
        }
    }

    public void click(WebElement webElement) {
        try {
            webElement.click();
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            throw new RuntimeException("error clicking element");
        }
    }

    public boolean isElementPresent(WebElement webElement) {
        try {
            return webElement.isDisplayed();
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            throw new RuntimeException("error in checking is element present");
        }
    }

    public void hoverOverElement(WebElement element){
        try {
            //Creating object of an Actions class
            Actions action = new Actions(driver);
            //Performing the mouse hover action on the target element.
            action.moveToElement(element).perform(); //  .moveToElement
            Thread.sleep(100);
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            throw new RuntimeException("error while hover an element");
        }
    }
}
