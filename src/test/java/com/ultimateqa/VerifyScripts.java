package com.ultimateqa;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.ProductsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class VerifyScripts {
    private WebDriver driver;

    String elementExistingInTheDOM = "https://the-internet.herokuapp.com/dynamic_loading/1";
    String elementRenderAfter = "https://the-internet.herokuapp.com/dynamic_loading/2";

    By locator = By.id("finish");

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
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

//    @Test
//    public void signInCheck() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.open();
////        loginPage.fillSignInForm();
//        loginPage.login("standard_user", "secret_sauce");
//    }
//
//    @Test
//    public void pressCartButton() {
//        ProductsPage productsPage = new ProductsPage(driver);
//        productsPage.openInventoryPage();
//        productsPage.goTocard();
//    }
//
//    @Test
//    public void pressCheckoutButton() {
//        CartPage cartPage = new CartPage(driver);
//        cartPage.openCartPage();
//        cartPage.pressCheckoutButton();
//    }
//
//    @Test
//    public void fillCheckoutForm() {
//        CheckoutPage checkoutPage = new CheckoutPage(driver);
//        checkoutPage.opeCheckout();
//        checkoutPage.fillCheckoutForm();
//    }
// we found element in the DOM but it was false positive
    @Test
    public void implicitWaitFindsHiddenElement() {
        driver.get(elementExistingInTheDOM);
        driver.findElement(locator);

    }

    @Test
    public void implicitWaitThrowNoSuchElementException() {
        driver.get(elementRenderAfter);
        driver.findElement(locator);

    }
// It will wait 5 seconds but element will not find as it's not rendered in HTML
    @Test
    public void configureImplicitWait() {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get(elementRenderAfter);
        driver.findElement(locator);

    }

    @Test(expected = org.openqa.selenium.TimeoutException.class)
    public void explicitWait() {
        driver.get(elementExistingInTheDOM);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
