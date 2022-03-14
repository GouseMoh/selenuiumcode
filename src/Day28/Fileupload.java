package Day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://demo.guru99.com/test/upload/");
	driver.manage().window().maximize();
	WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
	//choosefile.click();
	Actions act= new Actions(driver);
	act.moveToElement(choosefile).doubleClick().perform();
	//Actions act= new Actions (driver);
	//act.moveToElement(choosefile).click().perform();
	//JavascriptException js = (JavascriptException)driver;
	//js.executeScript("argument[0].click();",choosefile);
	String path="E:\\sselenium\\Gouse Gullapalli Resume.pdf";
	Pattern fileInputTextBox = new Pattern(path+"filetxtbox.pdf");
	Parrern openButton=new Pattern(path+"open-+'pp0")
	
			
	
	
	
	
	
	
	
	
	
   Thread.sleep(5000);
    driver.close();
	
	}

}
