package TestNGpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	@Test(priority=1)
	void OpenApp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
			
	}
	@Test(priority=2)
	void login()
	{
     WebDriver driver=new ChromeDriver();
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(" Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	@Test(priority=3)
	void logout()
	{
		WebDriver driver =new ChromeDriver();
		WebElement logout=driver.findElement(By.xpath(" "))
	}
	
	

}
