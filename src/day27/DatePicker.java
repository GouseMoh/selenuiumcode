package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[]agrs) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(10)) ;
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/15/2021");
	//usinglogic
	String year="1994";
	String month="july";
	String date="07";
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	while(true)
	{
		String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String years=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(mon.equals(month) && years.equals(year))
		{
			break;
		}
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Prev button
		}
		
	List<WebElement>allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));   
	//List<WebElement>allDates= driver.findElements(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//td"));      
	       for(WebElement ele:allDates)
	       {
	    	 
			String dt=ele.getText();
	    	   if(dt.equals(date))
	    	   {
	    		   ele.click();
	    		   break;
	    		   
	    	   }
	       }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	}
}
