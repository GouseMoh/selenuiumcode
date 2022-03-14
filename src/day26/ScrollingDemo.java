package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	private static Object flag;

	public static void main(String[] args) throws InterruptedException {
	    
			System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		   //  WebDriver driver =new ChromeDriver();
		     ChromeDriver driver=new ChromeDriver();
		     driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		     driver.manage().window().maximize();
		     
		     JavascriptExecutor js=driver;
		    /* js.executeScript("window.scrollBy(0,300)","");
		        long value= (long)js.executeScript("return window.pageYOffset;");
		     System.out.println("Number of Pixels:"+value);
		     
		     */
		     /* WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of Brazil']"));
		     js.executeScript("arguments[0].scrollIntoView();",flag);
		     long value=(long)js.executeScript("return window.pageYOffset;");
		     System.out.println("Number of pixels moved:"+value);
		     */
		     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		     double value=(double)js.executeScript("return window.pageYOffset;");
		     System.out.println("Nnumber of pixels moved:"+value);
		     
		     Thread.sleep(5000);
		     js.executeScript("window.scrollBy(0,-document.body.scrollheight)");
		     
		     driver.quit();
		
		     
		     
		     
		     
		     
			
	}

}
