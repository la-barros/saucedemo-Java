package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drive/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200, 800));
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void LoginComSucesso() {
        loginPage.login("standard_user", "secret_sauce");


        // Valida o título da página após login
        assertEquals("Swag Labs", driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
