package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().window().maximize();
	
	
	WebElement  country =driver.findElement(By.xpath("//select[@class='custom-select']")) ;
	Select drocountry=new Select(country);
	//selecting elements in dropda
	//drocountry.selectByVisimbleText("Finland");
	//drocountry.selectByValue("4");
	drocountry.selectByIndex(2);
	
	//find the number of Elements 
	List<WebElement> alloptions=drocountry.getOptions();
	System.out.println(" All Options in A Dropown:"+alloptions.size());
	
	//call all the drop 
	for(int i=0;i<alloptions.size();i++)
	{
		
		System.out.println(alloptions.get(i).getText());
	}
	/*for (WebElement option :alloptions )
	{
		System.out.println(  "Number Of Text Elements:"+option.getText());
	}*/
			
	


}
}