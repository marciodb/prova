package EscolherProduto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarEmail {
    private WebDriver navegador;

    public CriarEmail(WebDriver navegador) {
        this.navegador = navegador;

    }

    public FazerCadastro typeEmail() {
        navegador.findElement(By.id("email_create")).sendKeys(EmailAleatorio.getSaltString()+"@gmail.com");

        navegador.findElement(By.name("SubmitCreate")).click();

        return new FazerCadastro(navegador);
    }
}
