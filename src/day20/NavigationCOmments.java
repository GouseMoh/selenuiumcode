package day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCOmments {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=  new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.nopcommerce.com/wishlist");
	driver.navigate().to("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705283629710&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_7qhce485bd_e");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
	
	
	
	
	
	
	
	}

}
