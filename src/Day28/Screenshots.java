package Day28;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//Screenshot of fullpage
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File trgfile=new File(System.getProperty("user.dir")+"\\Screenshots\\sectionpage.png");
		FileUtils.copyFile(srcfile,trgfile);*/
		
		/*WebElement pageSection=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File srcfile=pageSection.getScreenshotAs(OutputType.FILE);
		File trgfile=new File(System.getProperty("user.dir")+"Screenshots\\sectionpage.png");
		FileUtils.copyFile(srcfile,trgfile);*/
		
		WebElement logosection=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File srcfile=logosection.getScreenshotAs(OutputType.FILE);
		File trgfile =new File("E:\\Hyd software classes\\1.Pavan Selinium with java(6 nov 2021)\\GMG PRACTICE\\Seleniumwithjava\\Screeenshots\\section.png");
		FileUtils.copyFile(srcfile, trgfile);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//(System.getProperty("user.dir")
		//	("E:\Hyd software classes\1.Pavan Selinium with java(6 nov 2021)\GMG PRACTICE\Seleniumwithjava\Screeenshots)"
		
	
	
	}

}
