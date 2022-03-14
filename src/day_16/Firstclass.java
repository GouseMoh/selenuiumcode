package day_16;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*1) Open Web Browser(Chrome/firefox/Edge).
2) Open URL  https://opensource-demo.orangehrmlive.com/
3) Enter username  (Admin).
4) Enter password  (admin123).  
5) Click on Login.
6) Capture title of the home page.(Actual title) 
7) Verify title of the page: OrangeHRM    (Expected)
8) close browser
*/
public class Firstclass {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe  ");
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().minimize();
		//driver.findElement(By .id("small-searchterms")).sendKeys("laptops");
		//driver.findElement(By.className("button-1 search-box-button")).click();
	
		// driver.findElements(By.linkText(" Cell phones "));
   //List<WebElement> sliders= driver.findElement(By.className("nivo-imageLink"));
   List<WebElement> sliders=driver.findElements(By.className("nivo-imageLink"));
   System.out.println("Number of slides:"+sliders.size());
   List<WebElement> linkes=driver.findElements(By.tagName("a"));
  System.out.println("Number of links:"+linkes.size());
   List<WebElement> images=driver.findElements(By.tagName("img"));
   System.out.println("Number of Images:"+images.size());
		
		
	
	}
}
