package tests;

import AbrirNavegador.Web;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.By.linkText;

public class Paginas {

    private WebDriver navegador;

    @Test
    public void setUp() {

        navegador = Web.createChrome();

        // acessando a pagina
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marciod\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();


        navegador.get("http://automationpractice.com/index.php");



        // Escolhendo o produto e colocando no carinho
        navegador.findElement(linkText("Faded Short Sleeve T-shirts")).click();

        navegador.findElement(By.id("add_to_cart")).click();

        WebDriverWait wait = new WebDriverWait(navegador, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button.button-medium")));
        navegador.findElement(By.cssSelector(".button.button-medium")).click();


        String validaProdutoAdicionado = navegador.findElement(By.id("summary_products_quantity")).getText();
        assertEquals(validaProdutoAdicionado, "1 Product");

        navegador.findElement(linkText("Proceed to checkout")).click();





        // criando um email
        navegador.findElement(By.id("email_create")).sendKeys("marcio2@dbserver.com.br");

        navegador.findElement(By.name("SubmitCreate")).click();





        // fazendo o cdastro
        WebDriverWait wait2 = new WebDriverWait(navegador, 5);
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



    }

    @After
    public void tearDown() {
        // Fechar o navegador
        //navegador.quit();
    }
}

