package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//js alert
		driver.findElement(By.xpath("//button[@onClick='jsAlert()']")).click();
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		Thread.sleep(2000);
		alert1.accept();
		if (driver.getPageSource().contains("You successfully clicked an alert"))
		{
			System.out.println("You successfully clicked an alert");
		}
		System.out.println("==================================");
		//js confirm 
		driver.findElement(By.xpath("//button[@onClick='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		
		System.out.println(alert2.getText());
		Thread.sleep(2000);
		alert2.dismiss();
		if (driver.getPageSource().contains("You clicked: Cancel"))
		{
			System.out.println("You clicked: Cancel");
		}
		System.out.println("==================================");
	//	js Prompt
		driver.findElement(By.xpath("//button[@onClick='jsPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Automation step by step...");
		Thread.sleep(2000);
		alert3.accept();
		if (driver.getPageSource().contains("You entered: Automation step by step..."))
			System.out.println("You entered: Automation step by step...");


	//	driver.close();
		driver.quit();
	}
 
}
