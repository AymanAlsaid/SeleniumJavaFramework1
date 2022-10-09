package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo2 {
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest ()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void googleSearch2() 
	{
		
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://google.com");
	    driver.findElement(By.name("q")).sendKeys("Automation step by step"+ Keys.ENTER);
	}
	@Test
	public void googleSearch3() 
	{
		
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://google.com");
	    driver.findElement(By.name("q")).sendKeys("Automation step by step"+ Keys.ENTER);
	}
	@AfterTest
	public void tearDownTest ()
	{
		driver.quit();
		System.out.println("Test completed successfuly");
	}

}
