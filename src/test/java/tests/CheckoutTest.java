package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

import static org.junit.Assert.assertTrue;

public class CheckoutTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drive/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void deveFinalizarCompraComSucesso() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        ProductsPage produtos = new ProductsPage(driver);
        produtos.adicionarProdutoAoCarrinho();
        produtos.irParaOCarrinho();


        driver.findElement(org.openqa.selenium.By.id("checkout")).click();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.preencherInformacoes("Maria", "Silva", "123456");
        checkout.continuarCheckout();
        checkout.finalizarCompra();


         assertTrue(driver.getPageSource().contains("Thank you for your order!"));
    }

    @After
    public void tearDown() {
        if (driver != null);
            driver.quit();
    }
}
