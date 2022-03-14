package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.viaapp.org/");
driver.manage().window().maximize();
driver.findElement(By.className(" img.custom_logo[alt=\"Viaapp Pvt Ltd\"]"));
  //driver.findElements(By.xpath(text("Home"));
driver.findElement(By.xpath("//*[@itemscope=\"itemscope\"]")).click();
driver.findElement(By.cssSelector("li[id='menu-item-22'] a[class='menu-link']"));
List<WebElement> images =driver.findElements(By.tagName("img"));
System.out.println("Number of image in Viaapp:"+images.size());






	}


}
