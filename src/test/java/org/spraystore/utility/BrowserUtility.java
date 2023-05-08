package org.spraystore.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserUtility {

    private static WebDriver webDriver;

    public static WebDriver getDriver(String browser) {

        switch (browser) {
            case "chrome":
                getChromeInstance();
                break;
            default:
                getChromeInstance();
        }
        return webDriver;
    }

    private static void getChromeInstance() {
        if (webDriver == null) {
//            synchronized (webDriver) {
//                if (webDriver == null) {
            try {
                String projectPath = System.getProperty("user.dir");
                System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                webDriver = new ChromeDriver(chromeOptions);

                webDriver.manage().window().maximize();
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("error crearing chrome driver instance");
            }


//                }
//            }

        }
    }


}
