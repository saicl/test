import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginFeatureTest {


    private WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPageObject CartPageObject;

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
//        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();

    }

    @Test
    public void productsPageTest() {
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
//        ProductsPage productsPage = new ProductsPage(driver);
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
//        CartPageObject cartPageObject = new CartPageObject(driver);
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
