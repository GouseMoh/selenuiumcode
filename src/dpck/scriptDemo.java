package dpck;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scriptDemo { 
public static void main(String[] args)	{
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	JavascriptExecutor jd=(JavascriptExecutor)driver;
	String title=(String)jd.executeScript("return document.title");
	System.out.println(title);
	driver.quit();
	
	               
	//System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
}
}
