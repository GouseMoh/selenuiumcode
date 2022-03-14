package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
       
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
      	driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("welcome to gowse");
      	Actions act= new Actions(driver);
      	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
      	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
      	act.keyDown(Keys.TAB).perform();
      	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

	}

}
