package com.ultimateqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageObject {
    private WebDriver driver;
    private By continueShoppingButtonLocator =By.className("btn_secondary");
    private By checkoutButtonLocator = By.xpath("//*[@href='./checkout-step-one.html']");



    public CartPageObject(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getContinueShoppingButton() {
        return driver.findElement(continueShoppingButtonLocator);
    }

    private WebElement getCheckoutButton() {
        return driver.findElement(checkoutButtonLocator);
    }

    public void open(){
        driver.navigate().to("https://www.saucedemo.com/cart");
    }


    public void clickByContinueShoppingButton(){
        getContinueShoppingButton().click();
    }

    public void clickByCheckoutButton(){
        getCheckoutButton().click();
    }



}
