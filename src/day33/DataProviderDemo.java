package day33;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@BeforeClass
	void Setup()
	{
		System.setProperty("","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		}
	@Test(dataProvider="dp") 
	void testLogin(String user,String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.id("Email")).sendKeys("user");
		driver.findElement(By. id("Password")).sendKeys("pwd");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String Exp_title="nonCommerce demoStore";
		String Act_title =driver.getTitle();
		Assert.assertEquals(Exp_title,Act_title);
		
	}
 @DataProvider(name="dp")
 String[][] loginData() 
 {
	 String data[][]={
	 {"gowse.mohammad786@gmail.com","994929"},
	 {"gowse.mohamad786@gmail.com","994929"},
	 {"gowe.mohammad786@gmail.com","994929"},
	 {"gowse.mohammad786@gmail.com","994929"}
 };
	 

 {
	 
 }
return data;
 
 }
@AfterClass
void tearDown()
{
	driver.quit();
}
}