package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChromeDemo {
	public static void main(String[] args) {
		test();
	}
 public static void test() {
	 WebDriverManager.chromedriver().setup();
	 ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("window-size=1366,768");
	 WebDriver driver = new ChromeDriver(options);
	 
	
	driver.get("https://google.com");
	
	System.out.println(driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("Automation");
	new WebDriverWait(driver, Duration.ofSeconds(10))
    .until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	driver.close();
	driver.quit();
	System.out.println("Completed");
}
}
