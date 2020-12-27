package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;
    private By filedFirstName = By.id("first-name");
    private By filedLastName = By.id("last-name");
    private By filedZipCode = By.id("last-name");
    private By buttonContinue = By.xpath("//*[@value='CONTINUE']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getFiledFirstName() {
        return driver.findElement(filedFirstName);
    }

    private WebElement getFiledLastName() {
        return driver.findElement(filedLastName);
    }

    private WebElement getFiledZipCode() {
        return driver.findElement(filedZipCode);
    }

    private WebElement getButtonContinue() {
        return driver.findElement(buttonContinue);
    }

    public void opeCheckout(){
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
    }

    public void fillCheckoutForm(){
        getFiledFirstName().sendKeys("z");
        getFiledLastName().sendKeys("dd");
        getFiledZipCode().sendKeys("zzz");
    }


}
