package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;
public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user go to login page")
    public  void accessLoginPage()
    {
        login.loginlink().click();
    }

    @When("^user login \"(.*)\" and \"(.*)\"$")
    public void entervalidUnAndPw(String userName , String pW)
    {
        login.mailTxtBox().sendKeys(userName);
        login.PwTxtbox().sendKeys(pW);
    }

    @And("user press on login button")
    public void clickLoginBtn() throws InterruptedException {

        login.loginbtn().click();
        Thread.sleep(3000);
    }
    @Then("user login to the system successfully")
    public void successLogin()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        soft.assertTrue(login.myAccountLabel().isDisplayed());
        soft.assertAll();
    }


    @Then("user could not login to the system")
    public void failToLogin()
    {
        SoftAssert soft = new SoftAssert();
        String errorExpectedMsg = "Login was unsuccessful.";
        String actualErrorMsg = login.errorLoginMsg().getText();
        soft.assertTrue(actualErrorMsg.contains(errorExpectedMsg));
        String color = login.errorLoginMsg().getCssValue("color");
        System.out.println("Color is : " + color);
        soft.assertEquals(color.contains("228, 67, 75, 1"),true);
        soft.assertAll();
    }


}
