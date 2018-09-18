package EscolherProduto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmaCompra {

    private WebDriver navegador;

    public ConfirmaCompra(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Checkout aceitaTermo() {

        WebDriverWait wait = new WebDriverWait(navegador, 5);
        navegador.findElement(By.name("processAddress")).click();



        return new Checkout(navegador);
    }


}
