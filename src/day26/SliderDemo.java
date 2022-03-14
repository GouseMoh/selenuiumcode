package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement  slider_min = driver.findElement(By.xpath("//span[1]"));
		System.out.println("Location of min slider:"+slider_min.getLocation());
		act.dragAndDropBy(slider_min, 200, 0).perform();
		System.out.println("location of the min_slider:"+slider_min.getLocation());
		act.dragAndDropBy(slider_min, 500, 0).perform();
		System.out.println("Location of the min_slider:"+slider_min.getLocation());
		
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("maximum slider location:"+max_slider.getLocation());
		act.dragAndDropBy(max_slider,-52 , 0);
		System.out.println("Present maximum Slider location:"+max_slider.getLocation().getX());
		driver.quit();

	}

}
