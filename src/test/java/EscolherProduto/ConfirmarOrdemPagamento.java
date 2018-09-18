package EscolherProduto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmarOrdemPagamento {

    private WebDriver navegador;

    public ConfirmarOrdemPagamento(WebDriver navegador) {

        this.navegador = navegador;
    }

    public FechaNavegador FimDoPagamento() {

        navegador.findElement(By.cssSelector(".cart_navigation .button-medium span")).click();

        return new FechaNavegador(navegador);
    }
}
