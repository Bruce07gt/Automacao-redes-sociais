import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class AutomacaoYoutube {

    @Test
    public void pesquisar() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bruci\\Documents\\Repositorio Exercicios\\Automac\\src\\drive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.youtube.com/");

        WebElement cxBusca = driver.findElement(By.name("search_query"));
        cxBusca.click();
        cxBusca.sendKeys("bruce07gt");
        cxBusca.submit();

        WebElement clickVideo = driver.findElement(By.id("video-title"));
        clickVideo.click();

    }
}
