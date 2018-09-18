package EscolherProduto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkout {

    private WebDriver navegador;

    public Checkout(WebDriver navegador) {

        this.navegador = navegador;


    }

        public Pagamento aceitarTermoDeCompra() {

            WebDriverWait wait2 = new WebDriverWait(navegador, 5);
            wait2.until(ExpectedConditions.elementToBeClickable(By.id("uniform-cgv")));
            navegador.findElement(By.id("uniform-cgv")).click();

            navegador.findElement(By.name("processCarrier")).click();

            return new Pagamento (navegador);

        }
}
