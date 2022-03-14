package day23;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.manage().window().maximize();
/*driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
Alert myalert=driver.switchTo().alert();
Thread.sleep(1000);

System.out.println(myalert.getText());
myalert.sendKeys("WELCOMETO SELENIUM");
myalert.accept();
//myalert.dismiss();


//driver.quit();
 
 */


driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
Thread.sleep(5000);

//driver.switchTo().alert().dismiss();
driver.switchTo().alert().accept();
}

}
