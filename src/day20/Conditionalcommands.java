package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcommands {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//is displayed() is Enabled()
driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
System.out.println("Display status:"+searchbox.isDisplayed());
System.out.println("Enable ststus:"+searchbox.isEnabled());
WebElement Usdoller=driver.findElement(By.xpath("//select[@id='customerCurrency']"));
WebElement Euro=driver.findElement(By.xpath("//select[@id='customerCurrency']"));
//System.out.println(Usdoller.isSelected());
//System.out.println(Euro .isSelected());
    Usdoller.click();
    System.out.println(Usdoller.isSelected());
    System.out.println(Euro.isSelected()); 
    Euro.click();
    System.out.println();
System.out.println(Usdoller.isSelected());
System.out.println(Euro.isSelected());


	}

}
