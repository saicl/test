package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    private By continueShoppingButton = By.xpath("//*[text()='Continue Shopping']");
    private By checkoutButton = By.xpath("//*[text()='CHECKOUT']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getContinueShoppingButton() {
        return driver.findElement(continueShoppingButton);
    }

    private WebElement getCheckoutButton() {
        return driver.findElement(checkoutButton);
    }

    public void openCartPage() {
        driver.get("https://www.saucedemo.com/cart");
    }

    public void pressCheckoutButton() {
        getCheckoutButton().click();
    }
}
