package com.ultimateqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


    private WebDriver driver;
    private By userNameFieldLocator =By.id("user-name");
    private By userPasswordFieldLocator =By.id("password");
    private By userLoginButtonLocator =By.className("btn_action");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getUserNameField() {
        return driver.findElement(userNameFieldLocator);
    }

    private WebElement getUserPasswordField() {
        return driver.findElement(userPasswordFieldLocator);
    }

    private WebElement getLoginButton() {
        return driver.findElement(userLoginButtonLocator);
    }

    public void login() {
        getUserNameField().sendKeys("standard_user");
        getUserPasswordField().sendKeys("secret_sauce");
        getLoginButton().click();

    }
}
