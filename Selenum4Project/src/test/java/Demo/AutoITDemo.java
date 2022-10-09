package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	
	public static void test() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://filebin.net/");
		/*new WebDriverWait(driver, Duration.ofSeconds(20))
	    .until(ExpectedConditions.elementToBeClickable(By.name("userfile")));*/
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//input[@type='file']"))).click().build().perform();
		
		//driver.findElement(By.name("userfile")).click();
		Runtime.getRuntime().exec("E:\\Autoid\\Scripts\\FileUploadScript.exe");
		Thread.sleep(3000);
		//driver.close();
	}

}
