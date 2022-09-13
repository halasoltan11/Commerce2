package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public List<WebElement> prices()

    {
        List<WebElement> prices = Hooks.driver.findElements(By.xpath("//span[@class='price actual-price']"));
        return prices;
    }
    public WebElement euroOption()
    {
        return Hooks.driver.findElement(By.xpath("//select[@id='customerCurrency']/option[2]"));
    }

    public WebElement searchTxtBox()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='small-searchterms']"));
    }

    public WebElement searchBtn()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
    }

    public List<WebElement> products()

    {
        List<WebElement> products = Hooks.driver.findElements(By.xpath("h2[class='product-title']"));
        return products;
    }

    public List<WebElement> productItem()
    {
       List <WebElement> productItem =Hooks.driver.findElements(By.xpath("//div[@class='product-item']"));
       return productItem;
    }

    public WebElement productImg()
    {
        return Hooks.driver.findElement(By.cssSelector(".picture img"));
    }

    public WebElement SkuValue()
    {
        return Hooks.driver.findElement(By.xpath("//div[@class='sku']"));
    }


    public WebElement sliderNokia()
    {
        return Hooks.driver.findElement(By.xpath("//a[@class='nivo-control']"));
    }

    public WebElement sliderIphone()
    {
        return Hooks.driver.findElement(By.linkText("2"));
    }

    /* public List<WebElement> categories()
    {
        List <WebElement> categories =Hooks.driver.findElements(By.cssSelector("ul[class='top-menu mobile']>li>a[href]"));
        return categories;
    }*/

   /* public List<WebElement> subCategories(int randomNumber)
    {
        List <WebElement> subCategories =Hooks.driver.findElements(By.xpath("//ul[@class='top-menu mobile']/li["+randomNumber+"]/ul[@class='sublist first-level']/li"));
        return subCategories;
    }*/

    public WebElement FbLink()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));
    }

    public WebElement twitterLink()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Twitter')]"));
    }
    public WebElement rssLink()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'RSS')]"));
    }
    public WebElement uTubeLink()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'YouTube')]"));
    }
    public WebElement WishBtn()
    {
        return Hooks.driver.findElement(By.cssSelector(".item-box:nth-child(3) .add-to-wishlist-button"));
    }
    public WebElement WishMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement WishTab()
    {
        return Hooks.driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]"));
    }
    public WebElement QtyVal()
    {
        return Hooks.driver.findElement(By.xpath("//input[@class='qty-input']"));
    }

    public WebElement MainCateg()
    {
        return Hooks.driver.findElement(By.cssSelector(".notmobile > li:nth-child(1) > a"));
    }
    public WebElement subCateg()
    {
        return Hooks.driver.findElement(By.xpath("//li/ul/li[3]/a"));
    }
}
