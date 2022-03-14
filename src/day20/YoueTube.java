package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoueTube {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.youtube.com/");
//driver.findElement(By.id("search")).sendKeys("sdet");
driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sdet");
//driver.findElement(By.name("style-scope ytd-searchbox")).click();
//driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")).click();
//driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']")).click();
//driver.findElement(By.id("search-icon-legacy")).click();

		
		
		
		
	}

}
