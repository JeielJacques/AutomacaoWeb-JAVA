package br.com.jeieljacques.core;

import br.com.jeieljacques.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static String nomeCenario;
    private static File diretorio;
    private static int numPrint;

    public static File getDiretorio() {
        return diretorio;
    }
    public static String getNomeCenario() {
        return nomeCenario;
    }
    public static void setNomeCenario(String nomeCenario) {
        Driver.nomeCenario = nomeCenario;
    }
    public Driver(Browser navegador){
        switch (navegador){
            case CHROME:
                startChrome();
                break;
            case FIREFOX:
                startFirefox();
                break;
            case IE:
                startIE();
                break;
            case SAFARI:
                startSafari();
                break;
            default:
                startEdge();
                break;
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    private static void startEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    private static void startSafari() {
        WebDriverManager.safaridriver().setup();
         driver = new SafariDriver();
    }

    private static void startIE() {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
    }

    private static void startFirefox() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        boolean headless = Boolean.parseBoolean(System.getProperty("headless"));
        firefoxOptions.setHeadless(headless);

        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    private static void startChrome() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();

        boolean headless = Boolean.parseBoolean(System.getProperty("headless"));
        chromeOptions.setHeadless(headless);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    public static WebDriver getDriver (){
        return driver;
    }

    public static void visibilityof(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static void invisibility(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void attributeChange(WebElement element, String attribute, String value){
        wait.until(ExpectedConditions.attributeContains(element, attribute, value));
    }

    public static void criaDiretorio(){
        String caminho = "src/test/resources/evidencias";
        diretorio = new File(caminho + "/" + nomeCenario);
        diretorio.mkdir();
        numPrint = 0;
    }

    public static void printSrceen(String passo) throws IOException {
        numPrint++;
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String caminho = diretorio.getPath() + "/" + numPrint + " - " + passo + ".png";
        FileUtils.copyFile(file, new File(caminho));
    }
}


