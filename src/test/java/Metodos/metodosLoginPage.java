package Metodos;






import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodosLoginPage {
	
	WebDriver nav;
	
	
    public void abrirnavegador(String url) {
    	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
    	nav = new ChromeDriver();
    	nav.manage().window().maximize();
    	nav.get(url);
    }
    
    public void clicar(By elemento) {
    	nav.findElement(elemento).click();
    }
    //Metodo de pausar
    public void pausar(int tempo) throws InterruptedException {
    	Thread.sleep(tempo);
    }
    //Metodo de preencher
    public void preencherTexto(By elemento, String texto) {
    	nav.findElement(elemento).sendKeys(texto);
    }
    //Metodo de fechar
    public void fecharnavegador() {
    	nav.quit();
    }
    

    //validar Texto
    public void validarTexto(By elemento, String texto) {
		String mensagem = nav.findElement(elemento).getText();
	    assertEquals(texto, mensagem);

		
    }
    
    //Tirar Print
    public void tirarPrint(String nome) throws IOException {
    	TakesScreenshot print = ((TakesScreenshot)nav);
    	File SrcFile = print.getScreenshotAs(OutputType.FILE);
    	File DestFile = new File ("./src/evidencias" + nome + "png");
    	FileUtils.copyDirectory(SrcFile, DestFile);
    	
    	
    }
    	
    	
    }
