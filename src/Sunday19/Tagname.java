package Sunday19;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
 
  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver= new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://www.amazon.in/");
  driver.manage().window().maximize();
  List<WebElement>sliders=driver.findElements(By.className("a-carousel-card"));
  System.out.println("No.of slider:"+sliders);
  
 List<WebElement>links =driver.findElements(By.tagName("li"));
 System.out.println("Number of Linkes :"+links);
	}

}
