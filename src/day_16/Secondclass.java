package day_16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Secondclass {

	public static void main(String[] args) {
//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
//ChromeDriver driver=new ChromeDriver();

//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
//ChromeDriver driver=new ChromeDriver(); 

		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705283629710&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("htc mobiles ");
	     driver.findElement(By.id("nav-search-submit-button")).click();
      	List<WebElement> images=driver.findElements(By.tagName("img"));
      	System.out.println("Images in amazon:"+images.size());
      	
      	
      	
      	

	}

}
