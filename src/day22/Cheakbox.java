package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cheakbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//select single element 
		//driver.findElement(By.id("monday")).click();
      //select multiple element
		List<WebElement> cheakboxes=driver.findElements(By.xpath("//input[@class=\"form-check-input\"and@type=\"checkbox\"]"));
		System.out.println("cheakboxes select all elements:"+cheakboxes.size());
		/*for (int i=0;i<cheakboxes.size();i++)
		{
		cheakboxes.get(i).click();
			}
	
		for (WebElement chb:cheakboxes)
		{
			chb.click();
		
		}	
		//sto select last 2cheakboxes 
		for ( int i=cheakboxes.size()-2;i<cheakboxes.size();i++)
		{
			cheakboxes.get(i).click();
		}
		*/
		// first two Elements
		/*for(int i=0;i<cheakboxes.size();i++)
		{
			if(i<2)
			{
			cheakboxes.get(i).click();
			}
		}*/
		
		Thread.sleep(1000);
		for(WebElement cheak:cheakboxes)
		{
		if (cheak.isSelected())
		{
			cheak.click();
		}
		}
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
