package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Quitartesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   /* driver.get("https://www.guitarcenter.com/Alvarez/Natural--Guitars.gc?N=1528#narrowSideBar#narrowSideBar");
        driver.manage().window().maximize();

        List<WebElement>linkes = driver.findElements(By.tagName("a"));                     
        System.out.println("Number of linkes:"+linkes);
    		
    	List<WebElement>images=driver.findElements(By.tagName("img"));
    	System.out.println("Number of Images:"+images);
    	
    	driver.findElements(By.xpath("//input[@id='searchTerm']")).sendKeys("Quitar");*/
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    List<WebElement>links=driver.findElements(By.tagName("a"));
	    System.out.println("Number of linkes:"+links);
	    List<WebElement>images=driver.findElements(By.tagName("img"));
	    		System.out.println("Number of images:"+images);
    		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung galaxy m31");
    		driver.findElement(By.xpath("nav-search-submit-button")).click();
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		

    
	}

}
