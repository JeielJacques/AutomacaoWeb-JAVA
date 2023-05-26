package br.com.jeieljacques.automacaoweb;

import br.com.jeieljacques.core.Driver;
import br.com.jeieljacques.pages.CursoPage;
import br.com.jeieljacques.pages.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    Driver driverWeb;
    WebDriver driver;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("edge");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }

    @Test
    public void primeiroTeste(){

        String titulo = principalPage.getTitulo();
        assertEquals("Porque Tempo É Conhecimento.", titulo);

    }

    @Test
    public void segundoTeste(){

        cursoPage = new CursoPage(driver);
        principalPage.clickBotao();
        String titulo = cursoPage.getTitulo2();
        assertEquals("Conheça todos os nossos cursos.", titulo );
    }
    @After
    public void finalizaTeste(){

        driver.quit();

    }
}
