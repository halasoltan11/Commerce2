package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("User click on wishlist button ❤️ on this product {string}")
    public void userClickOnWishlistButton️OnThisProduct(String arg0) {
        homePage.WishBtn().click();

    }

    @Then("you will see success message {string} with green background color")
    public void youWillSeeSuccessMessageWithGreenBackgroundColor(String arg0) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.WishMsg().isDisplayed());
        String color = homePage.WishMsg().getCssValue("background-color");
        System.out.println(color);
        int r = 75;
        int g = 176;
        int b = 122;
        String hex = String.format("#%02X%02X%02X", r, g, b);
        System.out.println(hex);
        Assert.assertEquals(hex ,"#4BB07A");
    }


    @And("Click on Wishlist Tab")
    public void clickOnWishlistTab() throws InterruptedException {
        Thread.sleep(6000);
        homePage.WishTab().click();

    }

    @Then("Observe the Qty value and verify it's bigger than {int}")
    public void observeTheQtyValueAndVerifyItSBiggerThan(int arg0) {
        int val =Integer.parseInt(homePage.QtyVal().getAttribute("value"));
        Assert.assertEquals(val ,1);
    }


}
