package com.ultimateqa;
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

public class CheckoutTest {

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


    }

    @After
    public void tearDown() {
        driver.quit();

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
