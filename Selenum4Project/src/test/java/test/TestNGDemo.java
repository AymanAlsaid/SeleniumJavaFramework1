package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {
	WebDriver driver = null;
public static String browserName =null ;
	@BeforeTest
	public void setUpTest ()
	{
		PropertiesFile.getProperties(); 
		if (browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	@Test
	public void googleSearch() 
	{
		
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://google.com");
	    driver.findElement(By.name("q")).sendKeys("Automation step by step"+ Keys.ENTER);
	}
	@AfterTest
	public void tearDownTest ()
	{
		driver.close();
		//driver.quit();
		System.out.println("Test completed successfuly");
		PropertiesFile.setProperties();
	}

}
