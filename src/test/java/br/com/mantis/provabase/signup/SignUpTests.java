package br.com.mantis.provabase.signup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.time.Duration;

@DisplayName("Testes da Funcionalidade SignUp")

public class SignUpTests {
    @Test
    @DisplayName("Registrar um novo usuário com Dados Válidos")
    public void testRegisterNewUserWithValidData(){

        //Abrir o navegador Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        //Abrir o sistema mantis
        navegador.get("https://mantis-prova.base2.com.br/");

        //Vou digitar o nome no input id username
        navegador.findElement(By.id("username")).sendKeys("Tiago_Rodrigues");
        //Clicar no botão entrar
        navegador.findElement(By.cssSelector("input[value='Entrar']")).click();

        //Vou digitar a senha no input id password
        navegador.findElement(By.id("password")).sendKeys("Tmiq!2024");
        //Clicar no botão entrar
        navegador.findElement(By.cssSelector("input[value='Entrar']")).click();

        //Validar se o texto o nome do usuário apareceu o elemento com a class igual a user-info
        String greeting = navegador.findElement(By.className("user-info")).getText();
        Assertions.assertEquals("Tiago_Rodrigues",greeting);

        navegador.quit();
    }
}
