package com.ultimateqa;

import com.ultimateqa.pages.CartPageObject;
import com.ultimateqa.pages.CheckoutPage;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.pages.ProductsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginFeatureTest {


    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private com.ultimateqa.pages.CartPageObject CartPageObject;

    @BeforeClass
    public static void beforeClass(){
        WebDriverManager.chromedriver().setup();




    }

    @Before
    public void setUp()  {
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         loginPage = new LoginPage(driver);
         productsPage = new ProductsPage(driver);
         CartPageObject = new CartPageObject(driver);


    }

    @After
    public void tearDown() {
        driver.quit();

    }

    @Test
    public void shouldlogin() {

        driver.navigate().to("https://www.saucedemo.com/");
//        com.ultimateqa.pages.LoginPage loginPage = new com.ultimateqa.pages.LoginPage(driver);
        loginPage.login();

    }

    @Test
    public void productsPageTest() {
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
//        com.ultimateqa.pages.ProductsPage productsPage = new com.ultimateqa.pages.ProductsPage(driver);
        productsPage.addToBasket();
    }


    @Test
    public void test4() {

        CartPageObject.open();
        CartPageObject.clickByContinueShoppingButton();
    }
    @Test
    public void test5() {
//        driver.navigate().to("https://www.saucedemo.com/cart");
         CartPageObject.open();
//        com.ultimateqa.pages.CartPageObject cartPageObject = new com.ultimateqa.pages.CartPageObject(driver);
        CartPageObject.clickByCheckoutButton();
    }


    @Test
    public void test6() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.open();
        checkoutPage.enterForm();
        checkoutPage.pressContinueButton();
        checkoutPage.pressFinishButton();

    }
}
