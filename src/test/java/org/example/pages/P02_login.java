package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {


    public WebElement loginlink()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
    }

    public WebElement mailTxtBox()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='Email']"));
    }
    public WebElement PwTxtbox()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='Password']"));
    }

    public WebElement loginbtn()
    {
        return Hooks.driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
    }

    public WebElement myAccountLabel()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }

    public WebElement errorLoginMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class='message-error validation-summary-errors']"));
    }
}
