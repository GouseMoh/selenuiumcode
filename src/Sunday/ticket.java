package Sunday;

import java.time.Duration;
import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ticket {

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		System.out.println("Title of this window:"+driver.getTitle());		
		//List<WebElement> linkes = driver.findElements(By.tagName("a"));		
		//System.out.println("number of linkes :"+linkes);
driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Mohammad Gowse");
driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Gullaplli");
driver.findElement(By.xpath("//input[@id='dob']")).click();
WebElement dropdate=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
WebElement yeardrop= driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/select[2]"));
Select year =new Select(yeardrop);
Select dropda=new Select (dropdate);
dropda.selectByIndex(5);
dropda.selectByVisibleText("Jul");
year.selectByVisibleText("1994");
driver.findElement(By.xpath("//input[@id='travlastname']")).click();
driver.findElement(By.xpath("//button[normalize-space()='Done']")).click();

	
	WebElement male_rd=driver.findElement(By.xpath("//input[@id='sex_1']"));
	WebElement female_rd=driver.findElement(By.xpath("//input[@id='sex_2']"));
	
	 System.out.println(male_rd.isSelected());
	 System.out.println(female_rd.isSelected());
	 
	 
		
		
		
		Thread.sleep(5000);
        driver.close();
	}

}