package practice;

import java.time.Duration;
import java.util.List;

import org.bridj.cpp.std.list;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class naukri {

   public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");   
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demo.nopcommerce.com/");  String Actul_title=driver.getTitle();
   String exp_title="nonCommerce"; 
   if (Actul_title. equals(exp_title))
   {
	System.out.println("log in successful");   
   }
   else
   {
	   System.out.println("login is fail");
   }
    
   
   driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
   driver.findElement(By.xpath("//input[@id='gender-male']")).click();
  
   Thread.sleep(5000);
 
   driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("gouse");
   driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("mohammad");
   driver.findElement(By.name("Email")).sendKeys("gousemd0707@gmail.com");
   WebElement year=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
   Select ye =new Select(year);
   ye.selectByValue("1994");
   WebElement month=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
   Select mo=new Select(month);
   mo.selectByVisibleText("July");
   WebElement date=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
   Select da=new Select(date);
   da.selectByIndex(7);
   driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("viaapp private limited");
   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("gouse786");
   driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("gouse786");
   driver.findElement(By.xpath("//button[@id='register-button']")).click();
   driver.findElement(By.xpath(" //a[@class='ico-login']")).click();
   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gousemd0707@gmail.com");
   driver .findElement(By.xpath("//input[@id='Password']")).sendKeys("gouse786");
   
   driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
   List<WebElement>linkes=driver.findElements(By.tagName ("li"));
   System.out.println("Number of linkes:"+linkes.size());
  List<WebElement>images=driver.findElements(By.tagName("img"));
  System.out.println("Number of images:"+images.size());
  List<WebElement>sliders=driver.findElements(By.id("//div[@class='nivo-controlNav']"));
  System.out.println("Number of sliders:"+sliders.size());


		 
		  
		  
		  
		  
		  
		  
		  
   
   
  
  // driver.close();
   

  
	}


}


