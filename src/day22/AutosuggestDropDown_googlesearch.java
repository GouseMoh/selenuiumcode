package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropDown_googlesearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriveR.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		/*Thread.sleep(5000);
		List<WebElement> alloptions= driver.findElements(By.xpath("//li[@class=\"sbct\"]//div[@role=\"option\"]"));
		System.out.println("All options with Selnium in Google :"+alloptions.size());
		
		for(WebElement option:alloptions)
		{
			System.out.println(option.getText());
		}
		
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("selinium ide"))
			{
				option.click();
				break;
			}
		}
		driver.quit();
		*/
		
		
		
	
		
		
		
		

	}

}
