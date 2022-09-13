package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("User clicks on  search field")
    public void userClicksOnSearchField() {
        homePage.searchTxtBox().click();
    }

    @And("Search with {string}")
    public void searchWith(String ProductName) {
        homePage.searchTxtBox().sendKeys(ProductName);
    }

    @Then("User could find {string} relative results")
    public void userCouldFindRelativeResults(String ProductName) throws InterruptedException {
        Thread.sleep(1000);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="), true);
        for (int i = 0; i < homePage.products().size(); i++) {

            String value = homePage.products().get(i).getText();
            System.out.println(value.toLowerCase());

            soft.assertEquals(value.contains(ProductName), true);
            soft.assertAll();
        }

    }

    @Then("User could find {string} product details page")
    public void userCouldFindProductDetailsPage(String SKU) {
        homePage.searchBtn().click();
      int Num = homePage.productItem().size();
        System.out.println(Num);
        Assert.assertEquals(Num, 1);

       homePage.productImg().click();
       String sku = homePage.SkuValue().getText();
        System.out.println(sku);
       Assert.assertEquals(sku.contains(SKU),true);
    }
}
