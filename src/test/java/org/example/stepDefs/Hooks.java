package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {


    public  static WebDriver driver = null;

    @Before
    public static void openBrowser()
    {
        // 1- Bridge
        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");

        //Object
        driver  = new ChromeDriver();
        // 4- navigate to url
        driver.navigate().to("https://demo.nopcommerce.com/");
        //Configuration
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
