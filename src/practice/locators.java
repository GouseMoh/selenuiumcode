package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

     public class locators {
     static WebDriver driver;
	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("input#search")).sendKeys("SDET");
		 driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")).click();
         List<WebElement>linkes = driver.findElements(By.tagName("div"));
         System.out.println("Number of  linkes :"+linkes.size());
         System.out.println("current URL:"+driver.getCurrentUrl());
         System.out.println("Page Soure:"+driver.getPageSource());
         System.out.println("Title of the Page:"+driver.getTitle());
        WebElement searchbox= driver.findElement(By.xpath("//input[@id='search']"));
        System.out.println("Displaystatus is:"+searchbox .isDisplayed());
        System.out.println("Enebled Status is:"+searchbox .isEnabled());
        
        
 	 
		// driver.close();
		 

	}

}
