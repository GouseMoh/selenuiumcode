package day_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findwebelements {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
	    driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9949298197");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gouse786");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	    
	    
	    
	    
		
	}
}
