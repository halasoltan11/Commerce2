package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.util.Timeout;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {

    P03_homePage homePage = new P03_homePage();
    @When("click on slider Then User to redirect to uncorrect site")
    public void clickOnSlider() {
        homePage.sliderNokia().click();
        String url = Hooks.driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertEquals(Hooks.driver.getCurrentUrl() ,"https://demo.nopcommerce.com/nokia-lumia-1020");
    }


    @When("click on The second slider")
    public void clickOnTheSecondSlider() throws InterruptedException {
        homePage.sliderIphone().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        //wait(20);
        wait.until(ExpectedConditions.titleContains("https://demo.nopcommerce.com/iphone-6"));
        // Thread.sleep(2000);

    }

    @Then("User to redirect to the same  site")
    public void userToRedirectToTheSameSite() {
        String URL = Hooks.driver.getCurrentUrl();
        System.out.println(URL);
        Assert.assertEquals(URL ,"https://demo.nopcommerce.com/iphone-6");
    }


}
