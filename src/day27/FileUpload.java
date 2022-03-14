package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='block fs-11 mt10']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'engage w100 fl tc engage-desktop')]//div//div[contains(@class,'modal-mask')]//div[contains(@class,'animated upload-resume-modal')]//section[contains(@class,'modal-body')]//div//button[contains(@class,'line-btn')][normalize-space()='Or select file to upload']")).
		sendKeys("file:///C:/Users/HUSSAIN/Desktop/Gouse%20Gullapalli%20Resume.pdf\\Gouse Gullapalli Resume");
		
		
		//div[contains(@class,'engage w100 fl tc engage-desktop')]//div//div[contains(@class,'modal-mask')]//div[contains(@class,'animated upload-resume-modal')]//section[contains(@class,'modal-body')]//div//button[contains(@class,'line-btn')][normalize-space()='Or select file to upload']

	}

}
