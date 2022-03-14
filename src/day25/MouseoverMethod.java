package day25;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MouseoverMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		 driver.get("https://demo.opencart.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Actions act=new Actions(driver);
		  WebElement desktop =driver.findElement (By.xpath("//a[normalize-space()='Desktops']"));
		  WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		 act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
		 
		
		
		List<WebElement>dropindex =driver.findElements(By.id("input-sort"));
	
		 //Select dropind = new Select(dropindex);
		 
			System.out.println("number of variable:"+dropindex.size());
		 //dropind.selectByVisibleText("Rating (Lowest)");
	     //dropind.selectByIndex(5);
	     
		 
		
		

	}


}
