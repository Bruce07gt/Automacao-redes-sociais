import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutomacaoInstagram {

    @Test
    public void pesquisar() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "endereco ou path de onde esta salvo no computador o arquivo webdrive");
        WebDriver driver = new ChromeDriver();
        //faz o sistema esperar 10 segundos para achar os elementos
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Encontra a pagina
        driver.get("https://www.instagram.com/accounts/login/?");

        Thread.sleep(2000);
        //Encontra o campo de inserir o usuario
        WebElement cxBusca = driver.findElement(By.name("username"));
        //Click para digitar
        cxBusca.click();
        //Digita o usuario
        Thread.sleep(2000);
        cxBusca.sendKeys("email ou usuario");

        //Encontra o campo de senha
        WebElement cxSenha = driver.findElement(By.name("password"));
        cxSenha.click();
        Thread.sleep(2000);
        cxSenha.sendKeys("sua senha");
        Thread.sleep(1000);
        cxSenha.submit();

        ////Dispensa salvar login
        WebElement agoraNao = driver.findElement(By.className("cmbtv"));
        Thread.sleep(1000);
        agoraNao.click();

        //Dispensa notificacoes
        WebElement agoraNao1 = driver.findElement(By.className("_a9-z"));
        Thread.sleep(1000);
        agoraNao1.click();

        //Encontra o campo de busca para digitar
        WebElement buscaInsta = driver.findElement(By.className("_aaw9"));
        Thread.sleep(2000);
        buscaInsta.click();

        //Libera o campo para digitar a buscar
        WebElement digiBusca = driver.findElement(By.className("_aauy"));
        //Busca algum usuario
        Thread.sleep(2000);
        digiBusca.sendKeys("usuario a buscar com o @ Ex: @bruce07gt");
        Thread.sleep(1000);
        digiBusca.submit();


    }
}
