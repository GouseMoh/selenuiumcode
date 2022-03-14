package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsingcommands {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" http://automationpractice.com/index.php");
	
	driver.findElement(By.linkText("//li[@class='facebook']//a[@target='_blank']")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	driver.close();
	driver.quit();
	
	

	}

}
