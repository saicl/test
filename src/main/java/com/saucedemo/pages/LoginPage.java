package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By filedUserName = By.id("user-name");
    private By filedPassword = By.xpath("//*[@id='login-button']/../input[2]");
    private By loginButton = By.xpath("//*[@id='login-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getFiledUserName() {
        return driver.findElement(filedUserName);
    }

    private WebElement getFiledPassword() {
        return driver.findElement(filedPassword);
    }

    private WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }


    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    public void fillSignInForm() {
        getFiledUserName().sendKeys("standard_user");
        getFiledPassword().sendKeys("secret_sauce");
        getLoginButton().click();
    }

    public void login(String userName,String password){
        getFiledUserName().sendKeys(userName);
        driver.findElement(By.xpath("//*[@id='login-button']/../input[2]")).sendKeys(password);
//        driver.findElement(By.xpath("//*[@id='login-button']")).click();
        getLoginButton().click();


    }


}
