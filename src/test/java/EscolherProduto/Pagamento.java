package EscolherProduto;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Pagamento  {
    private WebDriver navegador;

    public Pagamento(WebDriver navegador) {
        this.navegador = navegador;
    }


    public SelecionePagamento validarTotalDaCompra() {

        String valorTotal = navegador.findElement(By.id("total_price")).getText();

        assertEquals(valorTotal, "$18.51");




        return new SelecionePagamento(navegador);
    }



}
