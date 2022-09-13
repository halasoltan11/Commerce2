package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @Given("user go to register page")

    public void RegisterPage()  {

        /*register.registerlink().click();
        register.genderMale().click();
        register.fNameTxtBox().clear();
        register.fNameTxtBox().sendKeys("automation");
        register.LNameTxtBox().sendKeys("tester");
        register.birthDay().click();
        register.birthMonth().click();
        register.birthYear().click();
        register.mailTxtBox().sendKeys("test1@example.com");
        register.pwTxtBox().sendKeys("P@ssw0rd");
        register.confirmPwTxtBox().sendKeys("P@ssw0rd");
        register.registerBtn().click();
        Thread.sleep(3000);
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.register.succcessMsg().isDisplayed());
        String color = register.succcessMsg().getCssValue("color");
        System.out.println("Color is : " + color);
        soft.assertEquals(color, "rgba(76, 177, 124, 1)");
        soft.assertAll();*/
        register.registerlink().click();
    }

    @When("user select gender type")
    public void selectGender()
    {
       register.genderMale().click();
    }

    @And("^user enter first name \"(.*)\" and \"(.*)\"$")
    public void enterValidFnameAndLastName(String fName ,String lName )
    {
        register.fNameTxtBox().sendKeys(fName);
        register.LNameTxtBox().sendKeys(lName);
    }

    @When("user enter date of birth")
    public void enterDateBirth()
    {
        Select select = new Select(register.birthDay());
        select.selectByIndex(10);

        select  = new Select(register.birthMonth());
        select.selectByValue("3");

        select  = new Select(register.birthYear());
        select.selectByVisibleText("1998");

    }

    @And("^user enter email \"(.*)\"$")
    public void enterValidMail(String mail)
    {
        register.mailTxtBox().sendKeys(mail);
    }
    @When("user fills Password fields")
    public void enterPWS( )  {
        register.pwTxtBox().sendKeys("P@ssw0rd");
        register.confirmPwTxtBox().sendKeys("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void clickRegisterBtn()
    {

        register.registerBtn().click();
    }
    @Then("success message is displayed")
    public void verifySuccessMsg  () throws InterruptedException {
        Thread.sleep(3000);
        String expectedMsg ="Your registration completed";
        String actualMsg = register.succcessMsg().getText();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualMsg.contains(expectedMsg));
        String color = register.succcessMsg().getCssValue("color");
        System.out.println("Color is : " + color);
        soft.assertEquals(color.contains("rgba(76, 177, 124, 1)"),true);
        soft.assertAll();
    }
}
