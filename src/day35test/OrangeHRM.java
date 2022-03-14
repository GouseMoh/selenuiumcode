package day35test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import day35.LoginPage;

public class OrangeHRM {
	WebDriver driver;
	LoginPage lp;
	
	@BeforeClass
	
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 lp=new LoginPage(driver);
	}
	@Test(priority=1)
	void test_logo()
	{
		
		boolean st=lp.cheaklogoPresence();
	    Assert.assertEquals(st,true);
	}
	@Test(priority=2)
   void test_login()
   {
	lp.setusername("Admin");
	lp.setpassword("admin123");
	lp.clicklogin();
	Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	   }
@AfterClass
void tearDown()
{
	driver.quit();
}
}
