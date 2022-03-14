package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
	
	
	
	
	driver.quit();
	}

}
