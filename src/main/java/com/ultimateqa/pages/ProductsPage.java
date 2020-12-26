package com.ultimateqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {



    private By backPackLocator = By.xpath("//*[text()='29.99']/../button");
    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBackPack() {
        return driver.findElement(backPackLocator);
    }

    public void  addToBasket() {
        getBackPack().click();
    }
}
