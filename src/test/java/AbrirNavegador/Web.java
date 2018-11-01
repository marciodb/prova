package AbrirNavegador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome() {

        //Abre o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marciod\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\marciod\\Downloads\\geckodriver-v0.22.0-win64\\geckodriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para uma página
        navegador.manage().window().maximize();
        navegador.get("http://automationpractice.com/index.php");

        return navegador;
    }
}
