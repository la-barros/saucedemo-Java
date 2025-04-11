package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

        private WebDriver driver;

        private By botaoAddAoCarrinho = By.id("add-to-cart-sauce-labs-backpack");
        private By botaoRemove = By.id("remove-sauce-labs-backpack");
        private By botaoCarrinho = By.className("shopping_cart_link");

        public ProductsPage(WebDriver driver) {
            this.driver = driver;
        }

        public void adicionarProdutoAoCarrinho() {
            driver.findElement(botaoAddAoCarrinho).click();
        }

        public boolean produtoFoiAdicionado() {
            return driver.findElement(botaoRemove).isDisplayed();
        }

        public void irParaOCarrinho() {
            driver.findElement(botaoCarrinho).click();
        }
    }


