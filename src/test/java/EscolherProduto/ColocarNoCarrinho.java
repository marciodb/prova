package EscolherProduto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.By.linkText;

public class ColocarNoCarrinho {

    private WebDriver navegador;

    public ColocarNoCarrinho(WebDriver navegador) {
        this.navegador = navegador;
    }



    public CriarEmail adicionarNocarrinho() {

        navegador.findElement(linkText("Faded Short Sleeve T-shirts")).click();

        navegador.findElement(By.id("add_to_cart")).click();

        WebDriverWait wait = new WebDriverWait(navegador, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button.button-medium")));
        navegador.findElement(By.cssSelector(".button.button-medium")).click();


        String validaProdutoAdicionado = navegador.findElement(By.id("summary_products_quantity")).getText();
        assertEquals(validaProdutoAdicionado, "1 Product");

        navegador.findElement(linkText("Proceed to checkout")).click();

        return new CriarEmail(navegador);
    }
}


