package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementvsElements {

	public static void main(String[] args) {
System.setProperty("webdriver.chroma.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://mail.google.com/mail/u/0/#inbox");

driver.findElement(By.cssSelector(".gb_8e"));



	}

}
