package com.prueba2.test2;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CuadroTxt {

	private WebDriver driver;
	By seccionEmpleos = By.linkText("Empleos");
	By SeccionEmpleosAcced = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/img");
	By Keywords = By.id("search_keywords");
	By Location = By.name("search_location");
	
	By Searhjob = By.xpath("//*[@id=\"content\"]/div/div/div/div/div/section[8]/div/div/div/div/div/div[3]/div/div/div/form/div[1]/div[4]/input");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDiriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	
	@Test
	public void testChoucairpage() throws InterruptedException {
		
		driver.findElement(seccionEmpleos).click();
		Thread.sleep(1000);
		if(driver.findElement(SeccionEmpleosAcced).isDisplayed()) {
			driver.findElement(Keywords).sendKeys("Analista");
			driver.findElement(Location).sendKeys("Medellin");
			
			driver.findElement(Searhjob).click();
		}
		else {
			System.out.print("Sección de Emplos no encontrado");
		}

		
		
	}
	
	
}
