package TestNGpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VCenter {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.guitarstore.in/");
	driver.manage().window().maximize(); 
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("guitar");
	driver.findElement(By.xpath("//i[@class='ec ec-search']")).click();
		

	}

}
