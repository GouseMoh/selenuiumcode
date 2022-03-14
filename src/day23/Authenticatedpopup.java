package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticatedpopup {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

	driver.quit();
	}

}
