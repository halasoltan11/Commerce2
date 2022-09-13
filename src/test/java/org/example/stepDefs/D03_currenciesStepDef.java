package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();

    @Given("user select EURO from list")
    public  void selectEuroCurrency()
    {
        homePage.euroOption().click();
    }


    @Then("All produucts soould be displayed with Euro Symbol")
    public void allProduuctsSoouldBeDisplayedWithEuroSymbol() {
        for (int i = 0; i< homePage.prices().size() ; i++)
        {

         String value =homePage.prices().get(i).getText();
            System.out.println(value);

            Assert.assertEquals(value.contains("€") , true);

        }
    }



}
