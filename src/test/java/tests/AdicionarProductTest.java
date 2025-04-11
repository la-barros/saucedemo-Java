package tests;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

import pages.LoginPage;
import pages.ProductsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdicionarProductTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drive/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 800));
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void deveAdicionarProdutoAoCarrinho() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.adicionarProdutoAoCarrinho();
        productsPage.irParaOCarrinho();


        String nomeProdutoNoCarrinho = driver.findElement(By.className("inventory_item_name")).getText();
        assertEquals("Sauce Labs Backpack", nomeProdutoNoCarrinho);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}