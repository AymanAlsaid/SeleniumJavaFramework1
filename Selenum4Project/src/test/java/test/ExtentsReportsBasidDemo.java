package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentsReportsBasidDemo {
	WebDriver driver = null;

	public static void main(String[] args) {
		
	   ExtentReports extent = new ExtentReports();
	   ExtentHtmlReporter spark = new ExtentHtmlReporter("extentReports.html");
	   extent.attachReporter(spark);
	   ExtentTest test1 = extent.createTest("Google Search Test One","This is a test to validate google search functionality");
	   WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	   
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://google.com");
	    test1.pass("Navigated to google.com");
	    test1.log(Status.INFO, "Starting Test Case");
	  
	    driver.findElement(By.name("q")).sendKeys("Automation step by step");
	    test1.pass("Entered text in search box");
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    test1.pass("Pressed keyboard enter key");
	    driver.close();
	    driver.quit();
	    test1.pass("Closed the browser");
	    test1.info("Test completed");
	    
	    ExtentTest test2 = extent.createTest("Google Search Test Two","This is a test to validate google search functionality");
		   WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		   
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get("https://google.com");
		    test2.pass("Navigated to google.com");
		    test2.log(Status.INFO, "Starting Test Case");
		  
		    driver.findElement(By.name("q")).sendKeys("Automation step by step");
		    test2.pass("Entered text in search box");
		    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		    test2.fail("Pressed keyboard enter key");
		    driver.close();
		    driver.quit();
		    test2.pass("Closed the browser");
		    test2.info("Test completed");
	    extent.flush();
	    
	}

}
