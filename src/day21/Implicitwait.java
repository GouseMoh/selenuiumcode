package day21;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	//driver.findElement(By.cssSelector("div[class=\"tile-title title-ltr\"]")).click();
	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys(Keys.RETURN);
	
	driver.findElement(By.cssSelector("h3[class=\"LC20lb MBeuO DKV0Md\"]")).click();
     
	

	

}
}
