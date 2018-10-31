package EscolherProduto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelecionePagamento {

    private WebDriver navegador;

    public SelecionePagamento(WebDriver navegador) {

        this.navegador = navegador;
    }

    public ConfirmarOrdemPagamento ConfirmarPagamento() {

        navegador.findElement(By.cssSelector("p.payment_module a.bankwire")).click();

        return  new ConfirmarOrdemPagamento(navegador);
    }


}

