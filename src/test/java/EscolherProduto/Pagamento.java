package EscolherProduto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class Pagamento  {
    private WebDriver navegador;

    public Pagamento(WebDriver navegador) {
        this.navegador = navegador;
    }


    public SelecionePagamento validarTotalDaCompra() {

        String valorTotal = navegador.findElement(By.id("total_price")).getText();

        assertEquals(valorTotal, "$18.51");

        System.out.println("O valor está correto, $18.51 ");




        return new SelecionePagamento(navegador);
    }



}
