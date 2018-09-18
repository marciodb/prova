package paginas;

import AbrirNavegador.Web;
import EscolherProduto.ColocarNoCarrinho;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PageObjectsTest {

    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createChrome();
    }

    @Test
    public void PageObjectsTest() {
        new ColocarNoCarrinho(navegador)
                .adicionarNocarrinho()
                .typeEmail()
                .preencherFormulario()
                .aceitaTermo()
                .aceitarTermoDeCompra()
                .validarTotalDaCompra()
                .ConfirmarPagamento()
                .FimDoPagamento()
                .TesteFinalizado();


    }

}