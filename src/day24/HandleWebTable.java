package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {
	public static void main (String[] agrs) {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//total number of rows
	int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
	 //int row=driver.findElements(By.tagName("tr")).size();
	System.out.println("Total Number Of Rows:"+rows);
	//total number of coloums
	int Coloums = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	//int col=driver.findElements(By.tagName("th")).size();
	System.out.println("Total Number Of Coloums"+ Coloums);
	//Retrive the specific row and coloum
	String value =driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[2]")).getText();
	System.out.println(value);
	String name =driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]/td[4]")).getText();
	System.out.println(name);
	//retrive all the data from the table
	for(int r=2;r<=rows;r++)
	{
		for(int c=1;c<=Coloums;c++)
		{
	value =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
	 System.out.println(value+"  ");
	
		}
	}
	//find the sum of all books
	int sum=0;
	for(int r=2;r<=rows;r++)
	{
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]" )).getText();
		sum=sum + Integer.parseInt(price);
	}
	System.out.println("Total Sum:"+sum);
	driver.close();
	
	}
	
	
	
	}
	

