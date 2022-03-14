package Sunday;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Isdisplayed {

	public static void main(String[] args) {

   System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
System.out.println("Displayed status:"+searchbox.isDisplayed());
System.out.println("Enabled status:"+searchbox.isEnabled());
List<WebElement> linkes=driver.findElements(By.tagName("a"));
System.out.println("Number of linkes :"+linkes.size());


}
}
