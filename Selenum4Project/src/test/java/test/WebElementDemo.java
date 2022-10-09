package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://google.com/");
		WebElement searchBox= driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium" + Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();*/
		/*
		driver.get("https://trytestingthis.netlify.app/");
		List <WebElement> select = driver.findElements(By.tagName("select"));
		for (WebElement element : select)
		{
			System.out.println(element.getText());
		}*/
		/*driver.get("https://google.com/");
		WebElement form = driver.findElement(By.tagName("form"));
		form.findElement(By.name("q")).sendKeys("ABCD" + Keys.ENTER);*//*
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		String title = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(title);*//*
		driver.get("https://google.com/");
		WebElement searchBox= driver.findElement(By.name("q"));
		String tagName = searchBox.getTagName();
	String text =	searchBox.getText();
	String cssValue =	searchBox.getCssValue("color");
	System.out.println(tagName +" | "+ text + " | "+ cssValue);*/
		driver.get("https://the-internet.herokuapp.com/checkboxes");
	WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'] )[2]"));
	System.out.println(checkbox.isEnabled());
	System.out.println(checkbox.isSelected());
		Thread.sleep(1000);
		driver.quit();

	}

}
