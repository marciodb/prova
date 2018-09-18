package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web {
    public static final String USERNAME = "marcio51";
    public static final String AUTOMATE_KEY = "BMRLsbTwG6gWVppzzSUu";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver createChrome() {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\marciod\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //script para esperar apareceer algum elemento na pagina
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a página do taskit
        navegador.get("http://automationpractice.com/index.php?");

        return navegador;
    }

    public static WebDriver createBrowserStack() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "60.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1280x800");
        caps.setCapability("browsersstack.debug", "true");

        WebDriver navegador = null;

        try {
            navegador = new RemoteWebDriver(new URL(URL), caps);
            navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            //Navegando para a página do taskit
            navegador.get("http://automationpractice.com/index.php?");
        } catch (MalformedURLException e) {
            System.out.println("Houveram problemas com a URL; " +e.getMessage());
        }



        return navegador;
    }
}
