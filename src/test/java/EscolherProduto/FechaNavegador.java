package EscolherProduto;

import org.openqa.selenium.WebDriver;

public class FechaNavegador {
    private WebDriver navegador;



    public FechaNavegador(WebDriver navegador) {

        this.navegador = navegador;
    }

    public void TesteFinalizado() {

         navegador.quit();

        }
    }
