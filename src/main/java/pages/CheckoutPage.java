package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;


    private By campoNome = By.id("first-name");
    private By campoSobrenome = By.id("last-name");
    private By campoCEP = By.id("postal-code");
    private By botaoContinue = By.id("continue");
    private By botaoFinish = By.id("finish");


    private By mensagemSucesso = By.className("complete-header");

    // Construtor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }


    public void preencherInformacoes(String nome, String sobrenome, String cep) {
        driver.findElement(campoNome).sendKeys(nome);
        driver.findElement(campoSobrenome).sendKeys(sobrenome);
        driver.findElement(campoCEP).sendKeys(cep);
    }

    public void continuarCheckout() {
        driver.findElement(botaoContinue).click();
    }

    public void finalizarCompra() {
        driver.findElement(botaoFinish).click();
    }


    public String obterMensagemSucesso() {
        return driver.findElement(mensagemSucesso).getText();
    }
}
