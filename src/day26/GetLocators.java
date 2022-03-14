package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocators {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement  logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
System.out.println("location of the site logo:"+logo.getLocation());
System.out.println("location only on x:"+logo.getLocation().getX());
System.out.println("Location only on y:"+logo.getLocation().getY());

WebElement poster=driver.findElement(By.xpath("//span[@id='glow-ingress-line1']"));
System.out.println("Location of the poster:"+poster.getLocation().getX());

	}

}
//C:\\Drivers\\chromedriver_win32\\chromedriver.exe