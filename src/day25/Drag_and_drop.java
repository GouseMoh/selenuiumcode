package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait (Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions act= new Actions(driver);
		WebElement Rome=driver.findElement(By.xpath("//div[@id='box6']")); //source
		WebElement Italy =driver.findElement(By.xpath("//div[@id='box106']"));//target
	    act.dragAndDrop(Rome, Italy).perform();
	  WebElement washington =driver.findElement(By.xpath("//div[@id='box3']"));
	  WebElement Unitedstates=driver.findElement(By.xpath("//div[@id='box103']"));
	  act.dragAndDrop(washington, Unitedstates).perform();
	}

}
