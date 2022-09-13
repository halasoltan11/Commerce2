package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_register {


    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
    }



    public WebElement genderMale()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='gender-male']"));
    }

    public WebElement fNameTxtBox()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='FirstName']"));
    }

    public WebElement LNameTxtBox()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='LastName']"));
    }

    public WebElement birthDay()
    {
        return Hooks.driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
    }

    public WebElement birthMonth()
    {
        return Hooks.driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
    }

    public WebElement birthYear()
    {
        return Hooks.driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
    }

    public WebElement mailTxtBox()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='Email']"));
    }

    public WebElement pwTxtBox()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='Password']"));
    }


    public WebElement confirmPwTxtBox()
    {
        return Hooks.driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
    }

    public WebElement registerBtn()
    {
        return Hooks.driver.findElement(By.xpath("//button[@id='register-button']"));
    }
    public WebElement succcessMsg()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class='result']"));
    }



}
