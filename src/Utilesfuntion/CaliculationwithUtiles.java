package Utilesfuntion;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaliculationwithUtiles {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	   driver.manage().window().maximize();
	   String path=("E:\\sselenium\\caldata1.xlsx");
	    //to get the rows
	   int rows=XLUtils.getRowCount(path,"sheet1");
	   for(int r=0;r<=rows;r++)
	   {
		String princ =XLUtils.getCellData(path,"Sheet1", r, 0);
		String Rateofinters =XLUtils.getCellData(path,"Sheet1", r, 1);
		String per1 =XLUtils.getCellData(path,"Sheet1", r, 2);
		String per2 =XLUtils.getCellData(path,"Sheet1", r, 3);
		String frequency = XLUtils.getCellData(path,"Sheet1", r, 4);
		   String Expected = XLUtils.getCellData(path,"Sheet1", r, 5);
		   driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
		   driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(Rateofinters);
		   driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
		   Select perdrop=new Select(driver.findElement(By.id("tenurePeriod")));
		   perdrop.selectByVisibleText(per2);
		   Select fredrop=new Select(driver.findElement (By.id("frequency")));
		   fredrop.selectByVisibleText(frequency);
		   driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']")).click();
		   String act_value =driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
		   ////*[@id='resp_matval']/strong
		   if(Double.parseDouble(Expected)==Double.parseDouble(act_value))
				   {
			   System.out.println("Test is passed");
			   XLUtils.setCellData(path,"sheet1", r, 7, "passed");
			   XLUtils.fillGreenColor(path,"sheet1", r, 7);
				   }
			   else
			   {
				 System.out.println("Test  is Failed "); 
				  XLUtils.setCellData(path,"sheet1", r, 7, "failed");
				 XLUtils.fillRedColor(path,"sheet1", r,7);
			   }
		   Thread.sleep(10);
		   driver.findElement(By.xpath("//img[@class='PL5']")).click();
	   }
	  driver.close();
			   
			   
			   
			   
				   }
		   
		   
   }
	
	
	
	
	
	
	

/*else
{
	System.out.println("Test failed...");
	XLUtils.setCellData(path, "Sheet1", r, 7,"Failed");
	XLUtils.fillRedColor(path, "Sheet1",r,7);
	
}
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@class='PL5']")).click();
}

driver.close();
}

}
*/
