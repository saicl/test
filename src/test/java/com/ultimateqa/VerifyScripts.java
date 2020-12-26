package com.ultimateqa;

import com.saucedemo.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyScripts {
    private WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void signInCheck() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.fillSignInForm();
    }
}
