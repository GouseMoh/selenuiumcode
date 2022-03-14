package Sunday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.xpath("//select[@id='customerCurrency']"));
		System.out.println("Display status:"+searchbox.isDisplayed());
		System.out.println("Enables status:"+searchbox.isEnabled());
		


	}

}
