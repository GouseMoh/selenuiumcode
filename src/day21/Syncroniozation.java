package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syncroniozation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement (By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();
		driver.quit();
	}

}
