package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot_01 {
	public static void main(String[]args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File trgfile=new File(System.getProperty("E:\\Hyd software classes\\1.Pavan Selinium with java(6 nov 2021)\\GMG PRACTICE\\Seleniumwithjava"+"\\Screenshots\\fullpage.png"));
		FileUtils.copyFile(srcfile,trgfile);
		
		
		
		
		
	}

	
		
	}


