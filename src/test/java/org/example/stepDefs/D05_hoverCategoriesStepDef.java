package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    String subCat;
    @When("user hoover on any Main category then select the sub")
    public void userHooverOnAnyMainCategoryThenSelectTheSub() {
        List<WebElement> categories = Hooks.driver.findElements(By.cssSelector("ul[class='top-menu notmobile']>li>a[href]"));
        int randomNumber = new Random().nextInt(3);
        Actions hooover = new Actions(Hooks.driver);
        hooover.moveToElement(categories.get(randomNumber)).perform();
        String mainCategory = categories.get(randomNumber).getText();
        System.out.println(mainCategory);
        List<WebElement> SubCategories =Hooks.driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li["+(randomNumber+1)+"]/ul[@class='sublist first-level']/li"));
        int SubrandomNumber =  new Random().nextInt(3);
         subCat = SubCategories.get(SubrandomNumber).getText();
        System.out.println(subCat);

        SubCategories.get(SubrandomNumber).findElement(By.tagName("a")).click();
    }

    @Then("Page is displayed with the title which user select")
    public void pageIsDisplayedWithTheTitleWhichUserSelect() {

        String pageTitle = Hooks.driver.findElement(By.xpath("//h1")).getText();
        Assert.assertTrue(pageTitle.contains(subCat));
    }
}
