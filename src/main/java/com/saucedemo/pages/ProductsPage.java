package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By hamburgerMenuButton = By.xpath("//*[text()='Open Menu']");
    private By shoppingCartButton = By.xpath("//*[@data-prefix='fas']");
    private By sortingButton = By.xpath("//*[@class='product_sort_container)");
    private By backPackAddButton = By.xpath("//*[text()='29.99']/../button");

    private WebElement getHamburgerMenuButton() {
        return driver.findElement(hamburgerMenuButton);
    }

    private WebElement getShoppingCartButton() {
        return driver.findElement(shoppingCartButton);
    }

    private WebElement getShortingButton() {
        return driver.findElement(sortingButton);


    }
    private WebElement getBackPackAddButton() {
        return driver.findElement(backPackAddButton);
    }

    public void openInventoryPage(){
        driver.get("https://www.saucedemo.com/inventory.html");
    }


}
