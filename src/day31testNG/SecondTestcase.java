package day31testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestcase {
	WebDriver driver;
  @Test(priority=0)
   void openURL()
   {
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver(); 
	  driver.get("https://admin-demo.nopcommerce.com/login");
	  }
  @Test (priority=1)
  void Login()
  {
	  WebElement email=driver.findElement(By.xpath("//input[@id='Email']"));
	  email.clear();
	  email.sendKeys("admin@yourstore.com");
	  WebElement  password=driver.findElement(By.xpath("//input[@id='Password']"));
	  password.clear();
	  password.sendKeys("admin");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  String exp_lbl=driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
	 // Assert.assertEquals(exp_lbl,"Doshboard");
			  if (exp_lbl.equals("Dashboards"))
			  {
				  System.out.println("TestPassed");
	               	Assert.assertTrue(true);
			  }
			  else
			  {
				  System.out.println("Test is failed");
			    	Assert.assertTrue(false);
			  }
			  
     }
     @Test(priority=2)
     void closeApp()
     {
	  driver.quit();
      }



}
  

