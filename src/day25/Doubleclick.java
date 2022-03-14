package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage(). timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@ondblclick='myFunction()']")).click();
		driver.switchTo().frame("iframeResult");
		WebElement field1=driver.findElement(By.id("field1"));
		field1.clear();
		field1.sendKeys("gowse");
		WebElement buttom= driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions  act=new Actions(driver);
		act.doubleClick(buttom).perform();
		String text=driver.findElement(By.id("field2")).getAttribute("value");
		if (text.equals("gowse"))
		{
			System.out.println("Text is same");
		}
		else
		{
			System.out.println("Text is not eaquals");
		}
		
		
		
	}

		
	}
