package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main (String []args ) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		 driver.findElement(By.id("//input[@id='qsb-keyskill-sugg']")).sendKeys("selenium");
		  
	}

}
