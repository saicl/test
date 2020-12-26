package com.ultimateqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;
    private By fieldFirstName = By.id("first-name");
    private By fieldLastName = By.id("last-name");
    private By fieldZipCode = By.id("postal-code");
    private By cancelButton = By.xpath("//*[text()='CANCEL']");
    private By continueButton = By.xpath("//*[@class='checkout_buttons']/input");
    private By finishButton = By.xpath("//*[@href='./checkout-complete.html']");
//    private By ponyImage = By.className(".pony_express");
    private By ponyImage = By.xpath("//*[@class='complete-header']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSuccessful(){
        return driver.findElement(ponyImage).isDisplayed();
    }

    public WebElement getPonyImage() {
        return driver.findElement(ponyImage);
    }

    private WebElement getFieldFirstName() {
        return driver.findElement(fieldFirstName);
    }

    private WebElement getFieldLastName() {
        return driver.findElement(fieldLastName);
    }

    private WebElement getFieldZipCode() {
        return driver.findElement(fieldZipCode);
    }

    private WebElement getCancelButton() {
        return driver.findElement(cancelButton);
    }

    private WebElement getContinueButton() {
        return driver.findElement(continueButton);
    }

    private WebElement getFinishButton() {
        return driver.findElement(finishButton);
    }

    public void pressCancelButton() {
        getCancelButton().click();
    }

    public void pressContinueButton() {
        getContinueButton().click();
    }

    public void pressFinishButton() {
        getFinishButton().click();
    }

    public void open() {
        driver.get("https://www.saucedemo.com/checkout-step-one.html");
    }

    public void enterForm() {
        getFieldFirstName().sendKeys("One");
        getFieldLastName().sendKeys("two");
        getFieldZipCode().sendKeys("tww");
    }
}
