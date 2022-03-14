package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handledropdownwithoutselect {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe ");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.opencart.com/index.php?route=account/register");
driver.manage().window().maximize();
List<WebElement>alloption=driver.findElements(By.xpath("//select[@id='input-country']"));


	}

}
