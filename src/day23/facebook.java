package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	private Object sendKeys;

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe ");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().equals(Duration.ofSeconds(10));
	driver.get("https://www.google.co.in/");
	 driver.findElement(By.name("q")).sendKeys("facebook");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	driver.findElement(By.xpath("//h3[normalize-space()='Facebook - Log In or Sign Up']")).click();
	driver.findElement(By.cssSelector("input#email")).sendKeys("gowse.mohammad786@gmail.com");
	
	
	
	}

}
