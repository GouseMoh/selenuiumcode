package day24;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowseWindow {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(10) );
	driver.get("http://opensource-demo.orangehrmlive.com/");
	System.out.println("ID of browser window:"+driver.getWindowHandle());
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String>windowsids=driver.getWindowHandles();
	
	/* List<String>windowsidsList=new ArrayList(windowsids);
      String parentwindowids=windowsidsList.get(0);
      String childwindowids=windowsidsList.get(1);
      
      driver.switchTo().window(childwindowids);
      System.out.println(driver.getTitle());
      
      driver.switchTo().window(parentwindowids);
      System.out.println(driver.getTitle());
      */
    //  OrangeHRM HR Software | Free HR Software | HRMS | HRIS
      //OrangeHRM
	 for(String window:windowsids)
	{
		String title=(driver.switchTo().window(window)).getTitle();
		if(title.equals(" OrangeHRM HR Software | Free HR Software | HRMS | HRIS"))
		{
			driver.findElement(By.xpath("//a[normalize-space()='Contact Sales']")).click();
		}
	}
		

	}
	}


