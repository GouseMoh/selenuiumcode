package Locatorsexamples;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)//chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.guitarstore.in/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("My Account")).click();
   // driver.findElement(By.cssSelector("input#reg_username")).sendKeys("gouse");
    //driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("gousemd0707@gmail.com");
    //driver.findElement(By.id("reg_email")).sendKeys("gousemd0707@gmail.com");
   // driver.findElement(By.cssSelector("#reg_password")).sendKeys("anvar@7854");
    //driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
    //driver.findElement(By.xpath("//input[@id='username']"))
   // driver.findElement(By.xpath("//input[@id=\"userame\"]")).sendKeys("gouse");
    //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("anvar@7854");
    driver.close();
    
    
    
   
    
   
}
}

  
   
 
	


