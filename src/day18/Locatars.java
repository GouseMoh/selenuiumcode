package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatars {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://automationpractice.com/index.php");
driver.manage().window().maximize();
/*//driver.findElement(By.id("search_query_top")).sendKeys("T-SHIRTS");
driver.findElement(By.className("search_query")).sendKeys("dresses");
//driver.findElement(By.id("index")).click();
driver.findElement(By.partialLinkText("Printed Dress")).click();
List<WebElement>sliders=driver.findElements(By.className("homeslider-description"));
System.out.println("Total number of slides:"+sliders.size());

List<WebElement>images=driver.findElements(By.tagName("img"));
System.out.println("Total Number Of IMAGES:"+images.size());
List<WebElement>Links=driver.findElements(By.tagName("a"));
System.out.println("Total number  of links:"+Links.size());

//driver.quit();*/

//driver.findElement(By.cssSelector("Input#search_query_top"));'
driver.findElement(By.cssSelector("input.search_query ")).sendKeys("DRESSSES");
driver.findElement(By.cssSelector("input.btn btn-default button-search")).click();





	}

}
