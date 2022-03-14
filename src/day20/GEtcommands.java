package day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GEtcommands {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://automationpractice.com/index.php");
   //System.out.println("Title name of the present url:"+ driver.getTitle());
  // System.out.println("Current url is running:"+driver.getCurrentUrl());
   System.out.println("The Html data:"+driver.getPageSource());
   
   
















	}

}
