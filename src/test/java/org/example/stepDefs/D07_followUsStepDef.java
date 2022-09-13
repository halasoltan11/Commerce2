package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage homePage = new P03_homePage();
    @When("User opens facebook link")
    public void userOpensFacebookLink() throws InterruptedException {
        homePage.FbLink().click();
        Thread.sleep(2000);
    }

    @When("User opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        homePage.twitterLink().click();
        Thread.sleep(2000);
    }

    @When("User opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        homePage.rssLink().click();
        Thread.sleep(2000);
    }

    @When("User opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        homePage.uTubeLink().click();
        Thread.sleep(2000);
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String arg0) throws InterruptedException {
        ArrayList<String> tabs =new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl() ,"https://www.facebook.com/nopCommerce");

    }


    @Then("Twitter is opened in new tab")
    public void twitterIsOpenedInNewTab() throws InterruptedException {
        ArrayList<String> tabs =new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl() ,"https://twitter.com/nopCommerce");
    }


    @Then("RSS is opened in new tab")
    public void rssIsOpenedInNewTab() throws InterruptedException {
        ArrayList<String> tabs =new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl() ,"https://demo.nopcommerce.com/new-online-store-is-open");
    }


    @Then("YouTube is opened in new tab")
    public void youtubeIsOpenedInNewTab() throws InterruptedException {
        ArrayList<String> tabs =new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertEquals(Hooks.driver.getCurrentUrl() ,"https://www.youtube.com/user/nopCommerce");
    }


}
