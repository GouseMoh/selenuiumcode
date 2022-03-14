package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConstomizedLocators {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	
	
	
	//driver.findElement(By.cssSelector("input#search_query_top   ")).sendKeys("T-shirts");
	//driver.findElement(By.cssSelector("#search_query_top")).sendKeys("T-shirts");
	//driver.findElement(By.cssSelector("input.btn btn-default button-search")).click();
	//driver.findElement(By.cssSelector(".btn btn-default button-search")).click();
	//  driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("T-shirts");
	 // driver.findElement(By.cssSelector("[name='search_query']")).sendKeys("T-shirts");
//	driver.findElement(By.cssSelector(" .search_query [name=\"search_query\"]")).sendKeys("T-shirts");     
	driver.findElements(By.cssSelector("input.logo img-responsive"));

	}

}
