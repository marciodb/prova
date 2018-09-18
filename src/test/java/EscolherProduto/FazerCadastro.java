package EscolherProduto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FazerCadastro {
    private WebDriver navegador;

    public FazerCadastro(WebDriver navegador) {
        this.navegador = navegador;
    }

    public ConfirmaCompra preencherFormulario() {

        WebDriverWait wait = new WebDriverWait(navegador, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
        navegador.findElement(By.id("id_gender1")).click();

        navegador.findElement(By.id("customer_firstname")).sendKeys("Marcio");

        navegador.findElement(By.id("customer_lastname")).sendKeys("Dutra");

        navegador.findElement(By.id("passwd")).sendKeys("051080");

        WebElement campoDay = navegador.findElement(By.id("days"));
        new Select(campoDay).selectByValue("5");

        WebElement campoMes = navegador.findElement(By.id("months"));
        new Select(campoMes).selectByVisibleText("May ");

        WebElement campoAno = navegador.findElement(By.id("years"));
        new Select(campoAno).selectByVisibleText("2018  ");

        navegador.findElement(By.id("company")).sendKeys("DBServer");

        navegador.findElement(By.id("address1")).sendKeys("Av. Ipiranga, 6681");

        navegador.findElement(By.id("address2")).sendKeys("Predio 99A");

        navegador.findElement(By.id("city")).sendKeys("Atlanta");

        WebElement campoEstado = navegador.findElement(By.id("id_state"));
        new Select(campoEstado).selectByVisibleText("Georgia");

        navegador.findElement(By.id("postcode")).sendKeys("30301");

        WebElement campoPais = navegador.findElement(By.id("id_country"));
        new Select(campoPais).selectByVisibleText("United States");

        navegador.findElement(By.id("other")).sendKeys("Testando ");

        navegador.findElement(By.id("phone")).sendKeys("555199+5245878");

        navegador.findElement(By.id("phone_mobile")).sendKeys("555199+995874");

        navegador.findElement(By.id("alias")).clear();

        navegador.findElement(By.id("alias")).sendKeys("marcion@dbserver.com.br");

        navegador.findElement(By.id("submitAccount")).click();

        return new ConfirmaCompra(navegador);

    }
}
