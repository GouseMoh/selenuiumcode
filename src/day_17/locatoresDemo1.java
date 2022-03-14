package day_17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locatoresDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();
	    driver.findElement(By.id("searchSystemUser_userName")).sendKeys("gouse");
	    WebElement dropuserrule = driver.findElement(By.name("searchSystemUser[userType]"));
	    Select dropuser =new Select(dropuserrule);
	    dropuser.selectByVisibleText("ESS");
	    driver.findElement(By.xpath("//input[@id='searchSystemUser_employeeName_empName']")).sendKeys("gouse");
	    WebElement dropability =driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
	    Select drop=new Select(dropability);
	    drop.selectByIndex(2);
	    driver.findElement (By.cssSelector(".searchbutton")).click();
	    System.out.println("Title of the page:"+ driver.getTitle());
	    System.out.println("current url of the page:"+driver.getCurrentUrl());
	    System.out.println("Page source of the current url:"+driver.getPageSource());
	    
	    
	    
	    

	    
		

	}

}
