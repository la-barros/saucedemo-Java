package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By campoUserName = By.id("user-name");
    private By campoPassword = By.id("password");
    private By btnLogin = By.id("login-button");


    public void preencherUsuario(String usuario) {
        driver.findElement(campoUserName).sendKeys(usuario);
    }

    public void preencherSenha(String senha) {
        driver.findElement(campoPassword).sendKeys(senha);
    }

    public void clicarLogin() {
        driver.findElement(btnLogin).click();
    }

    public void login(String usuario, String senha) {
        preencherUsuario(usuario);
        preencherSenha(senha);
        clicarLogin();
    }
}

